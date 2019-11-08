package com.zss.T04;

public class LingXing3 {
    public static void main(String[] args) {
        int size = 17;
        int st = size/2+1;
        int et = size/2+1;
        boolean bl  = true;
        for(int j=1;j<=size;j++) {
            for (int i = 1; i <= size; i++) {
                if (i >= st && i <= et) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            if(et-st+1==size){
                bl =false;
            }
            if(bl){
                st--;
                et++;
            }else{
                st++;
                et--;
            }
        }
    }
}
