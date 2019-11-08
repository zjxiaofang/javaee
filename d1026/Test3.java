package com.banyuan.d1026;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Test3 {
    public static void main(String[] args) {
        Map<Integer,Student3> map = new HashMap<>();
        Student3 s1 = new Student3(200101, "小明", 92, 98, 85, 90, 91);
        Student3 s2 = new Student3(200102, "小红", 99, 90, 82, 95, 95);
        Student3 s3 = new Student3(200103, "小刚", 97, 89, 84, 97, 98);
        Student3 s4 = new Student3(200104, "小强", 91, 90, 90, 92, 91);
        Student3 s5 = new Student3(200105, "小胖", 92, 87, 88, 100, 100);
        map.put(s1.getId(), s1);
        map.put(s2.getId(), s2);
        map.put(s3.getId(), s3);
        map.put(s4.getId(), s4);
        map.put(s5.getId(), s5);
        Scanner sc = new Scanner(System.in);
        System.out.println(map.get(sc.nextInt()));
    }
}
