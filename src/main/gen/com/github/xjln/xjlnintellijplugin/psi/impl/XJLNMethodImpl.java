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

public class XJLNMethodImpl extends ASTWrapperPsiElement implements XJLNMethod {

  public XJLNMethodImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull XJLNVisitor visitor) {
    visitor.visitMethod(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof XJLNVisitor) accept((XJLNVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public XJLNDocs getDocs() {
    return findChildByClass(XJLNDocs.class);
  }

  @Override
  @Nullable
  public XJLNGenerics getGenerics() {
    return findChildByClass(XJLNGenerics.class);
  }

  @Override
  @Nullable
  public XJLNMethodCode getMethodCode() {
    return findChildByClass(XJLNMethodCode.class);
  }

  @Override
  @Nullable
  public XJLNMethodEqual getMethodEqual() {
    return findChildByClass(XJLNMethodEqual.class);
  }

  @Override
  @Nullable
  public XJLNMethodStatement getMethodStatement() {
    return findChildByClass(XJLNMethodStatement.class);
  }

  @Override
  @Nullable
  public XJLNMethodSwitch getMethodSwitch() {
    return findChildByClass(XJLNMethodSwitch.class);
  }

  @Override
  @NotNull
  public XJLNParameterList getParameterList() {
    return findNotNullChildByClass(XJLNParameterList.class);
  }

  @Override
  @Nullable
  public XJLNType getType() {
    return findChildByClass(XJLNType.class);
  }

  @Override
  @NotNull
  public PsiElement getIdentifier() {
    return findNotNullChildByType(IDENTIFIER);
  }

}
