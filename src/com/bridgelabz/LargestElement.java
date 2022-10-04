package com.bridgelabz;

public class LargestElement {
    public static void main (String[] args)
    {
        int setarr[]=new int[] {100,150,125,300,600};
        int max=setarr[0];

        for (int i=0;i<setarr.length;i++){
                if(setarr[i]>max)
                    max=setarr[i];

               }
    System.out.println("Largest number in given set of Array is:" + max);
    }
}
