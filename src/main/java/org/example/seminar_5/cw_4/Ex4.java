package org.example.seminar_5.cw_4;

import java.util.Map;

import java.util.HashMap;

/**
 * Написать перевод из Римских цифр в арабские:
 * I 1
 * V 5
 * X 10
 * L 50
 * C 100
 * D 500
 * M 1000
 */
public class Ex4 {
    public static void main(String[] args) {
        Map<Character, Integer> transMap = new HashMap<>();
        transMap.put('I', 1);
        transMap.put('V', 5);
        transMap.put('X', 10);
        transMap.put('L', 50);
        transMap.put('C', 100);
        transMap.put('D', 500);
        transMap.put('M', 1000);
        String string = "LVIIX";
        int res = transMap.get(string.charAt(string.length() - 1));
        for (int i = 0; i < string.length() - 1; i++) {
            if (transMap.get(string.charAt(i)) < transMap.get(string.charAt(i + 1))){
                res -= transMap.get(string.charAt(i));
            }
            else{
                res += transMap.get(string.charAt(i));
            }
        }
        System.out.println(res);
    }
}
