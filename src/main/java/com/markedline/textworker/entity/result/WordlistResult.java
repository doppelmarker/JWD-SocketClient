package com.markedline.textworker.entity.result;

import com.markedline.textworker.entity.text.Word;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class WordlistResult extends AbstractResult implements Serializable {

    private final List<Word> words;

    public WordlistResult(List<Word> words) {
        this.words = words;
    }

    @Override
    public String getResult() {
        return toString();
    }

    @Override
    public String toString() {
        StringBuilder wordlist = new StringBuilder();

        final String WHITESPACE = " ";

        int i = 0;
        while (i < words.size()) {
            wordlist.append(words.get(i).getText());
            if (i < words.size() - 1)
                wordlist.append(WHITESPACE);
            i++;
        }

        return wordlist.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WordlistResult that = (WordlistResult) o;
        return Objects.equals(words, that.words);
    }

    @Override
    public int hashCode() {
        return Objects.hash(words);
    }
}
