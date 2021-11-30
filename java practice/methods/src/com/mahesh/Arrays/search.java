package com.mahesh.Arrays;

import java.util.Arrays;

public class search {
    public static void main(String[] args) {
        int[][] arr = {
                {2,42,5,225},
                {3,24,55},
                {1,52,4},
                {44,33,23,22}

        };
        int target = 23;

        System.out.println(Arrays.toString(searchNum(arr, target)));
    }
//return the index of target element
    static int[] searchNum(int[][] arr, int target) {
        if(arr.length==0) return new int[]{-1, -1};
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){
                    return new int[]{row, col};
                }

            }

        }
        return new int[]{-1, -1};

    }
}
