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

public class XJLNArgumentImpl extends ASTWrapperPsiElement implements XJLNArgument {

  public XJLNArgumentImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull XJLNVisitor visitor) {
    visitor.visitArgument(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof XJLNVisitor) accept((XJLNVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public XJLNClazz getClazz() {
    return findChildByClass(XJLNClazz.class);
  }

  @Override
  @Nullable
  public XJLNData getData() {
    return findChildByClass(XJLNData.class);
  }

  @Override
  @Nullable
  public XJLNField getField() {
    return findChildByClass(XJLNField.class);
  }

  @Override
  @Nullable
  public XJLNInterface getInterface() {
    return findChildByClass(XJLNInterface.class);
  }

  @Override
  @Nullable
  public XJLNMethod getMethod() {
    return findChildByClass(XJLNMethod.class);
  }

  @Override
  @Nullable
  public XJLNType getType() {
    return findChildByClass(XJLNType.class);
  }

  @Override
  @Nullable
  public XJLNUse getUse() {
    return findChildByClass(XJLNUse.class);
  }

  @Override
  @Nullable
  public PsiElement getComment() {
    return findChildByType(COMMENT);
  }

}
