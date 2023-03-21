package org.example.seminar_4.hw_2;

import java.util.Deque;

import java.util.LinkedList;

/**
 * Учитывая строку s, содержащую только символы '(', ')', '{', и , определите '}', допустима ли входная строка.'['']'
 * * Входная строка действительна, если:
 * * Открытые скобки должны быть закрыты однотипными скобками.
 * Открытые скобки должны быть закрыты в правильном порядке.
 * Каждой закрывающей скобке соответствует открытая скобка того же типа.
 */
public class Ex2 {
    public static void main(String[] args) {
        String symbol1 = "()";
        String symbol2 = "()[]{}";
        String symbol3 = "(]";
        String symbol4 = "['']";
        System.out.println(symbol1 + ": " + isValid(symbol1));
        System.out.println(symbol2 + ": " + isValid(symbol2));
        System.out.println(symbol3 + ": " + isValid(symbol3));
        System.out.println(symbol4 + ": " + isValid(symbol4));
    }

    private static boolean isValid(String s) {
        char[] array = s.toCharArray();
        Deque deque = new LinkedList();
        String open = "([{";
        for (Character character : array) {
            if (open.contains(character.toString())) deque.add(character);
            else if (deque.isEmpty())
                return false;
            else if (character.equals(']') && !deque.pollLast().equals('['))
                return false;
            else if (character.equals(')') && !deque.pollLast().equals('('))
                return false;
            else if (character.equals('}') && !deque.pollLast().equals('{'))
                return false;
        }
        return deque.isEmpty();
    }
}
