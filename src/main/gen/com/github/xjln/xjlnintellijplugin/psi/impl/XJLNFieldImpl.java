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

public class XJLNFieldImpl extends ASTWrapperPsiElement implements XJLNField {

  public XJLNFieldImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull XJLNVisitor visitor) {
    visitor.visitField(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof XJLNVisitor) accept((XJLNVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public XJLNAccessModifier getAccessModifier() {
    return findChildByClass(XJLNAccessModifier.class);
  }

  @Override
  @NotNull
  public List<XJLNClassName> getClassNameList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, XJLNClassName.class);
  }

  @Override
  @NotNull
  public XJLNDatatype getDatatype() {
    return findNotNullChildByClass(XJLNDatatype.class);
  }

  @Override
  @Nullable
  public XJLNValue getValue() {
    return findChildByClass(XJLNValue.class);
  }

  @Override
  @NotNull
  public PsiElement getIdentifier() {
    return findNotNullChildByType(IDENTIFIER);
  }

}
