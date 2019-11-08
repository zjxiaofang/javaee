package com.zss.T13;

import java.util.Scanner;

public class PizzaStore {//披萨店：
    public static Pizza getPizza(int num){
        Scanner sc=new Scanner(System.in);
        Pizza p=null;
        //1.培根披萨
        if(num==1){
            //录入信息
            System.out.println("请输入培根克数：");
            int weight=sc.nextInt();
            System.out.println("请输入披萨大小：");
            int size=sc.nextInt();
            System.out.println("请输入披萨价格：");
            int price=sc.nextInt();
            //将信息封装成为一个具体的培根披萨的对象：

            p=new Pizza();

        }
        //2.海鲜披萨
        if(num==2){
            //录入信息
            System.out.println("请输入配料信息：");
            String burdening=sc.next();
            System.out.println("请输入披萨大小：");
            int size=sc.nextInt();
            System.out.println("请输入披萨价格：");
            int price=sc.nextInt();
            //将信息封装成为一个具体的海鲜披萨的对象：
            p=new Pizza();
        }
        return p;
    }
}

