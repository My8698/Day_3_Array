package com.bridgelabz;

public class DuplicateElement {
    public static void main(String[] args) {
        int[] num = new int[]{9, 5, 6, 8, 9, 4, 6, 5, 3, 2};
        System.out.println("Duplicate Elements in given Array are:->");
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j])
                    System.out.println(num[j]);
            }
        }
    }
}