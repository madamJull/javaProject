package org.example.seminar_6.cw_1;

 import java.util.*;

/**
 * 1) Дан массив чисел, посчитать процент уникальных чисел.
 * *процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
 */
public class Ex1 {
    public static void main(String[] args) {
//1)Дан массив чисел, посчитать процент уникальных чисел.
        List<Integer> array = new ArrayList<>(Arrays.asList(1,2,3,1));
        Set<Integer> set = new HashSet<>(array);
        double pr= set.size()*100/array.size();
        System.out.println("pr = "+pr);
    }
}
