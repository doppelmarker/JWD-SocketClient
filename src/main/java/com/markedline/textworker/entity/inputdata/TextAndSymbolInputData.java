package com.markedline.textworker.entity.inputdata;

import java.io.Serializable;
import java.util.Objects;

public class TextAndSymbolInputData extends AbstractInputData implements Serializable {

    private final String text;

    private final char symbol;

    public TextAndSymbolInputData(String text, char symbol) {
        this.text = text;
        this.symbol = symbol;
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
        return symbol;
    }

    @Override
    public char getInputSecondChar() {
        return 0;
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

    @Override
    public String toString() {
        return "TextAndSymbolInputData{" +
                "text='" + text + '\'' +
                ", symbol=" + symbol +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TextAndSymbolInputData that = (TextAndSymbolInputData) o;
        return symbol == that.symbol &&
                Objects.equals(text, that.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, symbol);
    }
}
