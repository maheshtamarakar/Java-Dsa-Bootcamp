package com.mahesh.Arrays;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("enter the no.");
//        int num = in.nextInt();

//        System.out.println(armstr(num));
          for(int i =100;i<1000; i++){
              if(armstr(i)){
                  System.out.println(i );
              }
          }
    }
    //153

    static boolean armstr(int num) {
        int sum = 0;
        int original = num;
        while(num>0){
            int n = num%10;
            sum = sum + n*n*n;
            num = num/10;
        }
        return sum == original;

    }
}
