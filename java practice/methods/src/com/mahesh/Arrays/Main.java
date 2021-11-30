package com.mahesh.Arrays;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        sum();sum();sum();
    }
    static void sum(){
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;
        System.out.print("Enter first num: ");
        num1 = in.nextInt();
        System.out.print("Enter second num: ");
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.println("sum of two num is: "+ sum );
    }
}
