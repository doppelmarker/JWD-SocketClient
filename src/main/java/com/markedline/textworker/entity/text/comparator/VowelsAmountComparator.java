package com.markedline.textworker.entity.text.comparator;

import com.markedline.textworker.entity.text.Word;

import java.util.Comparator;

public class VowelsAmountComparator implements Comparator<Word> {

    private final char[] vowels = {
            'а', 'е', 'ё', 'и',
            'о', 'у', 'ы', 'э',
            'ю', 'я', 'a', 'e',
            'i', 'o', 'u', 'y'
    };

    private boolean isVowel(char c) {
        for (char ch : vowels) {
            if (c == ch) return true;
        }
        return false;
    }

    private int getVowelsAmount(Word word) {
        String wordText = word.getText().toLowerCase();
        int count = 0;
        if (wordText.length() > 0) {
            for (int i = 0; i < wordText.length(); i++) {
                count += (isVowel(wordText.charAt(i)) ? 1 : 0);
            }
        }
        return count;
    }

    private float getVowelsWeight(Word word) {
        return (float)getVowelsAmount(word) / word.getLength();
    }

    @Override
    public int compare(Word word1, Word word2) {
        float vowelsWeight1 = getVowelsWeight(word1);
        float vowelsWeight2 = getVowelsWeight(word2);
        return Float.compare(vowelsWeight1, vowelsWeight2);
    }
}
