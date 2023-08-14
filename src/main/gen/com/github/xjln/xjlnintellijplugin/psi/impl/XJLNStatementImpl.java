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
  public XJLNForStatement getForStatement() {
    return findChildByClass(XJLNForStatement.class);
  }

  @Override
  @Nullable
  public XJLNIfStatement getIfStatement() {
    return findChildByClass(XJLNIfStatement.class);
  }

  @Override
  @Nullable
  public XJLNReturnStatement getReturnStatement() {
    return findChildByClass(XJLNReturnStatement.class);
  }

  @Override
  @Nullable
  public XJLNVar getVar() {
    return findChildByClass(XJLNVar.class);
  }

  @Override
  @Nullable
  public XJLNWhileStatement getWhileStatement() {
    return findChildByClass(XJLNWhileStatement.class);
  }

  @Override
  @Nullable
  public PsiElement getComment() {
    return findChildByType(COMMENT);
  }

}
