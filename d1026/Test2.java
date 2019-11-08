package com.banyuan.d1026;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Map<Integer,Student2> map = new HashMap<>();
        Student2 s1 = new Student2(200101, "小明", 92, 98, 85, 90, 91);
        Student2 s2 = new Student2(200102, "小红", 99, 90, 82, 95, 95);
        Student2 s3 = new Student2(200103, "小刚", 97, 89, 84, 97, 98);
        Student2 s4 = new Student2(200104, "小强", 91, 90, 90, 92, 91);
        Student2 s5 = new Student2(200105, "小胖", 92, 87, 88, 100, 100);
        map.put(200101, s1);
        map.put(200102, s2);
        map.put(200103, s3);
        map.put(200104, s4);
        map.put(200105, s5);
        System.out.println("请输入学号：");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(map.get(a));
    }
}
