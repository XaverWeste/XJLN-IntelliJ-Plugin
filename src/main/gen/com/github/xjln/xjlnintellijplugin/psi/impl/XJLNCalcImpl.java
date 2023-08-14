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

public class XJLNCalcImpl extends ASTWrapperPsiElement implements XJLNCalc {

  public XJLNCalcImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull XJLNVisitor visitor) {
    visitor.visitCalc(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof XJLNVisitor) accept((XJLNVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<XJLNCalcArg> getCalcArgList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, XJLNCalcArg.class);
  }

  @Override
  @NotNull
  public List<XJLNOperators> getOperatorsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, XJLNOperators.class);
  }

}
