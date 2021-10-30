package com.mahesh.Arrays;

public class EvenDigits {
    //find the even no. of digits
    public static void main(String[] args) {
        int[] arr = {22,333,445,4,1111,334343};
        System.out.println(NumevenDigits(arr));

//        System.out.println(Digit(4444));
    }

    static int NumevenDigits(int[] arr) {
        int count = 0;
        if(arr.length == 0) return -1;
        for (int i : arr) {

            if (Digit(i) % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    static int Digit(int num) {
        int count = 0;
        while(num>0){
            count++;
            num = num/10;
        }
        return count;

    }
}
