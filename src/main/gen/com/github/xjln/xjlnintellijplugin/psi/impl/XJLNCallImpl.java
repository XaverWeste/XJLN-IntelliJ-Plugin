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
  @NotNull
  public List<XJLNCalc> getCalcList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, XJLNCalc.class);
  }

  @Override
  @NotNull
  public List<XJLNCallArg> getCallArgList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, XJLNCallArg.class);
  }

  @Override
  @NotNull
  public List<XJLNClassName> getClassNameList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, XJLNClassName.class);
  }

  @Override
  @Nullable
  public PsiElement getIdentifier() {
    return findChildByType(IDENTIFIER);
  }

}
