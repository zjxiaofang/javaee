package com.zss;

import com.zss.T04.HomeLink;

public class WangDa implements HomeLink{

    public void getPrice(){
        System.out.println("15000");
    }

    @Override
    public void getAddress() {
        System.out.println("2");

    }
}
