package com.mahesh.Arrays;

public class BinarySearchSQRT {
    public static void main(String[] args) {
        int n = 39;
        int p = 3;
        System.out.println(sqrt(n, p));
    }

    static double sqrt(int n, int p) {
        int s = 1, e = n;
        int m = 0;
        while (s <= e){
            m = s + (e - s)/2;
            if(m < n/m){
                s = m + 1;
            }else{
                e = m - 1;
            }
        }
        double pr = m;
        double incr = 0.1;
        for (int i = 0; i < p; i++) {
            while(pr*pr <= n){
                pr = pr + incr;
            }
            pr -= incr;
            incr /= 10;
        }

        return pr;
    }
}
