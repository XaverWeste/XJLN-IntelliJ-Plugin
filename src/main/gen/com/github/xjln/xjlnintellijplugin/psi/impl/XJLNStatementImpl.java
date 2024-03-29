// This is a generated file. Not intended for manual editing.
package com.github.xjln.xjlnintellijplugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.xjln.xjlnintellijplugin.psi.XJLNTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.xjln.xjlnintellijplugin.psi.*;

public class XJLNStatementImpl extends ASTWrapperPsiElement implements XJLNStatement {

  public XJLNStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull XJLNVisitor visitor) {
    visitor.visitStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof XJLNVisitor) accept((XJLNVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public XJLNCalc getCalc() {
    return findChildByClass(XJLNCalc.class);
  }

  @Override
  @Nullable
  public XJLNIf getIf() {
    return findChildByClass(XJLNIf.class);
  }

  @Override
  @Nullable
  public XJLNVar getVar() {
    return findChildByClass(XJLNVar.class);
  }

  @Override
  @Nullable
  public XJLNWhile getWhile() {
    return findChildByClass(XJLNWhile.class);
  }

}
