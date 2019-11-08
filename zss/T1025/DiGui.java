package com.zss.T1025;

public class DiGui {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int a= binarySearch(arr,7,0,arr.length-1);
        System.out.println(a);
    }
    public static int binarySearch(int[] arr,int item,int low,int high) {
            if(low>high){
                return -1;
            }
            int mid = (low + high) / 2;
            int guess = arr[mid];
            if (guess == item) {
               return mid;
            } else if (guess > item) {
                 return binarySearch(arr, item, low, mid+1);
            }else{
               return binarySearch(arr, item, mid+1, high);
            }
    }
}
