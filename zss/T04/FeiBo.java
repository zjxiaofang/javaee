package com.zss.T04;

import static java.lang.Math.random;

public class FeiBo {
    public static void main(String[] args) {
        System.out.println(random());
        System.out.println(FeiBo(12));
    }

    public static int FeiBo(int n) {
        if(n==1) {
            return  0;
        }else if(n==2){
            return  1;
        }
        return FeiBo(n-1)+FeiBo(n-2);
    }
}
