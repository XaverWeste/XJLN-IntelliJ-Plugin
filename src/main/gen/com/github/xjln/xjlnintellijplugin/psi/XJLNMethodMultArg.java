// This is a generated file. Not intended for manual editing.
package com.github.xjln.xjlnintellijplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface XJLNMethodMultArg extends PsiElement {

  @Nullable
  XJLNMethodLong getMethodLong();

  @Nullable
  XJLNMethodShort getMethodShort();

  @NotNull
  List<XJLNValue> getValueList();

  @Nullable
  PsiElement getNewLine();

}
