package com.mahesh.binarySearch;

public class KthMissingPositiveNumber {
    public static void main(String[] args) {
        int[] arr ={2,3,4,7,11};
        int k = 5;

        System.out.println(findKthPositive(arr, k));


    }

    static int findKthPositive(int[] arr, int k) {
        int count = 0;
        for (int i = 1; i < 1000; i++) {
            for (int value : arr) {
                if (i == value) {
                    break;
                }

            }
            count++;
            if(count == k){
                return i;
            }

        }
        return -1;
    }
}
