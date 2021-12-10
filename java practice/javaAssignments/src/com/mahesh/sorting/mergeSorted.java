package com.mahesh.sorting;

import java.util.Arrays;

public class mergeSorted {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3, n = 3;
        merge(nums1, nums2, m, n);
    }

    static void merge(int[] nums1, int[] nums2, int m, int n) {
        int p1 = m - 1, p2 = n-1, i = m+n-1;
        while (p2>=0){
            if(p1>=0 && nums1[p1] > nums1[p2]){
                nums1[i--] = nums1[p1--];
            }else {
                nums1[i--] = nums2[p2--];
            }
        }
        System.out.println(Arrays.toString(nums1));
    }
}
