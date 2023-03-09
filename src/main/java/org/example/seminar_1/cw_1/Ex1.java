package org.example.seminar_1.cw_1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int sum = 0, multi = 1;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n != 0) {
            sum += n % 10;
            multi *= n % 10;
            n /= 10;
        }
        System.out.println("result = " + (multi - sum));
    }
}
