package com.mahesh.cyclicSort;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {4, -44, 23, -2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr) {
        for (int i = 0; i < arr.length -1; i++) {
            int last = arr.length - i - 1;
            int maxindex = maxIndex(arr, 0, last);
            swapElement(arr, maxindex, last);

        }
    }

    static void swapElement(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int maxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int j = 0; j <= end; j++) {
            if(arr[j]>arr[max]){
                max = j;
            }

        }
        return max;
    }
}
