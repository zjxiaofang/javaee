package com.zss.T04;

public class BaconPizza extends Pizza{
    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public BaconPizza(int size,int price,String name,int weight) {
        super(size,price,name);
        this.weight = weight;
    }
}
