package org.example.seminar_5.cw_2;

import java.util.Map;

import java.util.HashMap;

/**
 * 2)	Определить, есть ли в массиве дубликаты, если найден хоть один, вывести на экран (true),
 * В противном случае (false).
 */
public class Ex2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(searchDubl(arr));
    }

    private static boolean searchDubl(int[] arr) {
        Map<Integer, Integer> testMass= new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (testMass.containsKey(arr[i])){
                return false;
            }else testMass.put(arr[i], 1);
        }
        return true;
    }
}

