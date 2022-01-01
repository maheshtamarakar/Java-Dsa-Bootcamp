package com.mahesh.recursion;

public class NumberOfSteps {
    public static void main(String[] args) {
        int n = 14;
        System.out.println(numberOfSteps(n));
    }

    static int numberOfSteps(int n) {
        return helper(n, 0);
    }

    static int helper(int n, int steps) {
        if(n == 0){
            return steps;
        }
        if(n%2 == 0){
            return helper(n/2, ++steps);
        }
        return helper(n-1, ++steps);
    }
}
