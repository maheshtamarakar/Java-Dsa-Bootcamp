package com.mahesh;

public class FirstBadVersion {
    public static void main(String[] args) {
        int n = 5;
        firstBadVersion(n);

    }
    static int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        while (start < end){
            int mid = start + (end - start)/2;
            if(!isBadVersion(mid) && mid<end && isBadVersion(mid + 1)){
                return mid + 1;
            }else if(isBadVersion(mid) && mid>0 && !isBadVersion(mid - 1)){
                return mid;
            }else if(!isBadVersion(mid)){
                start = mid + 1;
            }else{
                end = mid -1;
            }
    }
        return start;
}
