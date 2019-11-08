package com.zss.T04;

import java.util.Scanner;

public class GouWu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int num = sc.nextInt();
            if(num>=0){
                if(num>=8000){
                    System.out.println("6折");
                }else if(num>=4000){
                    System.out.println("7折");
                }else if(num>=2000){
                    System.out.println("8折");
                }else{
                    System.out.println("9折");
                }
            }else{
                System.out.println("请输入一个正数");
            }
        }else{
            System.out.println("输入的不是整数");
        }
    }
}
