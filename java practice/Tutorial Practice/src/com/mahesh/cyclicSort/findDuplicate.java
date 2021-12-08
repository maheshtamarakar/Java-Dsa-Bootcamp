package com.mahesh.cyclicSort;

public class findDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,1};

        System.out.println(duplicate(arr));
    }

    static int duplicate(int[] arr) {
        int i = 0;
        while (i < arr.length){
            if(arr[i] != i + 1) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swapElement(arr, i, correct);
                } else {
                    return arr[i];
                }
            }else{
                i++;
            }
        }

        return -1;
    }

    static void swapElement(int[] arr, int i, int correct) {
        int temp = arr[correct];
        arr[correct] = arr[i];
        arr[i] = temp;
    }
}
