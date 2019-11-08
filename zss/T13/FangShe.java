package com.zss.T13;

import java.lang.reflect.Field;

public class FangShe {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException,IllegalArgumentException, NoSuchFieldException {
        Class c1=Class.forName("com.b.test04.Student");
        Field[] fields = c1.getFields();
        for(Field f:fields){
            System.out.println(f.getName());
        }
        System.out.println("--------------");
        //getDeclaredFields()获取到本类所有的属性
        Field[] fields2=c1.getDeclaredFields();
        for(Field f:fields2){
            System.out.println(f.getName());
        }

        System.out.println("--------------");

        //获取父类所有的属性：
        Field[] fields3=c1.getSuperclass().getDeclaredFields();
        for(Field f:fields3){
            System.out.println(f.getName());
        }

        System.out.println("--------------");
        //获取指定的属性：
        Field f1=c1.getField("sno");
        System.out.println(f1.getName());
        Field f2=c1.getDeclaredField("height");
        System.out.println(f2.getName());

        //给属性进行赋值：
        //f1.set(a, b)：给a对象的f1属性进行赋值为b
        Student o=(Student)c1.newInstance();
        f1.set(o, 12);
        System.out.println(o);

        f2.setAccessible(true);
        f2.set(o, 19.5);
        System.out.println(o);
    }
}
