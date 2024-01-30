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

public class XJLNElseImpl extends ASTWrapperPsiElement implements XJLNElse {

  public XJLNElseImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull XJLNVisitor visitor) {
    visitor.visitElse(this);
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
  public XJLNElse getElse() {
    return findChildByClass(XJLNElse.class);
  }

  @Override
  @Nullable
  public XJLNStatement getStatement() {
    return findChildByClass(XJLNStatement.class);
  }

  @Override
  @Nullable
  public XJLNStatementBlock getStatementBlock() {
    return findChildByClass(XJLNStatementBlock.class);
  }

  @Override
  @Nullable
  public PsiElement getNewLine() {
    return findChildByType(NEW_LINE);
  }

}