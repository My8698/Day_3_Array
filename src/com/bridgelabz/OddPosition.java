package com.bridgelabz;

public class OddPosition {
    public static void main(String[] args) {
        int[] num = new int[]{9, 5, 6, 8, 9, 4, 6, 5, 3, 2};
        System.out.println("Elements On Even Position in Array:->");
        for (int i = 1; i < num.length; i=i+2) {
                System.out.println(num[i]);
        }
    }

}
