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

public class XJLNTypeImpl extends ASTWrapperPsiElement implements XJLNType {

  public XJLNTypeImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull XJLNVisitor visitor) {
    visitor.visitType(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof XJLNVisitor) accept((XJLNVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public XJLNArrayType getArrayType() {
    return findChildByClass(XJLNArrayType.class);
  }

  @Override
  @Nullable
  public XJLNComplexType getComplexType() {
    return findChildByClass(XJLNComplexType.class);
  }

  @Override
  @Nullable
  public XJLNPrimitiveType getPrimitiveType() {
    return findChildByClass(XJLNPrimitiveType.class);
  }

}
