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

public class XJLNInitImpl extends ASTWrapperPsiElement implements XJLNInit {

  public XJLNInitImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull XJLNVisitor visitor) {
    visitor.visitInit(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof XJLNVisitor) accept((XJLNVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public XJLNMethodLong getMethodLong() {
    return findChildByClass(XJLNMethodLong.class);
  }

  @Override
  @Nullable
  public XJLNMethodShort getMethodShort() {
    return findChildByClass(XJLNMethodShort.class);
  }

  @Override
  @Nullable
  public XJLNParameterlist getParameterlist() {
    return findChildByClass(XJLNParameterlist.class);
  }

}
