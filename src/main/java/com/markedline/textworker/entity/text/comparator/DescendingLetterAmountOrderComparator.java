package com.markedline.textworker.entity.text.comparator;

import com.markedline.textworker.entity.text.Word;

import java.util.Comparator;

public class DescendingLetterAmountOrderComparator implements Comparator<Word> {

    private final char givenLetter;

    public DescendingLetterAmountOrderComparator(char givenLetter) {
        this.givenLetter = givenLetter;
    }

    private int findLetterOccurrencesAmount(Word word) {
        int count = 0;
        for (int i = 0; i < word.getLength(); i++) {
            if (word.getText().charAt(i) == givenLetter)
                count++;
        }
        return count;
    }

    @Override
    public int compare(Word word1, Word word2) {
        int delta = findLetterOccurrencesAmount(word2) - findLetterOccurrencesAmount(word1);
        if (delta == 0) {
            return word1.getText().compareToIgnoreCase(word2.getText());
        }
        return delta;
    }
}
