package com.mahesh.binarysearch;

public class RBS {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int target = 6;
//        search(arr, target);
        System.out.println(1/2);
    }
    static int search(int[] arr, int target){
        int pivot = findPivot(arr);
        if(pivot != -1){
            int firstcheck = BS(arr, target, 0, pivot);
            if(firstcheck != -1){
                return firstcheck;
            }else{
                return BS(arr, target, pivot + 1, arr.length-1);
            }
        }
        return BS(arr, target, 0, arr.length-1);
    }

    static int findPivot(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        while (s<=e){
            int m = s + (e-s)/2;
            if(m < e && arr[m]>arr[m+1]){
                return m;
            }else if(m > s && arr[m]<arr[m-1]){
                return m-1;
            }else if(arr[m]>arr[s]){
                s = m+1;
            }else{
                e = m-1;
            }
        }
        return -1;
    }
    static int BS(int[] arr, int target, int start, int end) {
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] > target){
                end = mid - 1;
            }else if(arr[mid] < target){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
