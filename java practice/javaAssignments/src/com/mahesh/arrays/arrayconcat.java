package com.mahesh.arrays;

import java.sql.Array;
import java.util.Arrays;

public class arrayconcat {
    public static void main(String[] args) {
        int[] arr = {1,2,1};

        System.out.println(Arrays.toString(conCat(arr)));
    }

    static int[] conCat(int[] arr) {
        int[] newArr = new int[2* arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
            newArr[i + arr.length] = arr[i];
        }
        return newArr;
    }
}
