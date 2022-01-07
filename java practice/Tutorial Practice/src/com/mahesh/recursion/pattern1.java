package com.mahesh.recursion;

public class pattern1 {
    public static void main(String[] args) {
        int n = 4;
        pattern(n, 0, 0);
    }

    static void pattern(int n, int r, int c) {
        if(r == n){
            return;
        }
        if(c < n - r){
            System.out.print("* ");
            pattern(n, r, c + 1);
        }else{
            System.out.println();
            pattern(n, r + 1, 0);
        }
    }
}
