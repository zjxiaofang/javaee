package com.zss.T13;

import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, NoSuchFieldException {
        Class<?> c1 = Class.forName("com.b.test05.Student");

        Method[] ms = c1.getMethods();
        for (Method m : ms) {
            System.out.println(m);
        }
        System.out.println("---------------------");
//		getDeclaredMethods()获取到本类的所有方法
        Method[] ms2 = c1.getDeclaredMethods();
        for (Method m : ms2) {
            System.out.println(m);
        }

        System.out.println("----------------------");
        //获取指定的方法：
        Method m = c1.getMethod("sleep");
        System.out.println(m);

        Method m2 = c1.getMethod("study", String.class);
        System.out.println(m2);

        //调用方法：
        //m.invoke(a, b) 调用a对象的m方法，传参为：b
        Student s = (Student) c1.newInstance();
    }
}
