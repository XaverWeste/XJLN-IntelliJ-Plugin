package com.github.xjln.xjlnintellijplugin.psi;

import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

public interface XJLNProperty extends XJLNNamedElement {

    String getKey();

    String getValue();

    String getName();

    PsiElement setName(@NotNull String newName);

    PsiElement getNameIdentifier();

    ItemPresentation getPresentation();
}
