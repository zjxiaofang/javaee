package com.banyuan.d1026;

import java.util.Arrays;

public class XuanZe2 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 4, 8, 9,};
        for(int i=0;i<arr.length-1;i++) {
            for (int j = i; j < arr.length - 1; j++) {
                if(arr[i]>arr[j+1]){
                    int t = arr[i];
                    arr[i]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
