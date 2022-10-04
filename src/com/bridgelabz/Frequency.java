package com.bridgelabz;

public class Frequency {
    public static void main(String[] args){
        int[] num=new int[]{2,3,4,5,3,4,6,2};
        int[] freq=new int[num.length];
        int visited=-1;
        for (int i=0;i<num.length;i++) {
            int count = 1;
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    count++;
                    freq[j] = visited;
                }
            }
            if (freq[i] != visited)
                freq[i] = count;
        }
        System.out.println("Frequency of each element is:");
        for (int i=0;i<freq.length;i++){
            if (freq[i]!=visited)
                System.out.println(" "+num[i]+" --> "+freq[i]);
        }
        
    }
}
