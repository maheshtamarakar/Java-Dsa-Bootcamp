package com.mahesh.recursion;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        bubble(arr, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr, int r, int c) {
        if(r == arr.length){
            return;
        }
        if(c < arr.length - r - 1){
            if(arr[c] > arr[c + 1]){
                //swap
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }
            bubble(arr, r, c + 1);
        }else{
            bubble(arr, r + 1, 0);
        }
    }
}
