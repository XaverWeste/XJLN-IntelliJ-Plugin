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

public class XJLNMethodMultArgImpl extends ASTWrapperPsiElement implements XJLNMethodMultArg {

  public XJLNMethodMultArgImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull XJLNVisitor visitor) {
    visitor.visitMethodMultArg(this);
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
  @NotNull
  public List<XJLNValue> getValueList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, XJLNValue.class);
  }

  @Override
  @Nullable
  public PsiElement getNewLine() {
    return findChildByType(NEW_LINE);
  }

}
