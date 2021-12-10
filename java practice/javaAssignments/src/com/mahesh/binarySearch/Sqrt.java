package com.mahesh.binarySearch;

import java.util.Arrays;

public class Sqrt {
    public static void main(String[] args) {
        int x = 8;

        System.out.println(sqrt(x));
    }

    static int sqrt(int x) {
        if(x == 0) return 0;
        if(x == 1) return 1;
        //define value
        int start = 0, end = x, ans = 0;
        // decreasing search space by using BS
        while (start<=end){
            int mid = start + (end - start)/2;
            if(mid < x/mid){ // or mid**2 < x
                ans = mid; //possible ans
                start = mid + 1;  // reduce this space
            }else{  // mid**2 > x
                end = mid - 1;
            }
        }
        return ans;
    }


}
