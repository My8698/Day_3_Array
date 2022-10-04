package com.bridgelabz;

public class AscendindArray {
    static int length;

    public static void printArray(int[] array) {
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

    }

    public static void sortArray(int[] array) {
        int temp = 0;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }
            }
        }
        System.out.println("Elements Of Array Sorted In Ascending order->");
        printArray(array);
    }

    public static void main(String[] args) {
        int[] array = new int[]{12, 20, 1, -4, -19, 3};
        length = array.length;
        System.out.println("Elements of original Array->");
        printArray(array);
        sortArray(array);
    }
}