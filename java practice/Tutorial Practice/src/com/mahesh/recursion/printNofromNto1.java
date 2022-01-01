package com.mahesh.recursion;

public class printNofromNto1 {
    public static void main(String[] args) {
        int n = 5;
        prt(n);
    }

    static void prt(int n) {
        if(n == 1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        prt(n - 1);
    }
}
