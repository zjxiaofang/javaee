package com.zss.T1025;

public class Test01 {
    public static void main(String[] args) {
        int[] arr = {12,23,45,56,78,4};
        int index = -1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==23){
                index  = i;
            }
        }
    }
}
