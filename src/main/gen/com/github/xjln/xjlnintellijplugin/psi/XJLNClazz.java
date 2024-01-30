// This is a generated file. Not intended for manual editing.
package com.github.xjln.xjlnintellijplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface XJLNClazz extends PsiElement {

  @NotNull
  List<XJLNAbstractMethod> getAbstractMethodList();

  @Nullable
  XJLNAccessModifier getAccessModifier();

  @NotNull
  XJLNClazzName getClazzName();

  @Nullable
  XJLNContains getContains();

  @Nullable
  XJLNExtends getExtends();

  @NotNull
  List<XJLNField> getFieldList();

  @Nullable
  XJLNGenerics getGenerics();

  @Nullable
  XJLNImplements getImplements();

  @NotNull
  List<XJLNInit> getInitList();

  @NotNull
  List<XJLNMethod> getMethodList();

}
