package com.github.xjln.xjlnintellijplugin.psi;

import com.intellij.psi.tree.TokenSet;

public interface XJLNTokenSets {

    TokenSet IDENTIFIERS = TokenSet.create(XJLNTypes.IDENTIFIER);
    TokenSet INT = TokenSet.create(XJLNTypes.INT);
    TokenSet CHAR = TokenSet.create(XJLNTypes.CHAR);
    TokenSet OPPERATOR = TokenSet.create(XJLNTypes.OPPERATOR);
    TokenSet NEW_LINE = TokenSet.create(XJLNTypes.NEW_LINE);
    TokenSet COMMENT = TokenSet.create(XJLNTypes.COMMENT);
    TokenSet DOUBLE = TokenSet.create(XJLNTypes.DOUBLE);
}
