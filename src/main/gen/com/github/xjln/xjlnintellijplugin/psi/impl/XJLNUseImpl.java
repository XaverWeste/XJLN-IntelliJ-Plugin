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

public class XJLNUseImpl extends ASTWrapperPsiElement implements XJLNUse {

  public XJLNUseImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull XJLNVisitor visitor) {
    visitor.visitUse(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof XJLNVisitor) accept((XJLNVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public XJLNMultiUse getMultiUse() {
    return findChildByClass(XJLNMultiUse.class);
  }

  @Override
  @Nullable
  public XJLNSingleUse getSingleUse() {
    return findChildByClass(XJLNSingleUse.class);
  }

  @Override
  @Nullable
  public XJLNUseFromPath getUseFromPath() {
    return findChildByClass(XJLNUseFromPath.class);
  }

}
