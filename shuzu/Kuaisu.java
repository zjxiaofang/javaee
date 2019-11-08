package com.banyuan.shuzu;

public class Kuaisu {
    public static void main(String[] args) {
        int[] arr = {1,4,7,2,5,8,-4,-12};
    }
    public static void sort(int[] arr,int low,int high){
        int i = low;
        int j = high;
       int key=  arr[i];
       while(arr[j]>=key){
           j--;
       }
       int t;
       t=arr[j];
       arr[j]=arr[i];
       arr[i]=t;
       while(arr[i]<=key){
           i++;
       }

    }
}
