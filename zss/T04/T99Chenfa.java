package com.zss.T04;

public class T99Chenfa {
    public static void main(String[] args) {
        for(int j=1;j<=4;j++) {
            for(int i=4-j;i>=1;i--){
                System.out.print(" ");
            }
            for (int i = 1; i <= 2 * j - 1; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int j=1;j<=3;j++) {
            for(int i=j;i>=1;i--){
                System.out.print(" ");
            }
            for (int i = 1; i <= 7-2*j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
