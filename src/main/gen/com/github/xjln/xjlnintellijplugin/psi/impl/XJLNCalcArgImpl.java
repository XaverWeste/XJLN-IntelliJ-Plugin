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

public class XJLNCalcArgImpl extends ASTWrapperPsiElement implements XJLNCalcArg {

  public XJLNCalcArgImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull XJLNVisitor visitor) {
    visitor.visitCalcArg(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof XJLNVisitor) accept((XJLNVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public XJLNArr getArr() {
    return findChildByClass(XJLNArr.class);
  }

  @Override
  @Nullable
  public XJLNCalc getCalc() {
    return findChildByClass(XJLNCalc.class);
  }

  @Override
  @Nullable
  public XJLNCall getCall() {
    return findChildByClass(XJLNCall.class);
  }

  @Override
  @Nullable
  public XJLNValue getValue() {
    return findChildByClass(XJLNValue.class);
  }

}
