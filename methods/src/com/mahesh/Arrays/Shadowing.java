package com.mahesh.Arrays;

public class Shadowing {
    static int x = 80;
    public static void main(String[] args) {
        int x;
        x = 7;
        System.out.println(x);
        fun(x);
    }

    static int fun(int x) {
        System.out.println(x);
        return x;
    }
}
