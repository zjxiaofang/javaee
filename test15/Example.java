package com.banyuan.test15;
import java.util.Scanner;
public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入密码");
        String password = sc.nextLine();
        char[] array = password.toCharArray();
        for(int i=0;i<array.length;i++){
            array[i] = (char)(array[i]^20000);
        }
        System.out.println(new String(array));
    }
}
