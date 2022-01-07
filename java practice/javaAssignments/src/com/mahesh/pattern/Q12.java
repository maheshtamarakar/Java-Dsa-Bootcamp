package com.mahesh.pattern;

public class Q12 {
    public static void main(String[] args) {
        int n = 5;
        pattern12(n);
    }

    static void pattern12(int n) {
        for (int r = 0; r < 2*n ; r++) {
            if(r > n - 1){
                for (int s = 0; s < 2*n - r - 1; s++) {
                    System.out.print(" ");
                }
                for (int c = 0; c <= r - n; c++) {
                    System.out.print("* ");
                }
                System.out.println();
            }else{
                for (int s = 0; s < r; s++) {
                    System.out.print(" ");
                }
                for (int c = 0; c < n - r; c++) {
                    System.out.print("* ");
                }
                System.out.println();
            }


        }
    }
}
