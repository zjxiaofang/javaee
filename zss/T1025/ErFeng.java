package com.zss.T1025;

public class ErFeng {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int a= binarySearch(arr,7);

    }
    public static int binarySearch(int[] arr,int i){
        int low=0;
        int high = arr.length-1;
        int index = -1;
        int mid=(low + high)/2;
        int guess=arr[mid];
        while(low<=high) {
            if (guess == i) {
                index = mid;
                break;
            }
            if (guess > i) {
                high = mid - 1;
            } if (guess < i) {
                low = mid + 1;
            }
        }
        return index;
    }
}
