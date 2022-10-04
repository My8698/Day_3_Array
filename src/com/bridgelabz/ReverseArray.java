package com.bridgelabz;

public class ReverseArray {
    public static void main(String[] args) {
        int[] num = new int[]{10, 11, 12, 13, 14, 15};
        System.out.println("Given Array:->");
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i] + " ");

        }
        System.out.println();
        System.out.println("Reverse Array is:->");
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.println(num[i] + " ");

        }
    }
}