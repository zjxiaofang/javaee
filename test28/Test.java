package com.banyuan.test28;

public class Test {
    public static void main(String[] args) {
        for (int j = 1; j <= 4; j++) {
            for (int i = 1; i <= 4 - j; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= 2 * j - 1; i++) {
                if(i==1||i==2 * j - 1)
                System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for (int j = 1; j <= 3; j++) {
            for (int i = 1; i <= j; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= 2 * (4 - j) - 1; i++){
                if(i==1||i== 2 * (4 - j) - 1) {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
        System.out.println();
    }
    }
}
