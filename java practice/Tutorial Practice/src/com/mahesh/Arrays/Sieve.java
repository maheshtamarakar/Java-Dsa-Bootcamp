package com.mahesh.Arrays;

public class Sieve {
    public static void main(String[] args) {
        int n = 40;
        boolean[] arr = new boolean[n + 1];
        sieve(arr, n);
    }
// false means no is prime
    static void sieve(boolean[] arr, int n) {
        for (int i = 2; i*i < n; i++) {
            for (int j = i*i; j < n; j += i) {
                if(!arr[j]){
                    arr[j] = true;
                }
            }
        }
        for (int i = 0; i <= n; i++) {
            if(!arr[i]){
                System.out.println(i);
            }
        }
    }
}
