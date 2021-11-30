package com.mahesh.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Object_string {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] arr = new String[5];

        for(int i= 0; i<arr.length; i++){
            arr[i] = in.next();
        }
//        for(String name:arr){
//            System.out.print(name + " ");
//        }
        System.out.println(Arrays.toString(arr));



    }
}
