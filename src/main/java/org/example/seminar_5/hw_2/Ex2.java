package org.example.seminar_5.hw_2;

import java.net.Inet4Address;

import java.util.HashMap;

import java.util.Map;

/**
 *  Подсчитать количество искомого слова, через map (наполнением значение, где искомое слово будет являться ключом), вносить все слова не нужно
 */
public class Ex2 {
    public static void main(String[] args) {
        String inputString = "Яблоко упало на голову Ньютона, и Ньютон открыл закон всемирного тяготения".toLowerCase();
        String searchWord = "Ньютон".toLowerCase();
        Integer count = searchWord(inputString, searchWord);
        System.out.println(searchWord + ": " + count);

    }
    private static Integer searchWord(String inputString, String searchWord) {
        Map<String, Integer> count = new HashMap<>();
        for (String longWord : inputString.split(" ")) {
            String word = longWord.replaceAll("[^А-Яа-яЁё]", "");
            if (word.equals(searchWord)) {
                Integer i = count.get(word);
                if (i == null) i = 0;
                count.put(word, ++i);
            }
        }
        return count.get(searchWord);
    }
}
