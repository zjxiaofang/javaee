package com.zss.T13;

public class Pizza {
    private int size;
    private int price;
    private String name;
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Pizza(int size, int price, String name) {
        super();
        this.size = size;
        this.price = price;
        this.name = name;
    }

    public String showPizza(){
        return "这是一个披萨";
    }

    public Pizza() {
        super();
    }
}
