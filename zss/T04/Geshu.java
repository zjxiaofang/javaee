package com.zss.T04;

import java.util.Scanner;

public class Geshu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
        for(int i=0;i<10;i++) {
            if (sc.hasNextInt()) {
                int num = sc.nextInt();
                if(num>0&&num!=666){
                    count++;
                }else if(num==666){
                    System.out.println("强制退出");
                    return;
                }
            }else{
                System.out.println("输入正数");
                i--;
            }
        }
        System.out.println("正数是"+count);
    }
}
