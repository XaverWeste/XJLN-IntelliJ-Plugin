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

public class XJLNAbstractMethodImpl extends ASTWrapperPsiElement implements XJLNAbstractMethod {

  public XJLNAbstractMethodImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull XJLNVisitor visitor) {
    visitor.visitAbstractMethod(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof XJLNVisitor) accept((XJLNVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public XJLNParameterList getParameterList() {
    return findNotNullChildByClass(XJLNParameterList.class);
  }

  @Override
  @NotNull
  public PsiElement getNewLine() {
    return findNotNullChildByType(NEW_LINE);
  }

  @Override
  @Nullable
  public PsiElement getOpperator() {
    return findChildByType(OPPERATOR);
  }

  @Override
  @Nullable
  public PsiElement getPrimitivetype() {
    return findChildByType(PRIMITIVETYPE);
  }

}