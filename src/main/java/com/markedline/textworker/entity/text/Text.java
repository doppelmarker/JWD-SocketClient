package com.markedline.textworker.entity.text;

import java.io.Serializable;
import java.util.List;

public class Text implements Serializable {

    private final List<Sentence> sentences;

    public Text(List<Sentence> sentences) {
        this.sentences = sentences;
    }

    @Override
    public String toString() {
        StringBuilder text = new StringBuilder();

        final String WHITESPACE = " ";

        int i = 0;
        while (i < sentences.size()) {
            text.append(sentences.get(i));
            if (i < sentences.size() - 1)
                text.append(WHITESPACE);
            i++;
        }

        return text.toString();
    }
}
