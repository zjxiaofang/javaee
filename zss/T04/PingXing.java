package com.zss.T04;

public class PingXing {
    public static void main(String[] args) {
        for(int j=1;j<=4;j++) {
            for (int i = 1; i <= 4 - j; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= 9; i ++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
