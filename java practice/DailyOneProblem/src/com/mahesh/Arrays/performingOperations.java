package com.mahesh.Arrays;

public class performingOperations {
    public static void main(String[] args) {
        String[] operations = {"X++","++X","--X","X--"};
        int x = 0;
        for(String i:operations){
            if(i.equals("++X") || i.equals("X++")){
                x += 1;
            }else{
                x -= 1;
            }
        }
        System.out.println(x);
    }
}
