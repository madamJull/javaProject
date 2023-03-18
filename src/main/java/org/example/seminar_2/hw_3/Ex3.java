package org.example.seminar_2.hw_3;

public class Ex3 {
    public static void main(String[] args) {
        int[] array = new int[]{14, 8, -1, 38, -7, 42, -19, 17};
        printArray(array);
        replaceNegative(array);
        printArray(array);
    }
    private static void printArray(int[] array) {
        String res = "[";
        for (int i = 0; i < array.length; i++) {
            res += array[i] + (i == array.length - 1 ? "]" : ", ");
        }
        System.out.println(res);
    }
    private static void replaceNegative(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if ((10 <= array[i] && array[i] <= 99) || (-99 <= array[i] && array[i] <= -10)) {
                sum += i;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) array[i] = sum;
        }
    }
}
