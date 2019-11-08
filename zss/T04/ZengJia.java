package com.zss.T04;

import java.util.Arrays;

public class ZengJia {
    public static void main(String[] args) {
        int[] a = {10,15,7,20,6,5};
        for(int i=5;i>=2;i--){
            a[i]=a[i-1];
        }
        a[1]=1001;
        System.out.println(Arrays.toString(a));
    }
}
