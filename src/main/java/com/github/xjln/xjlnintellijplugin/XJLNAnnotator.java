package com.github.xjln.xjlnintellijplugin;

import com.github.xjln.xjlnintellijplugin.psi.XJLNEnum;
import com.github.xjln.xjlnintellijplugin.psi.XJLNTypes;
import com.github.xjln.xjlnintellijplugin.psi.XJLNUtil;
import com.github.xjln.xjlnintellijplugin.psi.impl.XJLNFieldImpl;
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
import java.util.List;

public class XJLNAnnotator implements Annotator {
    @Override
    public void annotate(@NotNull PsiElement element, @NotNull AnnotationHolder holder) {
        if(element instanceof XJLNUseImpl){
            List<String> use = new ArrayList<>();
            String from, as;

            if(element.getNode().findChildByType(XJLNTypes.PATH) != null){
                String path = element.getNode().findChildByType(XJLNTypes.PATH).getText();
                use.add(path.split("/")[path.split("/").length - 1]);
                from = path.substring(0, path.length() - use.get(0).length() - 1);
            }else{
                ASTNode[] children = element.getNode().getChildren(null);
                int i = 1;
                if(children[i].getText().equals("{")){
                    i++;
                    while (!children[i].getText().equals("}")){
                        use.add(children[i].getText());
                        i++;
                        if(!children[i ].getText().equals("}"))
                            i++;
                    }
                }else{
                    use.add(children[i].getText());
                    i++;
                }

                from = children[i + 1].getText();
            }

            if(element.getNode().findChildByType(XJLNTypes.KEYWORD_USE) != null){
                as = element.getLastChild().getText();
            }
        }
        /*
        if(element instanceof XJLNFieldImpl){
            List<XJLNEnum> enums = XJLNUtil.findEnums(element.getProject(), element.getText().split(" ")[0]);
            TextRange range = new TextRange(element.getTextRange().getStartOffset(), element.getTextRange().getStartOffset() + element.getText().split(" ")[0].length());
            if (enums.isEmpty()) {
                holder.newAnnotation(HighlightSeverity.ERROR, "Unresolved class")
                        .range(range)
                        .highlightType(ProblemHighlightType.LIKE_UNKNOWN_SYMBOL)
                        .create();
            } else {
                holder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                        .range(range).textAttributes(XJLNSyntaxHighlighter.IDENTIFIER).create();
            }
        }
         */
    }
}
