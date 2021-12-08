package com.mahesh.cyclicSort;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        ;
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }
    static int[] findErrorNums(int[] arr){
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swapElement(arr, i, correct);
            } else {
                i++;
            }
        }
        // search for all duplicates
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index + 1){
                return new int[]{arr[index], index + 1};
            }
        }
        return new int[]{-1, -1};

    }
    static void swapElement(int[] arr, int i, int correct) {
        int temp = arr[correct];
        arr[correct] = arr[i];
        arr[i] = temp;
    }
}
