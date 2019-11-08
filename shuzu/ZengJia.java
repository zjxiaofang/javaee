package com.banyuan.shuzu;
//下表2位置增加
import java.util.Arrays;

public class ZengJia {
    public static void main(String[] args) {
        //arr[3]=arr[2];
        int[] arr = {12,48,56,78,48,29};
        System.out.println(Arrays.toString(arr));
         int index = 3;
         for(int i = arr.length-1;i>=index;i--){
             arr[i]=arr[i-1];
         }
        arr[index-1] = 66;
        System.out.println(Arrays.toString(arr));
    }
}
