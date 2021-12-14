package com.mahesh.patternQuestion;

public class startPatter {
    public static void main(String[] args) {
        int n = 4;
        patter17(n);
    }

    static void patter3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = n; col >=row ; col--) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    static void patter5(int n) {
        for (int row = 1; row <= 2*n-1; row++) {
            int nfinal = row<=n?row:n-(row-n);
            for (int col = 1; col <=nfinal; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    static void patter28(int n) {
        for (int row = 1; row <= 2*n-1; row++) {

            int spaces = row <= n?n-row:row-n;
            for (int space = 1; space <= spaces; space++) {
                System.out.print(" ");
            }

            int nfinal = row<=n?row:2*n - row;
            for (int col = 1; col <=nfinal; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    static void patter17(int n) {
        for (int row = 1; row <= 2*n-1; row++) {

            int spaces = row <= n?n-row:row-n;
            for (int space = 1; space <= spaces; space++) {
                System.out.print("  ");
            }

            int nfinal = row<=n?row:2*n - row;
            for (int col1 = nfinal; col1 >=1; col1--) {
                System.out.print(col1 + " ");
            }

            for (int col2 = 2; col2 <= nfinal; col2++) {
                System.out.print(col2 + " ");
            }
            System.out.println();
        }
    }
}
