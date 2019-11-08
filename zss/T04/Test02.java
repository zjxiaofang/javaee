package com.zss.T04;

import java.util.Scanner;

public class Test02 extends Test01{
     int a =12;
     public void say(){

     }
    public static void main(String[] args) {
        Test01 t = new Test02();
        System.out.println(t.a);
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Pizza p =  PizzaStore.getPizza(num);
        System.out.println(p);

    }
}
