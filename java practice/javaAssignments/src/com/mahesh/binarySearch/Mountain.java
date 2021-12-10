package com.mahesh.binarySearch;

public class Mountain {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,5,6,4};
        System.out.println(MountainSearch(arr));
    }
    static int MountainSearch(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start +(end-start)/2;

            if(arr[mid]<arr[mid+1]){
                start = mid + 1;
            }
            else{
                end = mid;//bcoz of this i cant use start<= end in while loop or it will be infinite loop
            }
        }
        return end;
    }
}
