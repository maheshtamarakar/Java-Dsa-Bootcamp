package com.mahesh.recursion;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,44,53,432,567};
        int target = 1;
        int s = 0, e = arr.length - 1;

        System.out.println(BS(arr, target, s, e));

    }

    static int BS(int[] arr, int target, int s, int e) {
        if(s>e){
            return -1;
        }
        int m = s + (e-s)/2;
        if(arr[m] == target){
            return m;
        }
        if(arr[m] > target){
            return BS(arr, target, s, m - 1);
        }
        return BS(arr, target, m + 1, e);

    }

}
