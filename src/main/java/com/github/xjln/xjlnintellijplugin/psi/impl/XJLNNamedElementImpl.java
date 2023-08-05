package com.github.xjln.xjlnintellijplugin.psi.impl;

import com.github.xjln.xjlnintellijplugin.psi.XJLNNamedElement;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

public abstract class XJLNNamedElementImpl extends ASTWrapperPsiElement implements XJLNNamedElement {

    public XJLNNamedElementImpl(@NotNull ASTNode node) {
        super(node);
    }
}
