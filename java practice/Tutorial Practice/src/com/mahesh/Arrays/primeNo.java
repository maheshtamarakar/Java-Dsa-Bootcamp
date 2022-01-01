package com.mahesh.Arrays;

public class primeNo {
    public static void main(String[] args) {
        int n = 40;
        for (int i = 2; i < n; i++) {
            System.out.println(isPrime(i));
        }

    }

    static int isPrime(int n) {
        if(n == 1){
            return -1;
        }
        int i = 2;
        while ( i*i <= n){
            if(n % i == 0){
                return -1;
            }
            i++;
        }
        return n;
    }
}
