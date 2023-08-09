// This is a generated file. Not intended for manual editing.
package com.github.xjln.xjlnintellijplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface XJLNCall extends PsiElement {

  @Nullable
  XJLNArrCreation getArrCreation();

  @NotNull
  List<XJLNMethodCall> getMethodCallList();

  @Nullable
  XJLNObjCreation getObjCreation();

  @NotNull
  List<XJLNVarCall> getVarCallList();

}
