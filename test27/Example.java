package com.banyuan.test27;

public class Example {
    public static void main(String[] args) {
        double sum = 0;
        double a = 1.0;
        int count = 1;
        while (count <= 20) {
            sum += 1 / a;
            count++;
            a = a * count ;
        }
        System.out.println(sum);
    }
}