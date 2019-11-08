package com.zss.T04;

import java.util.Arrays;

public class ShangChu {
    public static void main(String[] args) {
        int[] a = {10,15,7,20,6,5};
        for(int i=1;i<=4;i++){
            a[i]=a[i+1];
        }
        a[5]=0;
        System.out.println(Arrays.toString(a));
    }
}
