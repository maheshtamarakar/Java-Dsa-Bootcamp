package com.mahesh;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ConcatenationofArray {
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int[] ans = new int[2*arr.length];
        int i = 0, j=0;
        while (i<2*arr.length){
            ans[i] = arr[j];
            i++;
            j++;
            if(j>arr.length-1){
                j=0;
            }
        }
        System.out.println(Arrays.toString(ans));

    }



}
