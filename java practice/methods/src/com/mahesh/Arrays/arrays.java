
package com.mahesh.Arrays;

import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        int [] array = {2,33,4,5,2};
        change(array);
        System.out.println(Arrays.toString(array));
    }

    static void change(int[] num) {
       num  = new int[]{99, 22, 34, 3};
    }
}
