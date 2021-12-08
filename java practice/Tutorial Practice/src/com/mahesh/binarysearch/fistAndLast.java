package com.mahesh.binarysearch;

public class fistAndLast {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 7, 7, 8, 8, 10};
        int target = 10;
        int first = firstOccurence(arr, target, true);
        if(first != -1){
            int second = firstOccurence(arr, target, false);
//            return new int[]{first, second};
            System.out.println(first + " " + second);
        }else{
            System.out.println(-1 + " " + -1);

        }
//        return new int[]{-1, -1};

    }

    static int firstOccurence(int[] arr, int target, boolean isFirst) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] > target){
                end = mid - 1;
            }else if(arr[mid] < target){
                start = mid + 1;
            }
            // if mid == target search for first occurence
            else{
                if(isFirst && mid>0 && arr[mid] == arr[mid - 1]){
                    end = mid - 1;
                }else if(!isFirst && mid < arr.length-1 && arr[mid] == arr[mid + 1]){
                    start = mid + 1;
                }
                else{
                    return mid;
                }
            }
        }
        return -1;
    }
}
