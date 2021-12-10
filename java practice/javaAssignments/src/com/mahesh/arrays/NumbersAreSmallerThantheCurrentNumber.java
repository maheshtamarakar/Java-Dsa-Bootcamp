package com.mahesh.arrays;

import java.util.Arrays;

public class NumbersAreSmallerThantheCurrentNumber {
    public static void main(String[] args) {
        int arr[] = {6,5,4,8};
        smallerThantheCurrentNumber(arr);
        System.out.println(Arrays.toString(smallerThantheCurrentNumber(arr)));
    }

    static int[] smallerThantheCurrentNumber(int[] arr) {
        int[] array = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (i != j){
                    if(arr[i]>arr[j]){
                        count++;
                    }
                }

            }
            array[i] = count;

        }
        return array;
    }
}
