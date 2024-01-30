// This is a generated file. Not intended for manual editing.
package com.github.xjln.xjlnintellijplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface XJLNField extends PsiElement {

  @Nullable
  XJLNAccessModifier getAccessModifier();

  @NotNull
  List<XJLNClassName> getClassNameList();

  @NotNull
  XJLNDatatype getDatatype();

  @Nullable
  XJLNValue getValue();

  @NotNull
  PsiElement getIdentifier();

}
