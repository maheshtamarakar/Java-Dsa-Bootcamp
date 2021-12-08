package com.mahesh.cyclicSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findDisappearedNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 1};

        System.out.println(DisappearNum(arr));
    }

    static List<Integer> DisappearNum(int[] arr) {
        int i = 0;
        while(i< arr.length) {
            //becoz nos are from 0 to N
            int correct = arr[i] - 1;// 0
            if(arr[i] != arr[correct]){
                swapElement(arr, i, correct);

            }else{
                i++;
            }
        }
        List<Integer> list = new ArrayList<Integer>();
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j + 1){
                list.add(j+1);
            }

        }
        return list;
    }
    static void swapElement(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
