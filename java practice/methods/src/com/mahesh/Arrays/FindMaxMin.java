package com.mahesh.Arrays;

public class FindMaxMin {
    public static void main(String[] args) {
        int[] arr = {2,4,5,22,45,11,66};
        int start = 3;
        int end = 6;

//        System.out.println(maxNum(arr));
        System.out.println(minNum(arr, start, end));
    }
    static int maxNum(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int el :arr){
            if(el>max) max = el;
        }
        return max;

    }
     static int minNum(int[] arr, int start, int end){
        int min = Integer.MAX_VALUE;
         for (int i = start; i <= end; i++) {
             int el = arr[i];
             if (el < min) min = el;
         }
        return min;

    }
}
