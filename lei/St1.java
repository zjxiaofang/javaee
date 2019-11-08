package com.banyuan.lei;

import java.util.Arrays;

public class St1 {
    public static void main(String[] args) {
        //字符串
        String str="再见,2018！你好，2019！";
        String str2=new String();
        String str3=new String("abc");
        String str4=new String(new char[]{'a','1',',','年'});
        //在java中，无论是字母，数字，汉字，标点都是一个字符。
        System.out.println(str);

        System.out.println(str.length());
        System.out.println(str.isEmpty());
        System.out.println(str2.isEmpty());

        String str5=new String("abc");
        String str6=new String("abcdefghk");
        System.out.println(str5==str6);//false
        System.out.println(str5.equals(str6));

        System.out.println(str5.compareTo(str6));

        System.out.println(str5.indexOf(97));;//元素对应的索引
        System.out.println(str5.indexOf('a'));;//元素对应的索引

        System.out.println(str6.substring(3));//defghk 从指定下标位置开始截取字符串
        System.out.println(str6.substring(3, 5));//从[3,5)截取

        System.out.println(str6.replace('a', 'j'));;

        String str7="aa-bb-cc";
        System.out.println(Arrays.toString(str7.split("-")));//分割
        System.out.println(str7.toUpperCase());
        System.out.println(str7.toUpperCase().toLowerCase());

        String str8="       abc   asdf asdf   ";
        System.out.println(str8.trim());//去除首尾空格

        System.out.println(String.valueOf(false));;//boolean-->String
        System.out.println(String.valueOf(12));;//int--->String

    }
}
