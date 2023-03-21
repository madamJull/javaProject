package org.example.seminar_4.hw_1;

import java.util.LinkedList;

/**
 * Вывести список на экран в перевернутом виде (без массивов и ArrayList)
 * Пример:
 * 1 -> 2->3->4
 * Вывод:
 * 4->3->2->1
 */
public class Ex1 {
    public static void main(String[] args) {
        LinkedList <Integer> integerLinkedList = new LinkedList<>();
        for (int i = 1; i < 6; i++) {
            integerLinkedList.add(i);
        }

        System.out.println(integerLinkedList);
        LinkedList revers = reverseintegerLinkedList(integerLinkedList);
        System.out.println(revers);
    }

    private static LinkedList reverseintegerLinkedList(LinkedList integerLinkedList) {
        LinkedList result = new LinkedList();
        while (integerLinkedList.size() > 0) {
            result.addFirst(integerLinkedList.pop());
        }
        return result;
    }
}
