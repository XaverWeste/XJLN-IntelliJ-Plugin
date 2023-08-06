// This is a generated file. Not intended for manual editing.
package com.github.xjln.xjlnintellijplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface XJLNMethod extends PsiElement {

  @Nullable
  XJLNCalc getCalc();

  @NotNull
  XJLNDocs getDocs();

  @Nullable
  XJLNParameterList getParameterList();

  @NotNull
  List<XJLNStatement> getStatementList();

}
