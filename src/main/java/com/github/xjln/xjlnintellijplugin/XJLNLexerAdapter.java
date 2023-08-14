package com.github.xjln.xjlnintellijplugin;

import com.intellij.lexer.FlexAdapter;

public class XJLNLexerAdapter extends FlexAdapter {

    public XJLNLexerAdapter(){
        super(new _XJLNLexer(null));
    }
}
