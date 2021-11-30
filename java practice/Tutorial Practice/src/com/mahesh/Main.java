package com.mahesh;

public class Main {

    public static void main(String[] args) {
	int[] arr = {1,2,3,4,12,13,15,17,23,24,34,56,78,99,900};
    int target = 9000;
        System.out.println(binarysearch(arr, target));
    }

    static int binarysearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if(target>arr[mid]){
                start = mid + 1;
            }else if(target<arr[mid]){
                end = mid -1;
            }else {
                return mid;
            }

        }
        return -1;
    }

}
