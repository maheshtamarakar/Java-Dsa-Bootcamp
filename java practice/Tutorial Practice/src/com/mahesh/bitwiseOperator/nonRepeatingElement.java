package com.mahesh.bitwiseOperator;

import java.util.ArrayList;

public class nonRepeatingElement {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,2,3,4};
        ArrayList<Integer> list = new ArrayList<>();


//        System.out.println(nonRepeating(arr));
//        System.out.println(unique(arr));
        int n = 500_000_000;
        System.out.println(n);
    }

    private static int unique(int[] arr) {
        int uniq = 0;
        for (int i : arr) {
            uniq = uniq^i;
        }
        return uniq;

    }

    static int nonRepeating(int[] arr) {
        int count = 0;
        if(arr.length == 0){
            return 0;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                count = 0;
                if(i != j && arr[i] == arr[j]){
                    count++;
                    break;
                }
            }
            if(count == 0){
                return i;
            }

        }
        return -1;
    }
}
