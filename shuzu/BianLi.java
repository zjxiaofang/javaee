package com.banyuan.shuzu;

import java.util.Scanner;

//输入10个学生成绩求和，最大最小
public class BianLi {
    public static void main(String[] args) {
        int[] score = new int[10];
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i = 1;i<=10;i++){
            System.out.println("请输入第"+ i+ "个学生的成绩");
            int num = sc.nextInt();
            score[i-1]= num;
            sum+=num;
        }
        System.out.println("和是"+sum);
        for(int s:score){
            System.out.print(s+"\t");
        }
        int max = score[0];
        int min =score[0];
        for (int i=0;i<10;i++) {
            if(score[i]>max){
                max = score[i];
            }
            if(score[i]<min){
                min = score[i];
            }
        }
        System.out.println("=====");
        System.out.println(max);
        System.out.println(min);
    }
}
