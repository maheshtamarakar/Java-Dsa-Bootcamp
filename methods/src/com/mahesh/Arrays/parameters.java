package com.mahesh.Arrays;

import java.util.Scanner;

public class parameters {
    public static void main(String[] args) {
//        int ans = sum(20, 40);
//        System.out.println(ans);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = in.next();
        String prtms = Greeting(name);
        System.out.println(prtms);
    }

    static String Greeting(String name) {
        String ms = "Hello " + name;
        return ms;
    }


//    static int sum(int a, int b){
//        return a+b;
//    }
}
