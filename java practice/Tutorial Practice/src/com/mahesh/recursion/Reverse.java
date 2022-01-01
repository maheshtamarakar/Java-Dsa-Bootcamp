package com.mahesh.recursion;

public class Reverse {
    public static void main(String[] args) {
        int ans = reverse2(123523);
        System.out.println(ans);
    }

    static int  reverse(int n) {
        if(n%10 == n){
            return n;
        }
        return Integer.parseInt(String.valueOf(n%10) + reverse(n/10));
    }
    static int reverse2(int n){
        int digits = (int)(Math.log10(n) + 1);
        return helper(n, digits);
    }

    static int helper(int n, int digits) {
        if(n%10 == n){
            return n;
        }
        return n%10 * (int)(Math.pow(10, digits - 1)) + helper(n/10, digits - 1);
    }
}
