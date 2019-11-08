package com.zss.T1025;

import java.util.Arrays;

public class KuaiSu {
    public static void main(String[] args) {
        int[] arr = {1,4,7,2,5,8,-4,-13};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr,int low,int high){
        if(low>=high) return;
        int i=low;
        int j=high;
        int key = arr[i];
        while(i<j){
           while(arr[j]>=key&&i<j){
               j--;
           }
           int t;
           t = arr[j];
           arr[j] = arr[i];
           arr[i]=t;
           while(arr[i]<=key&&i<j){
               i++;
           }
           t=arr[i];
           arr[i]=arr[j];
           arr[j]=t;
       }
        //对基准左侧的集合重复操作
        sort(arr,low,i-1);
        //右侧
        sort(arr,i+1,high);
    }
}
