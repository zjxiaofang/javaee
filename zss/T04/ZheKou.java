package com.zss.T04;

import java.util.Scanner;

public class ZheKou {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入年龄");
        if(sc.hasNextInt()){
            int num = sc.nextInt();
            if(num>7){
                System.out.println("男女可以");
            }else if(num>=5){
                System.out.println("输入性别男或女");
                if("男".equals(sc.next())){
                    System.out.println(num+"岁男孩可以搬动");
                }else if("女".equals(sc.next())){
                    System.out.println(num+"岁女孩可以搬动");
                }else{
                    System.out.println("输入正确性别");
                }
            }else{
                System.out.println( "搬不动");
            }
        }else {
            System.out.println("请输入正数");
        }
    }
}
