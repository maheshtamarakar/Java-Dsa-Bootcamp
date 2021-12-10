package com.mahesh.binarySearch;

public class PerfectSquare {
    public static void main(String[] args) {
        int x = 5;

        System.out.println(isPerfectSquare(x));
    }

    static boolean isPerfectSquare(int x) {
        //define value
        if(x == 1){
            return true;
        }
        int start = 1, end = x;
        // decreasing search space by using BS
        while (start<=end){
            int mid = start + (end - start)/2;
            if(mid == x/mid){
                return x%mid == 0;
            }
            else if(mid < x/mid){ // or mid**2 < x
                start = mid + 1;  // reduce  space
            }else{  // mid**2 > x
                end = mid - 1;
            }
        }
        return false;
    }
}
