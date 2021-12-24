package com.mahesh.binarysearch;

import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr = { {2,3,4},
                        {5,7,8},
                        {9,10,23}};
        int target = 23;

//        System.out.println(Arrays.toString(search(arr, target)));
        System.out.println(Arrays.toString(BSsearch(arr, target)));
    }

    private static int[] BSsearch(int[][] arr, int target) {
        int row = 0, col = arr.length -1;
        while (row < arr.length  && col >= 0){
            if(arr[row][col] == target){
                return new int[]{row, col};
            }
            else if(arr[row][col] < target){
                row++;
            }
            else {
                col--;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] search(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i][j] == target){
                    return new int[]{i, j};
                }

            }

        }
        return new int[]{-1, -1};
    }

}
