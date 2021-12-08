package com.mahesh.cyclicSort;

public class missingPositive {
    public static void main(String[] args) {
        int[] arr = {7,8,9,11,12};

        System.out.println(firstMissingPositive(arr));
    }

    static int firstMissingPositive(int[] arr) {
        int i = 0;
        while(i< arr.length) {
            //becoz nos are from 0 to N
            int correct = arr[i] - 1;// 0
            if(arr[i] > 0 && arr[i] < arr.length && arr[i] != arr[correct]){
                swapElement(arr, i, correct);

            }else{
                i++;
            }
        }
        // search for missing num
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j+1){
                return j + 1;
            }
        }
        // case 2 if N + 1 num is missing num
        return arr.length + 1;
    }
    static void swapElement(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
