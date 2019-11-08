package com.zss.T04;
//性别练习
public class Person {
    private String name;
    private int age;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex)  {
        if("男".equals(sex)||"女".equals(sex)){
            this.sex = sex;
        }else{
            try {
                throw new Exception("a");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        setSex(sex);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    public Person() {
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(18);
        p.setName("a");
        p.setSex("女");
        System.out.println(p);
        Person p2 = new Person("b",17,"as");
        System.out.println(p2);
    }
}
