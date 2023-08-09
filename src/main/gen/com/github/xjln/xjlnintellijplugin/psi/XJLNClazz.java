// This is a generated file. Not intended for manual editing.
package com.github.xjln.xjlnintellijplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface XJLNClazz extends PsiElement {

  @NotNull
  List<XJLNAbstractMethod> getAbstractMethodList();

  @NotNull
  List<XJLNField> getFieldList();

  @NotNull
  List<XJLNInit> getInitList();

  @NotNull
  List<XJLNMethodDef> getMethodDefList();

  @NotNull
  XJLNParameterList getParameterList();

  @NotNull
  PsiElement getIdentifier();

}
