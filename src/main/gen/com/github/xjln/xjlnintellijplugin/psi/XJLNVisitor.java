// This is a generated file. Not intended for manual editing.
package com.github.xjln.xjlnintellijplugin.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class XJLNVisitor extends PsiElementVisitor {

  public void visitProperty(@NotNull XJLNProperty o) {
    visitNamedElement(o);
  }

  public void visitNamedElement(@NotNull XJLNNamedElement o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
