package com.mahesh.Arrays;

public class maxWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,5},
                {2,3},
                {4,23}
        };
        System.out.println(mxWealth(accounts));
    }

    static int mxWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;

        for (int bank = 0; bank < accounts.length; bank++) {
            int sum = 0;
            for (int account = 0; account < accounts[bank].length; account++) {
                sum +=  accounts[bank][account];
            }
            if(sum>max){
                max =sum;
            }
        }
        return max;

    }
}
