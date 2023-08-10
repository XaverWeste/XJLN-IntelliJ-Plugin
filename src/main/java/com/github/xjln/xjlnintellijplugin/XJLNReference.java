package com.github.xjln.xjlnintellijplugin;

import com.github.xjln.xjlnintellijplugin.psi.XJLNEnum;
import com.github.xjln.xjlnintellijplugin.psi.XJLNUtil;
import com.github.xjln.xjlnintellijplugin.psi.impl.XJLNPsiImplUtil;
import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class XJLNReference extends PsiReferenceBase<PsiElement> implements PsiPolyVariantReference {

    private final String key;

    public XJLNReference(@NotNull PsiElement element, TextRange textRange) {
        super(element, textRange);
        key = element.getText().substring(textRange.getStartOffset(), textRange.getEndOffset());
    }

    @Override
    public ResolveResult @NotNull [] multiResolve(boolean incompleteCode) {
        Project project = myElement.getProject();
        final List<XJLNEnum> enums = XJLNUtil.findEnums(project, key);
        List<ResolveResult> results = new ArrayList<>();
        for (XJLNEnum xjlnEnum : enums) {
            results.add(new PsiElementResolveResult(xjlnEnum));
        }
        return results.toArray(new ResolveResult[0]);
    }

    @Override
    public @Nullable PsiElement resolve() {
        ResolveResult[] resolveResults = multiResolve(false);
        return resolveResults.length == 1 ? resolveResults[0].getElement() : null;
    }
    public Object @NotNull [] getVariants() {
        Project project = myElement.getProject();
        List<XJLNEnum> enums = XJLNUtil.findEnums(project);
        List<LookupElement> variants = new ArrayList<>();
        for (final XJLNEnum xjlnEnum : enums) {
            PsiElement eenum = XJLNPsiImplUtil.getEnumName(xjlnEnum);
            if(eenum != null && eenum.getText() != null && eenum.getText().length() > 0)
                variants.add(LookupElementBuilder.create(xjlnEnum).withIcon(XJLNIcon.FILE).withTypeText(xjlnEnum.getContainingFile().getName()));
        }
        return variants.toArray();
    }

}
