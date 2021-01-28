package com.markedline.textworker.entity.inputdata;

import java.io.Serializable;
import java.util.Objects;

public class TextAndLengthInputData extends AbstractInputData implements Serializable {

    private final String text;

    private final int length;

    public TextAndLengthInputData(String text, int length) {
        this.text = text;
        this.length = length;
    }

    @Override
    public String getInputText() {
        return text;
    }

    @Override
    public int getInputLength() {
        return length;
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
        return "MixedInputData{" +
                "text='" + text + '\'' +
                ", length=" + length +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TextAndLengthInputData that = (TextAndLengthInputData) o;
        return length == that.length &&
                Objects.equals(text, that.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, length);
    }
}
