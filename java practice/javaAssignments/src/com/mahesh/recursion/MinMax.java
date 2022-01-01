package com.mahesh.recursion;

public class MinMax {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, -5, -4, 8, -6};
        minMax(arr);
    }

    static void minMax(int[] arr) {
        int ans1 = min(arr, 0, Integer.MAX_VALUE);
        int ans2 = max(arr, 0, Integer.MIN_VALUE);
        System.out.println(ans1);
        System.out.println(ans2);
    }

    static int min(int[] arr, int i, int minValue) {
        if(i > arr.length - 1){
            return minValue;
        }
        if(arr[i] < minValue){
            minValue = arr[i];
            return min(arr, i + 1, minValue);
        }
        return min(arr, i + 1, minValue);
    }
    static int max(int[] arr, int i, int minValue) {
        if(i > arr.length - 1){
            return minValue;
        }
        if(arr[i] > minValue){
            minValue = arr[i];
            return max(arr, i + 1, minValue);
        }
        return max(arr, i + 1, minValue);
    }
}
