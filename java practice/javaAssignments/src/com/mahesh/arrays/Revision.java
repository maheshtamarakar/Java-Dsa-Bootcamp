package com.mahesh.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Revision {
    public static void main(String[] args) {
        int[] arr = new int[4];
        for(int i = 0; i<4; i++){
            arr[i] = i;
        }
        System.out.println(Arrays.toString(arr));
        arrayPractice(arr);
    }

    static void arrayPractice(int[] array) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String user = in.nextLine();
        System.out.println(Arrays.toString(array));
        System.out.println(user);

    }
}
