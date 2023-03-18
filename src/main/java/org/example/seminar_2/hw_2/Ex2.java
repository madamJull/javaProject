package org.example.seminar_2.hw_2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("То, что последовательность является возрастающей, это: " + growingSequence(n));
    }

    private static boolean growingSequence(int n) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b;
        for (int i = 1; i < n; i++) {
            b = scanner.nextInt();
            if (b <= a) return false;
            a = b;
        }
        return true;
    }
}
