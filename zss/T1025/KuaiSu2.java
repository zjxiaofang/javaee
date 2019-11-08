package com.zss.T1025;

import java.util.Arrays;

public class KuaiSu2 {
    public static void main(String[] args) {
        int[] arr = {1,4,7,2,5,8,-4,-12};
        System.out.println("1");
        sort(arr,0,arr.length-1);
        System.out.println("2");
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr,int low,int high){
        if(low>=high) return;
        int i=low;
        int j=high;
        int key = arr[i];
        while(i<j) {
            while (arr[j]>key) {
                j--;
            }
            swap(arr,i,j);
            while (arr[i] < key) {
                i++;
            }
            swap(arr,i,j);
        }
        sort(arr,low,i-1);
        sort(arr,i+1,high);
    }
    public static void swap(int[] arr,int a,int b){
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }
}
