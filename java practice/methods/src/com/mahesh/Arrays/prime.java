package com.mahesh.Arrays;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the no.");
        int num = in.nextInt();
        primeNo(num);
    }

    static void primeNo(int num) {
        if(num == 1){
            System.out.println("Not a prime no.");
            return;
        }
        for(int i = 2;i*i<num; i++){
            if(num%i ==0){
                System.out.println("Not a prime no.");
                return;
            }
        }
        System.out.println("prime no.");
    }
}
