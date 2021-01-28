package com.markedline.textworker.entity.inputdata;

import java.io.Serializable;

public class TextAndTwoSymbolsInputData extends AbstractInputData implements Serializable {

    private final String text;

    private final char firstSymbol;

    private final char secondSymbol;

    public TextAndTwoSymbolsInputData(String text, char firstSymbol, char secondSymbol) {
        this.text = text;
        this.firstSymbol = firstSymbol;
        this.secondSymbol = secondSymbol;
    }

    @Override
    public String getInputText() {
        return text;
    }

    @Override
    public int getInputLength() {
        return 0;
    }

    @Override
    public char getInputFirstChar() {
        return firstSymbol;
    }

    @Override
    public char getInputSecondChar() {
        return secondSymbol;
    }

    @Override
    public String getInputWordlist() {
        return null;
    }

    @Override
    public int getInputNumber() {
        return 0;
    }

    @Override
    public String getInputString() {
        return null;
    }
}
