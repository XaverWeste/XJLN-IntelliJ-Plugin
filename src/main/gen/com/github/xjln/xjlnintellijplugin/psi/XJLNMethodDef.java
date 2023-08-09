// This is a generated file. Not intended for manual editing.
package com.github.xjln.xjlnintellijplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface XJLNMethodDef extends PsiElement {

  @Nullable
  XJLNMethodCode getMethodCode();

  @Nullable
  XJLNMethodDefMulti getMethodDefMulti();

  @Nullable
  XJLNMethodEquals getMethodEquals();

  @Nullable
  XJLNMethodShort getMethodShort();

  @NotNull
  XJLNParameterList getParameterList();

  @Nullable
  PsiElement getNewLine();

  @Nullable
  PsiElement getOpperator();

  @Nullable
  PsiElement getPrimitivetype();

}
