// This is a generated file. Not intended for manual editing.
package com.github.xjln.xjlnintellijplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface XJLNValue extends PsiElement {

  @Nullable
  XJLNCall getCall();

  @Nullable
  XJLNInteger getInteger();

  @Nullable
  XJLNNumber getNumber();

  @Nullable
  PsiElement getChar();

  @Nullable
  PsiElement getString();

}
