package com.zss.T04;

public class Test01 {
    int a =10;
    public static void main(String[] args) {
        String a = "abc";
        String b= new String("abc");
        System.out.println(a.equals(b));
        Test01 t = new Test02();
        System.out.println(t.a);
    }
}
