package com.mahesh;

import java.util.Arrays;

public class Sqrt {
    public static void main(String[] args) {
        int num = 8;
        double temp;
        double sr = num/2;
        do{
            temp = sr;
            sr = (temp + (num/temp))/2;
        }while((temp - sr)!= 0);
        System.out.println(sr);
    }


}
