package com.banyuan.d1026;

import java.util.Arrays;

public class Maoapo {
    public static void main(String[] args) {
        int[] arr ={3,1,2,5,4};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int t =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
