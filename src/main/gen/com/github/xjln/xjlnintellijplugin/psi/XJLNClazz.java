// This is a generated file. Not intended for manual editing.
package com.github.xjln.xjlnintellijplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface XJLNClazz extends PsiElement {

  @NotNull
  List<XJLNClassArgument> getClassArgumentList();

  @Nullable
  XJLNDocs getDocs();

  @Nullable
  XJLNGenerics getGenerics();

  @Nullable
  XJLNInit getInit();

  @NotNull
  List<XJLNObjectCreation> getObjectCreationList();

  @NotNull
  XJLNParameterList getParameterList();

}
