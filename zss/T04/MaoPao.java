package com.zss.T04;

import java.util.Arrays;

public class MaoPao {
    public static void main(String[] args) {
        int[] a = {10,15,7,20};
        for(int j=0;j<3;j++){
            for(int i=0;i<3;i++){
                if(a[i+1]<a[i]){
                    int t = a[i+1];
                    a[i+1]=a[i];
                    a[i]=t;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
