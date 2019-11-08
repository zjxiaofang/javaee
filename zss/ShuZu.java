package com.zss;

import java.util.Scanner;

public class ShuZu {
    public static void main(String[] args) {
        int[] arr = new int[3];
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<3;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        for (int i=0;i<3;i++){
            System.out.println(arr[i]);
        }
        System.out.println(sum);
    }
}
