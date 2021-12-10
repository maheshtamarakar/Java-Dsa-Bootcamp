package com.mahesh.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateTargetArrayintheGivenOrder {
    public static void main(String[] args) {
        int[] nums = {0, 1,2,3,4};
        int[] index = {0, 1,2,2,1};
        System.out.println(Arrays.toString(targetArrayList(nums, index)));
    }

    static int[] targetArrayList(int[] nums, int[] index) {
        ArrayList<Integer> insert = new ArrayList<Integer>(nums.length);

        for(int i = 0 ; i < nums.length; i++){
            insert.add(index[i],nums[i]);
        }


        for(int i = 0;i < nums.length; i++){
            nums[i] = insert.get(i);
        }


        return nums;

    }
}
