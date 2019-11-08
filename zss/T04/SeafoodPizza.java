package com.zss.T04;

public class SeafoodPizza extends Pizza{
    private String burdening;

    public String getBurdening() {
        return burdening;
    }

    public void setBurdening(String burdening) {
        this.burdening = burdening;
    }


    public SeafoodPizza(int size,int price,String name,String burdening) {
        super(size,price,name);
        this.burdening = burdening;
    }
}
