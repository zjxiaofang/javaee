package com.zss.Test10;

public class Product {
    private String brand;//品牌
    private String name;//品牌下具体产品的名字
    private boolean flag=false;//true :红灯   有商品  false:绿灯 无商品
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    //消费商品
    public synchronized void getProduct(){
        //如果没有商品，就等待：
        if(!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(30);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("消费者消费了："+this.getBrand()+"---"+this.getName());
        flag=false;
        notify();

    }
    public synchronized void setProduct(String brand,String name){
        if(flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //如果没有商品，就生产
        this.setBrand(brand);
        try {
            Thread.sleep(30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setName(name);
        System.out.println("生产者生产了："+this.getBrand()+"-----"+this.getName());

        //生产完之后:
        //先把灯弄成红色：
        flag=true;
        //告诉消费者来消费：
        notify();//Object 的方法
    }

}
