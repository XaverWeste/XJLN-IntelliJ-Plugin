// This is a generated file. Not intended for manual editing.
package com.github.xjln.xjlnintellijplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface XJLNStatement extends PsiElement {

  @Nullable
  XJLNCalc getCalc();

  @Nullable
  XJLNIf getIf();

  @Nullable
  XJLNVar getVar();

  @Nullable
  XJLNWhile getWhile();

}
