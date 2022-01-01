package com.mahesh.recursion;

public class sumOfDigits {
    public static void main(String[] args) {
        int ans = sumofdigits(1042);
        System.out.println(ans);
    }
    static int sumofdigits(int n){
        if(n/10 == 0){
            return n;
        }
        return n%10 + sumofdigits(n/10);
    }
}
