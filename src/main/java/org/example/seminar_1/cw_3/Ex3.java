package org.example.seminar_1.cw_3;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String sub1 = str.substring(0, str.length()/2);
        String sub2 = str.substring(str.length()/2);
        System.out.println(sub2 + sub1);
    }
}


