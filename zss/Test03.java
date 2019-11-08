package com.zss;

import com.zss.T04.BiGuiYuan;
import com.zss.T04.HomeLink;

public class Test03 {
    public static void main(String[] args) {
        BiGuiYuan bgy1=new BiGuiYuan();
        showHouse(bgy1);
        BiGuiYuan bgy2=new BiGuiYuan();
        showHouse(bgy2);
        BiGuiYuan bgy3=new BiGuiYuan();
        showHouse(bgy3);

        //买恒大：
        WangDa hd1=new WangDa();
        showHouse(hd1);
        WangDa hd2=new WangDa();
        showHouse(hd2);
        showHouse(new HomeLink() {
            @Override
            public void getPrice() {
                System.out.println("a");
            }

            @Override
            public void getAddress() {
                System.out.println("b");
            }
        });

    }
    public static void showHouse(HomeLink h1){
        h1.getAddress();
        h1.getPrice();
    }
}
