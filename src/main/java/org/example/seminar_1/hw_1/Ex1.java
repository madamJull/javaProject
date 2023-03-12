package org.example.seminar_1.hw_1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        System.out.println(ReverseWord(inputString));
    }

    public static String ReverseWord(String inputString) {
        String[] words = new StringBuilder(inputString).toString().split(" ");
        String res = " ";
        for (int i = words.length - 1; i >= 0; i--) {
            String word = words[i].trim();
            if (word != "")
                res += word + " ";
        }
        return res;
    }
}