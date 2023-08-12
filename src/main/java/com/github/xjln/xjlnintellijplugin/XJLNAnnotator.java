package com.github.xjln.xjlnintellijplugin;

import com.github.xjln.xjlnintellijplugin.psi.XJLNFile;
import com.github.xjln.xjlnintellijplugin.psi.XJLNTypes;
import com.github.xjln.xjlnintellijplugin.psi.impl.XJLNUseImpl;
import com.intellij.codeInspection.ProblemHighlightType;
import com.intellij.lang.ASTNode;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class XJLNAnnotator implements Annotator {
    @Override
    public void annotate(@NotNull PsiElement element, @NotNull AnnotationHolder holder) {
        if(element instanceof XJLNUseImpl)
            annotateUse(element, holder);
        if(element instanceof XJLNFile){
            //TODO
        }
    }

    private void annotateUse(@NotNull PsiElement element, @NotNull AnnotationHolder holder){
        ASTNode[] children = deleteWhitespace(element.getNode().getChildren(null));

        if(children[1].getElementType() == XJLNTypes.PATH){
            String path = children[1].getText();

            try{
                Class.forName(path.replace("/", "."));
            }catch (ClassNotFoundException ignored){
                holder.newAnnotation(HighlightSeverity.ERROR, "Unsolved class").range(element.getNode().findChildByType(XJLNTypes.PATH))
                        .highlightType(ProblemHighlightType.ERROR).create();
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

            String from = children[i + 2].getText();

            for(int useElement:useElements){
                try{
                    Class.forName(from.replace("/", ".") + "." + children[useElement].getText());
                }catch (ClassNotFoundException ignored){
                    holder.newAnnotation(HighlightSeverity.ERROR, "Unsolved class").range(children[useElement])
                            .highlightType(ProblemHighlightType.ERROR).create();
                }
            }
        }

        //TODO as
    }

    private ASTNode[] deleteWhitespace(ASTNode[] ast){
        List<ASTNode> result = new ArrayList<>();

        for(ASTNode node:ast)
            if(!node.getText().trim().equals(""))
                result.add(node);

        return result.toArray(new ASTNode[0]);
    }
}
