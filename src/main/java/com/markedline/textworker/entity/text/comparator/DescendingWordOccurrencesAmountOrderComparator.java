package com.markedline.textworker.entity.text.comparator;

import com.markedline.textworker.entity.text.Sentence;
import com.markedline.textworker.entity.text.Word;

import java.util.Comparator;
import java.util.List;

public class DescendingWordOccurrencesAmountOrderComparator implements Comparator<Word> {

    private final List<Sentence> sentences;

    public DescendingWordOccurrencesAmountOrderComparator(List<Sentence> sentences) {
        this.sentences = sentences;
    }

    private int findOccurrencesAmount(Word word) {
        int count = 0;
        for (Sentence sentence : sentences) {
            if (sentence.getWords().contains(word))
                count++;
        }
        return count;
    }

    @Override
    public int compare(Word word1, Word word2) {
        return findOccurrencesAmount(word2) - findOccurrencesAmount(word1);
    }
}
