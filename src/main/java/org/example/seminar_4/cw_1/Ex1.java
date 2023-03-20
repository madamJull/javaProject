package org.example.seminar_4.cw_1;

import java.util.LinkedList;
public class Ex1 {
    public static void main(String[] args) {
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        for (int i = 0; i < 6; i++) {
            integerLinkedList.add(i);
        }
        System.out.println("peek = " + integerLinkedList.peek());
        System.out.println(integerLinkedList);
        System.out.println("pop = " + integerLinkedList.pop());
        System.out.println(integerLinkedList);
        integerLinkedList.addFirst(3);
        System.out.println("add First " + integerLinkedList);
        integerLinkedList.addLast(7);
        System.out.println("add Last " + integerLinkedList);
        integerLinkedList.remove((Integer) 3);
        System.out.println("remove " + integerLinkedList);
        System.out.println(integerLinkedList.contains(2));

    }
}
