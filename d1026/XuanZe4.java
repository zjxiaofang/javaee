package com.banyuan.d1026;

import java.util.Arrays;

public class XuanZe4 {
    public static void main(String[] args) {
        int[] a = {1,3,4,2,8,6,5};
        for(int j=0;j<a.length-1;j++){
            for(int i=j;i<a.length-1;i++){
                if(a[j]<a[i+1]){
                    int t = a[j];
                    a[j] = a[i+1];
                    a[i+1]=t;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
