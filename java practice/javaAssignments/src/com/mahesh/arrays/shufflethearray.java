package com.mahesh.arrays;

import java.util.Arrays;

public class shufflethearray {
    public static void main(String[] args) {
        int[] arr= {};
        int n = 3;
        System.out.println(Arrays.toString(shuffle(arr, n)));

    }
    static int[] shuffle(int[] arr, int n){
        if(arr.length == 0){
            return new int[]{-1, -1};
        }
        int p1 = 0, p2 = n, i = 0;
        int[] ans = new int[2*n];
        while(i<2*n){
            ans[i] = arr[p1];
            i++;
            ans[i] = arr[p2];
            i++;
            p1++;
            p2++;

        }
        return ans;
    }
}
