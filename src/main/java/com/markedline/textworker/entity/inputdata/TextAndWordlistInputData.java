package com.markedline.textworker.entity.inputdata;

import java.io.Serializable;
import java.util.Objects;

public class TextAndWordlistInputData extends AbstractInputData implements Serializable {

    private final String text;

    private final String wordlist;

    public TextAndWordlistInputData(String text, String wordlist) {
        this.text = text;
        this.wordlist = wordlist;
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
        return wordlist;
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
        return "TextAndWordlistInputData{" +
                "text='" + text + '\'' +
                ", wordlist='" + wordlist + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TextAndWordlistInputData that = (TextAndWordlistInputData) o;
        return Objects.equals(text, that.text) &&
                Objects.equals(wordlist, that.wordlist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, wordlist);
    }
}
