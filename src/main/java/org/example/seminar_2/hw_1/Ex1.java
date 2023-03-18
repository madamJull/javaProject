package org.example.seminar_2.hw_1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Сумма простых чисел = " + sumNumbers(n));
    }

    public static int sumNumbers(int n){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            if (isSimple(a)) sum += a;
        }
        return sum;
    }

    public static boolean isSimple(int a) {
        Double sqrt = Math.sqrt(a);
        for (int i = 2; i <= sqrt.intValue(); i++) {
            if (a % i == 0) return false;
        }
        return true;
    }
}
