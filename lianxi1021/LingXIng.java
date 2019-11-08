package com.banyuan.lianxi1021;

public class LingXIng {
    public static void main(String[] args) {
        //上面的三角形
        for(int j=1;j<=4;j++){//j--->行数
            //空格
            for(int i=1;i<=(10-j);i++){//i--->控制空格的个数
                System.out.print(" ");
            }
            //*
            for(int i=1;i<=(2*j-1);i++){//i--->控制*的个数
                System.out.print("*");
            }

            System.out.println();//---->每行的换行
        }

        //下面的三角形
        for(int j=1;j<=3;j++){//j--->行数
            //空格
            for(int i=1;i<=(j+6);i++){//i--->控制空格的个数
                System.out.print(" ");
            }
            //*
            for(int i=1;i<=(7-2*j);i++){//i--->控制*的个数
                System.out.print("*");
            }
            System.out.println();//---->每行的换行
        }
    }
}
