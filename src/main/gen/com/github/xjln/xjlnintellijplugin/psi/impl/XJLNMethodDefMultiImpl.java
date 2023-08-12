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

public class XJLNMethodDefMultiImpl extends ASTWrapperPsiElement implements XJLNMethodDefMulti {

  public XJLNMethodDefMultiImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull XJLNVisitor visitor) {
    visitor.visitMethodDefMulti(this);
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
  public List<XJLNMethodCode> getMethodCodeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, XJLNMethodCode.class);
  }

  @Override
  @NotNull
  public List<XJLNMethodEquals> getMethodEqualsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, XJLNMethodEquals.class);
  }

  @Override
  @NotNull
  public List<XJLNMethodShort> getMethodShortList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, XJLNMethodShort.class);
  }

}