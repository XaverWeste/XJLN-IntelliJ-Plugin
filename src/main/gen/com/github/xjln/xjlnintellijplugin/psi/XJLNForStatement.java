// This is a generated file. Not intended for manual editing.
package com.github.xjln.xjlnintellijplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface XJLNForStatement extends PsiElement {

  @NotNull
  XJLNCalc getCalc();

  @NotNull
  XJLNIdentifier getIdentifier();

  @Nullable
  XJLNMethodCode getMethodCode();

  @Nullable
  XJLNMethodStatement getMethodStatement();

  @Nullable
  XJLNType getType();

}
