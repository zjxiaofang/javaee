package com.banyuan.lei;

import java.util.Date;

public class Date1 {
    public static void main(String[] args) {
        //【1】java.util.Date
        Date d=new Date();//获取当前时间：年月日时分秒
        System.out.println(d);
        System.out.println(d.toString());
        System.out.println(d.toGMTString());//过期方法  过时方法  废弃方法
        System.out.println(d.toLocaleString());
        System.out.println(d.getYear());//118+1900=2018
        System.out.println(d.getMonth());//返回的值在 0 和 11 之间，值 0 表示 1 月。
        System.out.println(d.getDate());

        System.out.println(d.getTime());//1544149571023
        System.out.println(System.currentTimeMillis());

        //【2】java.sql.Date
        java.sql.Date sqlDate=new java.sql.Date(1544149571023L);
        System.out.println(sqlDate);

        Date date=java.sql.Date.valueOf("2019-3-7");

        java.sql.Date d3=new java.sql.Date(new Date().getTime());
        //java.sql.Date--->java.util.Date
        Date d4=d3;
    }
}
