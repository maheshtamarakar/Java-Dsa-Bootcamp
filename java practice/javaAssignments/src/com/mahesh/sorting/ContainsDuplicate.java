package com.mahesh.sorting;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {3, 3};

        System.out.println(containsDuplicate(arr));
    }

    static boolean containsDuplicate(int[] arr) {
        if(arr.length<=1){
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            int correct = arr[i]-1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != i+1){
                return true;
            }

        }
        return false;
    }

    static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
