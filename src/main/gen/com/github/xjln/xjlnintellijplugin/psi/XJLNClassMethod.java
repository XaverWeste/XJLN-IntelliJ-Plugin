// This is a generated file. Not intended for manual editing.
package com.github.xjln.xjlnintellijplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface XJLNClassMethod extends PsiElement {

  @Nullable
  XJLNDocs getDocs();

  @Nullable
  XJLNGenerics getGenerics();

  @Nullable
  XJLNMethodCode getMethodCode();

  @Nullable
  XJLNMethodEqual getMethodEqual();

  @Nullable
  XJLNMethodStatement getMethodStatement();

  @Nullable
  XJLNMethodSwitch getMethodSwitch();

  @NotNull
  XJLNParameterList getParameterList();

  @Nullable
  XJLNType getType();

  @Nullable
  PsiElement getIdentifier();

  @Nullable
  PsiElement getOperator();

}