package com.github.xjln.xjlnintellijplugin;

import com.github.xjln.xjlnintellijplugin.psi.XJLNFile;
import com.github.xjln.xjlnintellijplugin.psi.XJLNTypes;
import com.github.xjln.xjlnintellijplugin.psi.impl.XJLNUseImpl;
import com.intellij.codeInspection.ProblemHighlightType;
import com.intellij.lang.ASTNode;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class XJLNAnnotator implements Annotator {
    @Override
    public void annotate(@NotNull PsiElement element, @NotNull AnnotationHolder holder) {
        if(element instanceof XJLNFile){
            PsiElement[] arguments = element.getChildren();
            Map<String, String> uses = new HashMap<>();

            for(PsiElement argument:arguments)
                if (argument instanceof XJLNUseImpl)
                    annotateUse(argument, holder, uses);
        }
    }

    private void annotateUse(@NotNull PsiElement element, @NotNull AnnotationHolder holder, Map<String, String> uses){
        ASTNode[] children = deleteWhitespace(element.getNode().getChildren(null));

        if(children[1].getElementType() == XJLNTypes.PATH) {
            String path = children[1].getText().replace("/", ".");

            try {
                Class.forName(path);
            } catch (ClassNotFoundException ignored) {
                holder.newAnnotation(HighlightSeverity.ERROR, "Unsolved class").range(children[1])
                        .highlightType(ProblemHighlightType.ERROR).create();
            }

            if(uses.containsValue(path)){
                holder.newAnnotation(HighlightSeverity.WARNING, "Class is already used").range(children[1])
                        .highlightType(ProblemHighlightType.WARNING).create();
            }

            if (children.length > 2) {
                if(uses.containsKey(children[3].getText()))
                    holder.newAnnotation(HighlightSeverity.WARNING, "Alias is already uses").range(children[3])
                            .highlightType(ProblemHighlightType.WARNING).create();
                else
                    uses.put(children[3].getText(), path);
            }else{
                String as = path.substring(path.length() - path.split("/")[path.split("/").length - 1].length());
                if(uses.containsKey(as))
                    holder.newAnnotation(HighlightSeverity.WARNING, "Alias is already used")
                            .range(new TextRange(children[1].getTextRange().getEndOffset() - as.length(), children[1].getTextRange().getEndOffset()))
                            .highlightType(ProblemHighlightType.WARNING).create();
                else
                    uses.put(as, path);
            }
        }else{
            List<Integer> useElements = new ArrayList<>();
            int i = 1;
            if(children[i].getText().equals("{")){
                i++;
                while (!children[i].getText().equals("}")){
                    useElements.add(i);
                    i++;
                    if(!children[i].getText().equals("}"))
                        i++;
                }
            }else{
                useElements.add(i);
            }

            String from = children[i + 2].getText().replace("/", ".");

            if (children.length >= (i += 4)){
                String as = children[i].getText();
                if(uses.containsValue(from + "." +  children[1].getText()))
                    holder.newAnnotation(HighlightSeverity.WARNING, "Class is already used")
                            .range(children[i]).create();
                if(uses.containsKey(as))
                    holder.newAnnotation(HighlightSeverity.WARNING, "Alias is already used")
                            .range(children[i])
                            .highlightType(ProblemHighlightType.WARNING).create();
                else
                    uses.put(as, from + "." + children[1].getText());
            }else{
                for(int useElement:useElements) {
                    if (uses.containsValue(from + "." + children[useElement].getText()))
                        holder.newAnnotation(HighlightSeverity.WARNING, "Class is already used")
                                .range(children[useElement]).create();
                    if (uses.containsKey(children[useElement].getText()))
                        holder.newAnnotation(HighlightSeverity.WARNING, "Alias is already used")
                                .range(children[useElement])
                                .highlightType(ProblemHighlightType.WARNING).create();
                    else
                        uses.put(children[useElement].getText(), from + "." + children[useElement].getText());
                }
            }

            for(int useElement:useElements){
                try{
                    Class.forName(from + "." + children[useElement].getText());
                }catch (ClassNotFoundException ignored){
                    holder.newAnnotation(HighlightSeverity.ERROR, "Unsolved class").range(children[useElement])
                            .highlightType(ProblemHighlightType.ERROR).create();
                }
            }
        }
    }

    private ASTNode[] deleteWhitespace(ASTNode[] ast){
        List<ASTNode> result = new ArrayList<>();

        for(ASTNode node:ast)
            if(!node.getText().trim().equals(""))
                result.add(node);

        return result.toArray(new ASTNode[0]);
    }
}
