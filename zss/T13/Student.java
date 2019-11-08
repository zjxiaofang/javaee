package com.zss.T13;

public class Student {
    private double height;
    String sex;
    protected double weight;
    public int sno;
    public Student(String name, int age, double height, String sex, double weight, int sno) {

        System.out.println("这是一个6个参数的构造器");
        this.height = height;
        this.sex = sex;
        this.weight = weight;
        this.sno = sno;
    }
    public Student(String name, int age, double height, String sex, int sno) {
        System.out.println("这是5个参数的构造器");
        this.height = height;
        this.sex = sex;
        this.sno = sno;
    }

    private Student(double height, String sex, double weight) {
        super();
        System.out.println("这是3个参数的private修饰的构造器");
        this.height = height;
        this.sex = sex;
        this.weight = weight;
    }
    public Student() {
        super();
        System.out.println("这是空构造器");
    }

    public void sleep(){
        System.out.println("Student.sleep()");
    }

    public void study(String address){
        System.out.println("Student.study()");
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
}
