package com.markedline.textworker.entity.text;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Sentence implements Serializable {

    private List<Word> words;
    private Delimiter delimiter;

    public Sentence(List<Word> words, Delimiter delimiter) {
        this.words = words;
        this.delimiter = delimiter;
    }

    public Sentence() {
    }

    public Delimiter getDelimiter() {
        return delimiter;
    }

    public void setDelimiter(String delimiter) {
        switch (delimiter) {
            case "." -> this.delimiter = Delimiter.DOT;
            case "!" -> this.delimiter = Delimiter.EXCLAMATION;
            case "?" -> this.delimiter = Delimiter.QUESTION;
            default -> throw new IllegalStateException("Incorrect delimiter!");
        }

    }

    public List<Word> getWords() {
        return words;
    }

    public void setWords(List<Word> words) {
        this.words = words;
    }

    @Override
    public String toString() {
        StringBuilder sentence = new StringBuilder();

        final String WHITESPACE = " ";

        int i = 0;
        while (i < words.size()) {
            sentence.append(words.get(i));
            if (i < words.size() - 1)
                sentence.append(WHITESPACE);
            i++;
        }

        return sentence.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sentence sentence = (Sentence) o;
        return Objects.equals(words, sentence.words) &&
                delimiter == sentence.delimiter;
    }

    @Override
    public int hashCode() {
        return Objects.hash(words, delimiter);
    }
}
