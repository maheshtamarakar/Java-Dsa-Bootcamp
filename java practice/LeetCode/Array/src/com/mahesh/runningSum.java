package com.mahesh;

import java.util.Arrays;

public class runningSum {
    public static void main(String[] args) {
        int[] arr = {3,1,2,10,-1};
        runningsum(arr);
    }

    static void runningsum(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i-1] + arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
