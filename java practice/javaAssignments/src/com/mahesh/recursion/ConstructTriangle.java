package com.mahesh.recursion;

import java.util.Arrays;

public class ConstructTriangle {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        printTriangle(arr);
    }

    static void printTriangle(int[] arr) {
        if(arr.length < 1){
            return;
        }
        // creating new array to which will contains the sum of consecutive num
        // length is decrease by -1 in new array
        int[] temp = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            temp[i] = arr[i] + arr[i + 1];
        }
        printTriangle(temp);
        //so I can print my array in reverse order as we want
        //this is called back tracking
        //y print arr? see the value of arr by debugging
        //u will notice arr value change after temp in new recursion
        System.out.println(Arrays.toString(arr));
    }
}
