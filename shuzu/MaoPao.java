package com.banyuan.shuzu;

import java.util.Arrays;

//小到大
public class MaoPao {
    public static void main(String[] args) {
        int arr[] = {6,11,-7,-9,-18,1,2,3,4};
         sort(arr);
        System.out.println(Arrays.toString(arr));
       }
    static void sort(int[] a) {
        for(int i = a.length-1;i>0;i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                   int  k=j+1;
                   swap(a,j,k);
                }
            }
        }
    }
        static void swap(int[] a,int i,int j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
}
