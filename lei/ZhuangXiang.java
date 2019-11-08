package com.banyuan.lei;

public class ZhuangXiang {
    public static void main(String[] args) {
        //【1】属性：
        System.out.println("最大值：" + Integer.MAX_VALUE);
        System.out.println("最小值：" + Integer.MIN_VALUE);
        //"物极必反"
        System.out.println(Integer.MAX_VALUE + 1);
        System.out.println(Integer.MIN_VALUE - 1);

        //【2】构造器
        Integer i1 = new Integer(12);
        Integer i2 = new Integer("12");
        System.out.println(i1);
        System.out.println(i2);
        //【3】自动装箱
        Integer i3 = 12;//int--->Integer
        System.out.println(i3);

        int num1 = i2;//Integer--->int

        Integer i4 = new Integer(16);
        Integer i5 = new Integer(16);
        System.out.println(i4.compareTo(i5));

        System.out.println(i4 == i5);//false
        System.out.println(i4.equals(i5));//Integer 重写了 equals方法

        Integer i6 = 12;
        Integer i7 = 12;
        System.out.println(i6 == i7);

        //(3)intValue()
        int num2 = i4.intValue();//Integer--->int
        System.out.println(num2);
        //(4)valueOf(int i)
        Integer i8 = Integer.valueOf(12);//int--->Integer
        System.out.println(i8);
    }
}
