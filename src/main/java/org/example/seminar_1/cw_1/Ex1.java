package org.example.seminar_1.cw_1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(subtractProductAndSum(n));
    }

    public static int subtractProductAndSum(int n) {
        int sum = 0, multi = 1;
        while (n != 0) {
            sum += n % 10;
            multi *= n % 10;
            n /= 10;
        }
        return multi - sum;
    }
}