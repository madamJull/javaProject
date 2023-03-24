package org.example.seminar_5.hw_1;

import java.util.HashMap;

import java.util.Map;

/**
 * Подсчитать количество вхождения каждого слова
 * Пример:
 * Россия идет вперед всей планеты. Планета — это не Россия.
 * toLoverCase().
 */

public class Ex1 {
    public static void main(String[] args) {
        String inputString = "Россия идет вперед всей планеты. Планета — это не Россия.".toLowerCase();
        Map<String, Integer> count = occurrencesWords(inputString);
        System.out.println(count);
    }
    private static Map<String, Integer> occurrencesWords(String inputString) {
        Map<String, Integer> count = new HashMap<>();
        for (String longWord : inputString.split(" ")) {
            String word = longWord.replaceAll("[^А-Яа-яЁё]","");
            if (word.isEmpty()) continue;
            Integer i = count.get(word);
            if (i == null) i = 0;
            count.put(word, ++i);
        }
        return count;
    }
}
