package com.mahesh.binarySearch;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,9,10,0,1,2,3};
        System.out.println(findPivot(arr));
    }

    static int findPivot(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        while(s<=e){
            int m = s + (e-s)/2;
            if(m<e && arr[m] > arr[m+1]){
                return m;
            }else if(m>s && arr[m]<arr[m-1]){
                return m-1;
            }else if(arr[s]>arr[m]){
                e = m-1;
            }else{
                s = m+1;
            }
        }
        return -1;
    }
}
