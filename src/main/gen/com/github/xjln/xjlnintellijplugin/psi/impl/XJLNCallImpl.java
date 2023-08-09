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

public class XJLNCallImpl extends ASTWrapperPsiElement implements XJLNCall {

  public XJLNCallImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull XJLNVisitor visitor) {
    visitor.visitCall(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof XJLNVisitor) accept((XJLNVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public XJLNArrCreation getArrCreation() {
    return findChildByClass(XJLNArrCreation.class);
  }

  @Override
  @NotNull
  public List<XJLNMethodCall> getMethodCallList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, XJLNMethodCall.class);
  }

  @Override
  @Nullable
  public XJLNObjCreation getObjCreation() {
    return findChildByClass(XJLNObjCreation.class);
  }

  @Override
  @NotNull
  public List<XJLNVarCall> getVarCallList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, XJLNVarCall.class);
  }

}
