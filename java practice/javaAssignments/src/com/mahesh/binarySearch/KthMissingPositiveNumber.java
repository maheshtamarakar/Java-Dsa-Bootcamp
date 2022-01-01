package com.mahesh.binarySearch;

import java.util.ArrayList;

public class KthMissingPositiveNumber {
    public static void main(String[] args) {
        int[] arr ={1,2};
        int k = 5;

//        System.out.println(findKthPositive(arr, k));
//        System.out.println(ans(arr, k));
        System.out.println(BS(arr, k));


    }

    static int BS(int[] arr, int k) {
        if(k<arr[0]) return k;
        int start = 0, end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] - (mid+1) < k){
                start = mid +1;
            }else {
                end = mid - 1;
            }
        }
        return start + k;

    }

    static int ans(int[] arr, int k) {
        int start = 0;
        int end = arr.length;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] - mid > k) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start + k;
    }


    static int findKthPositive(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 1;
        while (list.size() < k){
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] == i){
                    i++;
                }
            }
            list.add(i);
            i++;
        }
        return list.get(list.size()-1);
    }

}
