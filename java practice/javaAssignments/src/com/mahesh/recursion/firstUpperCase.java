package com.mahesh.recursion;

public class firstUpperCase {
    public static void main(String[] args) {
        String str = "geekS";

        System.out.println(first(str, 0));
    }

    static char first(String str, int i) {
        if(i == str.length()){
            return '0';
        }
        char chr = str.charAt(i);
        if(Character.toUpperCase(chr) == str.charAt(i)){
            return str.charAt(i);
        }
        return first(str, i + 1);
    }
}
