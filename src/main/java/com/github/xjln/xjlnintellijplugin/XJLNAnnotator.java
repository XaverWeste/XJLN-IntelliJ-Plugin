package com.github.xjln.xjlnintellijplugin;

import com.github.xjln.xjlnintellijplugin.psi.XJLNEnum;
import com.github.xjln.xjlnintellijplugin.psi.XJLNUtil;
import com.github.xjln.xjlnintellijplugin.psi.impl.XJLNFieldImpl;
import com.intellij.codeInspection.ProblemHighlightType;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class XJLNAnnotator implements Annotator {
    @Override
    public void annotate(@NotNull PsiElement element, @NotNull AnnotationHolder holder) {
        System.out.println(element.getText());
        System.out.println(element.getClass() + "\n");

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
    }
}
