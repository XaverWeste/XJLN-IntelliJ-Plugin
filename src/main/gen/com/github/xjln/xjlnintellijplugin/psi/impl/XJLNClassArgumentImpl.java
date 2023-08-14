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

public class XJLNClassArgumentImpl extends ASTWrapperPsiElement implements XJLNClassArgument {

  public XJLNClassArgumentImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull XJLNVisitor visitor) {
    visitor.visitClassArgument(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof XJLNVisitor) accept((XJLNVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public XJLNAbstractMethod getAbstractMethod() {
    return findChildByClass(XJLNAbstractMethod.class);
  }

  @Override
  @Nullable
  public XJLNClassMethod getClassMethod() {
    return findChildByClass(XJLNClassMethod.class);
  }

  @Override
  @Nullable
  public XJLNField getField() {
    return findChildByClass(XJLNField.class);
  }

  @Override
  @Nullable
  public PsiElement getComment() {
    return findChildByType(COMMENT);
  }

}
