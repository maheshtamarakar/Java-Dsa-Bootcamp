package com.mahesh.Arrays;

public class searchstring {
    public static void main(String[] args) {
        String str = "Mahesh";
        char target = 'e';
        System.out.println(SearchStr(str, target));
    }

    static int SearchStr(String str, char target) {
        if(str.length() == 0) return -1;
        char[] strArr = str.toCharArray();
        for (int index = 0; index < strArr.length; index++) {
            if(strArr[index] == target) return index;
        }
        return -1;
    }
}
