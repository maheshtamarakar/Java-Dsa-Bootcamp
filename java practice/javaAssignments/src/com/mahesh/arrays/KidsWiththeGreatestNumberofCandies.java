package com.mahesh.arrays;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class KidsWiththeGreatestNumberofCandies {
    public static void main(String[] args) {
        int[] arr = {2,3,5,1,3};
        int excand = 3;
        System.out.println(kidsWithCandies(arr, excand));
    }

    static List<Boolean> kidsWithCandies(int[] arr, int excand) {
        List<Boolean> result = new ArrayList<>();
        int max = 0;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        for (int candy :
                arr) {
            if (candy +excand >= max) {
                result.add(true);
            }else {
                result.add(false);
            }
            }
        return result;
    }
}
