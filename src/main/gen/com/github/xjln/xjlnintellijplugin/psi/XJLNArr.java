// This is a generated file. Not intended for manual editing.
package com.github.xjln.xjlnintellijplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface XJLNArr extends PsiElement {

  @NotNull
  List<XJLNCalc> getCalcList();

  @Nullable
  XJLNDatatype getDatatype();

  @NotNull
  List<XJLNValue> getValueList();

}
