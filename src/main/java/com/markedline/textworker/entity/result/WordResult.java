package com.markedline.textworker.entity.result;

import com.markedline.textworker.entity.text.Word;

import java.io.Serializable;
import java.util.Objects;

public class WordResult extends AbstractResult implements Serializable {

    private final Word word;

    public WordResult(Word word) {
        this.word = word;
    }

    @Override
    public String getResult() {
        return toString();
    }

    @Override
    public String toString() {
        return word.getText();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WordResult that = (WordResult) o;
        return Objects.equals(word, that.word);
    }

    @Override
    public int hashCode() {
        return Objects.hash(word);
    }
}
