package com.github.xjln.xjlnintellijplugin.psi.impl;

import com.github.xjln.xjlnintellijplugin.psi.XJLNProperty;
import com.github.xjln.xjlnintellijplugin.psi.XJLNVisitor;
import com.intellij.lang.ASTNode;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;

public class XJLNPropertyImpl extends XJLNNamedElementImpl implements XJLNProperty {

    public XJLNPropertyImpl(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull XJLNVisitor visitor) {
        visitor.visitProperty(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof XJLNVisitor) accept((XJLNVisitor)visitor);
        else super.accept(visitor);
    }

    @Override
    public String getKey() {
        return null;//XJLNPsiImplUtil.getKey(this);
    }

    @Override
    public String getValue() {
        return null;//XJLNPsiImplUtil.getValue(this);
    }

    @Override
    public String getName() {
        return null;//XJLNPsiImplUtil.getName(this);
    }

    @Override
    public PsiElement setName(@NotNull String newName) {
        return null;//XJLNPsiImplUtil.setName(this, newName);
    }

    @Override
    public PsiElement getNameIdentifier() {
        return null;//XJLNPsiImplUtil.getNameIdentifier(this);
    }

    @Override
    public ItemPresentation getPresentation() {
        return null;//XJLNPsiImplUtil.getPresentation(this);
    }
}
