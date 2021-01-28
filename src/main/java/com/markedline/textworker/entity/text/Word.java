package com.markedline.textworker.entity.text;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Word implements Serializable {

    private final List<Sign> precedingSigns;
    private final List<Sign> followingSigns;
    private String text;

    public Word(String text) {
        this.text = text;
        precedingSigns = new ArrayList<>();
        followingSigns = new ArrayList<>();
    }

    public Word() {
        precedingSigns = new ArrayList<>();
        followingSigns = new ArrayList<>();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getLength() {
        return text.length();
    }

    public List<Sign> getPrecedingSigns() {
        return precedingSigns;
    }

    public List<Sign> getFollowingSigns() {
        return followingSigns;
    }

    @Override
    public String toString() {
        StringBuilder word = new StringBuilder();

        for (Sign precedingSign : precedingSigns) {
            word.append(precedingSign);
        }
        word.append(text);
        for (Sign followingSign : followingSigns) {
            word.append(followingSign);
        }
        return word.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word word1 = (Word) o;
        return Objects.equals(text, word1.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text);
    }
}
