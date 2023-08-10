package com.github.xjln.xjlnintellijplugin.psi.impl;

import com.github.xjln.xjlnintellijplugin.psi.XJLNEnum;
import com.github.xjln.xjlnintellijplugin.psi.XJLNTypes;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;

public class XJLNPsiImplUtil {

    public static PsiElement getEnumName(XJLNEnum element) {
        ASTNode keyNode = element.getNode().findChildByType(XJLNTypes.IDENTIFIER);
        return keyNode != null ? keyNode.getPsi() : null;
    }
}
