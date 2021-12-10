package com.mahesh.binarySearch;

public class SearchInMountain {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,3,1};
        int target = 3;
        int peak = MountainSearch(arr);
        int targetInd1 = BS(arr, target, 0, peak);
        if(targetInd1 != -1){
            System.out.println(targetInd1);
        }else{
            int targetInd2 = BS(arr, target, peak, arr.length -1);
            System.out.println(targetInd2);
        }



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
    static int BS(int[] arr, int target,int s, int e) {
        int mid =0;
        while (s<=e){
            mid = s + (e-s)/2;
            if(target>arr[mid]){
                s = mid + 1;
            }else if(target<arr[mid]){
                e = mid - 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
