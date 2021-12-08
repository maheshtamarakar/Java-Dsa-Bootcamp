package com.mahesh.cyclicSort;

import java.util.ArrayList;
import java.util.List;

public class findDuplicates {
    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(Duplicates(arr));
    }

    static List<Integer> Duplicates(int[] arr) {
        List<Integer> list = new ArrayList<>();
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
                list.add(arr[index]);
            }
        }
        return list;
    }
    static void swapElement(int[] arr, int i, int correct) {
        int temp = arr[correct];
        arr[correct] = arr[i];
        arr[i] = temp;
    }
}
