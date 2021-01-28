package com.markedline.textworker.entity.text.comparator;

import com.markedline.textworker.entity.text.Word;

import java.util.Comparator;

public class FirstLetterAlphabeticalOrderComparator implements Comparator<Word> {
    @Override
    public int compare(Word word1, Word word2) {
        //return word1.getText().compareToIgnoreCase(word2.getText());
        //Сортировка по первой букве (с игнорированием регистра)
        char firstLetter1 = word1.getText().charAt(0);
        char firstLetter2 = word2.getText().charAt(0);

        return Character.compare(Character.toLowerCase(firstLetter1), Character.toLowerCase(firstLetter2));
    }
}
