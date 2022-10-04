package com.bridgelabz;

public class EvenPosition {
    public static void main(String[] args) {
        int[] num = new int[]{9, 5, 6, 8, 9, 4, 6, 5, 3, 2};
        System.out.println("Elements On Even Position in Array:->");
        for (int i = 0; i < num.length; i++) {
            if (i % 2 == 0)
                System.out.println(num[i]);
        }
    }
}