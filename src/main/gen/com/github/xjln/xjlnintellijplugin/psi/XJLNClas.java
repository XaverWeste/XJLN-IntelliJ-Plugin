// This is a generated file. Not intended for manual editing.
package com.github.xjln.xjlnintellijplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface XJLNClas extends PsiElement {

  @NotNull
  XJLNDocs getDocs();

  @Nullable
  XJLNMethodCall getMethodCall();

  @NotNull
  List<XJLNObjectCreation> getObjectCreationList();

  @Nullable
  XJLNParameterList getParameterList();

  @NotNull
  List<XJLNStatement> getStatementList();

  @NotNull
  PsiElement getIdentifier();

}
