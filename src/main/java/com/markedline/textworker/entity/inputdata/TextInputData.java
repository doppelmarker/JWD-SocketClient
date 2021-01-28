package com.markedline.textworker.entity.inputdata;

import java.io.Serializable;
import java.util.Objects;

public class TextInputData extends AbstractInputData implements Serializable {

    private final String text;

    public TextInputData(String text) {
        this.text = text;
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
        return 0;
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
        return "StringInputData{" +
                "data='" + text + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TextInputData that = (TextInputData) o;
        return Objects.equals(text, that.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text);
    }
}
