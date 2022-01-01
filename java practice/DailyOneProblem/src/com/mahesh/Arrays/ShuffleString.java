package com.mahesh.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ShuffleString {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s, indices));

    }

    static String restoreString(String s, int[] indices) {
        char[] sArray = s.toCharArray();
        char[] arr = new char[sArray.length];
        for (int i = 0; i < sArray.length; i++) {
            arr[indices[i]] = sArray[i];
        }
        return new String(arr);
    }
}
