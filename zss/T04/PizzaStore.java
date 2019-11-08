package com.zss.T04;

import java.util.Scanner;

public class PizzaStore {
    public static Pizza getPizza(int num){
        Scanner sc = new Scanner(System.in);
        Pizza p = null;
        if(num==1){
            System.out.println("请输入培根");
            int weight=sc.nextInt();
            System.out.println("请输入培根大小");
            int size = sc.nextInt();
            System.out.println("价格");
            int price = sc.nextInt();
            p = new BaconPizza(size,price,"培根",weight);
        } if(num==2){
            //录入信息
            System.out.println("请输入配料信息：");
            String burdening=sc.next();
            System.out.println("请输入披萨大小：");
            int size=sc.nextInt();
            System.out.println("请输入披萨价格：");
            int price=sc.nextInt();
            //将信息封装成为一个具体的海鲜披萨的对象：
            p=new SeafoodPizza(size, price, "海鲜披萨", burdening);
        }
        return p;
    }
}
