package com.mahesh.cyclicSort;

import java.util.Arrays;

public class missingNumber {
    public static void main(String[] args) {
        int arr[] = {3, 0, 1, 2};
        ;
        System.out.println(cyclic(arr));

    }
    static int cyclic(int[] arr){
        int i = 0;
        while(i< arr.length) {
            //becoz nos are from 0 to N
            int correct = arr[i];// 0
            if(arr[i] < arr.length && arr[i] != arr[correct]){
                swapElement(arr, i, correct);

            }else{
                i++;
            }
        }
        // search for missing num
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j){
                return j;
            }
        }
        // case 2 if N num is missing num
        return arr.length;

    }
    static void swapElement(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
