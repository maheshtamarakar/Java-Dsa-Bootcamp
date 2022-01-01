package com.mahesh.recursion;

public class countZeroes {
    public static void main(String[] args) {
        int n = 10203000;

//        zeroes(n);

        System.out.println(zeroes2(n));
//        System.out.println(count);

    }

    static int zeroes2(int n) {
        int count = 0;
        return helper(n, count);
    }

    static int helper(int n, int count) {
        if(n == 0){
            return count;
        }
        if(n%10 == 0){
            count++;
        }
        return helper(n/10, count);
    }

//    static int count = 0;
    static void zeroes(int n) {
        //base codition
        if(n == 0){
            return;
        }
        if(n%10 == 0){
//            count++;
        }

        zeroes(n/10);
    }
}
