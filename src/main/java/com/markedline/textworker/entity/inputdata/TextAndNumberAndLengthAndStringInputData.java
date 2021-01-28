package com.markedline.textworker.entity.inputdata;

import java.io.Serializable;
import java.util.Objects;

public class TextAndNumberAndLengthAndStringInputData extends AbstractInputData implements Serializable {

    private final String text;

    private final int number;

    private final int length;

    private final String string;

    public TextAndNumberAndLengthAndStringInputData(String text, int number, int length, String string) {
        this.text = text;
        this.number = number;
        this.length = length;
        this.string = string;
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
        return number;
    }

    @Override
    public String getInputString() {
        return string;
    }

    @Override
    public String toString() {
        return "TextAndNumberAndLengthAndStringInputData{" +
                "text='" + text + '\'' +
                ", number=" + number +
                ", length=" + length +
                ", string='" + string + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TextAndNumberAndLengthAndStringInputData that = (TextAndNumberAndLengthAndStringInputData) o;
        return number == that.number &&
                length == that.length &&
                Objects.equals(text, that.text) &&
                Objects.equals(string, that.string);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, number, length, string);
    }
}
