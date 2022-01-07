package com.mahesh.Strings;

public class Defanging {
    public static void main(String[] args) {
        String address = "1.1.1.1";

//        System.out.println(defanging1(address));

        //using stringbuilder
        System.out.println(defanging2(address));

    }
    //stringbuilder
    static String defanging2(String address) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            if(address.charAt(i) == '.'){
                str.append("[.]");
            }else{
                str.append(address.charAt(i));
            }
        }
        return str.toString();
    }

    static String defanging1(String address) {
        String[] str = address.split("\\.");
        String newStr = "";
        for(int num = 0;num< str.length; num++){
            if(num == str.length - 1){
                return newStr + str[num];
            }
            newStr += str[num] + "[.]";
        }
        return newStr;
    }
}
