package com.mahesh;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberHigherorLower {
    public static void main(String[] args) {
        int n = 10;
        Random r = new Random();
        Scanner in = new Scanner(System.in);
        int guess = r.nextInt((n-0) + 1)+ 0;
        int pick;
        do{
            System.out.print("Enter your guessing num(pick): ");
            pick = in.nextInt();
            if(pick<guess){
                System.out.println(" The number you picked is lower than your guess");
            }else if(pick>guess) {
                System.out.println(" The number you picked is higher than your guess");
            }else{
                System.out.println("you guess the right number Congratulation");
            }

        }while(pick != guess);

    }
}
