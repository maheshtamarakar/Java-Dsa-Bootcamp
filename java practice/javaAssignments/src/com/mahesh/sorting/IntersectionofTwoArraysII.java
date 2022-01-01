package com.mahesh.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class IntersectionofTwoArraysII {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2,4,3,1,5};


        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }

    static int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        //create the map of nums2 repeating element
        if(nums2.length > nums1.length){
            for (int i = 0; i < nums2.length; i++) {
                int key = nums2[i];
                if(map.containsKey(key)){
                    map.put(key, map.get(key)+1);
                }else{
                    map.put(key, 1);
                }
            }
//        System.out.println(map);
            // check if it already contains the key
            // if yes add it to list and remove it from map
            for(int key:nums1){
                if(map.containsKey(key)){
                    list.add(key);
//                    map.remove(key);
                }
            }
        }else{
            for (int i = 0; i < nums1.length; i++) {
                int key = nums1[i];
                if(map.containsKey(key)){
                    map.put(key, map.get(key)+1);
                }else{
                    map.put(key, 1);
                }
            }
//        System.out.println(map);
            // check if it already contains the key
            // if yes add it to list and remove it from map
            for(int key:nums2){
                if(map.containsKey(key)){
                    list.add(key);
//                    map.remove(key);
                }
            }
        }

        // convert arraylist to array
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;

    }
}
