package com.mahesh.binarysearch;

import java.util.Arrays;

public class StrictlySorted2DArray {
    public static void main(String[] args) {
        int[][] matrix = {
                {2,3,4,5,6},
                {7,8,9,10,11},
                {12,13,14,15,16},
                {17,18,19,20,21}
        };
        int target = 22;

        System.out.println(Arrays.toString(search(matrix, target)));
    }

    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        if(cols == 0){
            return new int[]{-1, -1};
        }
        if(rows == 1){
            return BS(matrix, 0, 0, cols-1, target);
        }
        int cMid = cols/2;
        int rStart = 0;
        int rEnd = rows - 1;
        while (rStart < rEnd -1){//so at last i will get two rows left
            int mid = rStart + (rEnd - rStart)/2;
            if(matrix[mid][cMid] == target){
                return new int[]{mid, cMid};
            }
            else if(matrix[mid][cMid] < target){
                rStart = mid;
            }
            else {
                rEnd = mid;
            }

        }
        //check on two remaining element in cMid colum
        if(matrix[rStart][cMid] ==target){
            return new int[]{rStart, cMid};
        }if(matrix[rStart + 1][cMid] ==target){
            return new int[]{rStart + 1, cMid};
        }
        // check in first half
        if(matrix[rStart][cMid-1] >= target){
            return BS(matrix, rStart, 0, cMid -1, target);
        }
        //second half
        if(matrix[rStart][cMid + 1] <= target && target <= matrix[rStart][cols-1]){
            return BS(matrix, rStart, cMid + 1, cols -1, target);
        }
        //third half
        if(matrix[rStart + 1][cMid-1] >= target){
            return BS(matrix, rStart + 1, 0, cMid -1, target);
        }
        //fourth half
        else{
            return BS(matrix, rStart + 1, cMid + 1, cols -1, target);
        }

    }

    static int[] BS(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd){
            int mid = cStart + (cEnd - cStart)/2;
            if(matrix[row][mid] == target){
                return new int[]{row, mid};
            }else if(matrix[row][mid] < target){
                cStart = mid + 1;
            }else{
                cEnd = mid -1;
            }
        }
        return new int[]{-1, -1};
    }
}
