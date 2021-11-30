package com.mahesh;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = {2,3,5,9,14,16,18};
        int target = 19;
        System.out.println(ceiling(arr, target));

    }

    static int ceiling(int[] arr, int target) {
        int s = 0, e = arr.length-1;
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
        return s;
    }
}
