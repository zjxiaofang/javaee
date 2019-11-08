package com.zss.T04;

import java.util.Arrays;

public class XuanZe {
    public static void main(String[] args) {
        int[] a = {10,15,7,20,2,5,9};
        for(int j =0;j<6;j++){
            for(int i=j;i<6;i++){
                if(a[i+1]>a[j]){
                    int t =a[j];
                    a[j]=a[i+1];
                    a[i+1]=t;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
