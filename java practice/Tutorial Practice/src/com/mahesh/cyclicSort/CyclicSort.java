package com.mahesh.cyclicSort;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void cyclic(int[] arr){
        int i = 0;
        while(i < arr.length ) {
            // for nos from 1 to N
            if(arr[i] - 1 == i){
                i++;
            }else{
                swapElement(arr, i, arr[i] - 1);
            }
        }

    }
    static void swapElement(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
