package com.github.xjln.xjlnintellijplugin.psi;

import com.github.xjln.xjlnintellijplugin.XJLNLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class XJLNElementType extends IElementType {

    public XJLNElementType(@NotNull @NonNls String debugName) {
        super(debugName, XJLNLanguage.INSTANCE);
    }
}
