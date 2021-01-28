package com.markedline.textworker.entity.text.comparator;

import com.markedline.textworker.entity.text.Word;

import java.util.Comparator;

public class FirstConsonantLetterAlphabeticalOrderComparator implements Comparator<Word> {

    private final char[] consonants = {
            'б', 'в', 'г', 'д',
            'ж', 'з', 'й', 'к',
            'л', 'м', 'н', 'п',
            'р', 'с', 'т', 'ф',
            'х', 'ц', 'ч', 'ш',
            'щ', 'b', 'c', 'd',
            'f', 'g', 'h', 'j',
            'k', 'l', 'm', 'n',
            'p', 'q', 'r', 's',
            't', 'v', 'w', 'x',
            'z'
    };

    private boolean isConsonant(char c) {
        for (char ch : consonants) {
            if (c == ch) return true;
        }
        return false;
    }

    private char getFirstConsonant(Word word) {
        for (int i = 0; i < word.getLength(); i++) {
            char pendingLetter = word.getText().charAt(i);
            if (isConsonant(pendingLetter))
                return pendingLetter;
        }
        // Если в слове нет согласных букв, то оно поместится в самое начало
        return 0;
    }

    @Override
    public int compare(Word word1, Word word2) {
        char firstConsonant1 = getFirstConsonant(word1);
        char firstConsonant2 = getFirstConsonant(word2);

        return Character.compare(firstConsonant1, firstConsonant2);
    }
}
