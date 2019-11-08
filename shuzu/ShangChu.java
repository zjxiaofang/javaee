package com.banyuan.shuzu;

import java.util.Arrays;

//删除下标为index的元素,第一个值为48的元素
public class ShangChu {
    public static void main(String[] args) {
        int[] arr = {12,48,56,78,48,29};
        int index = -1;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]==48){
                index=i;
                break;
            }
        }
        if(index>=0&&index<=arr.length-1)
        for(int i=index;i<=arr.length-2;i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1]=0;
        System.out.println(Arrays.toString(arr));

        int arr1[] = {12, 48, 56, 78, 48, 29};
        index = 3;
        for(int i=3;i<=arr1.length-2;i++){
            arr1[i] = arr1[i+1];
        }
        //找到48

        arr1[arr1.length-1]=0;
        System.out.println(Arrays.toString(arr1));
    }
}
