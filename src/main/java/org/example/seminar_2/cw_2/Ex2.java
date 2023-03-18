package org.example.seminar_2.cw_2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println(sum());
    }

    public static int sum() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int n = scanner.nextInt();
        int lastnum = scanner.nextInt();
        for (int i = 0; i < n - 1; i++) {
            int currentNum = scanner.nextInt();
            if (currentNum % 10 == 5 && lastnum % 2 == 0){
                sum += currentNum;
            }
            lastnum = currentNum;
        }
        return sum;
    }
}

