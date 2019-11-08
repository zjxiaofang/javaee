package com.banyuan.test29;

public class Test {

        public static void main(String[] args){
            //break:停止最近的循环

            for(int i=1;i<=10;i++){
                System.out.println(i);
                if(i==3){
                    break;
                }
            }

            for(int i=1;i<=10;i++){
                System.out.println(i);
                while(i==3){
                    break;
                }
            }

            //扩展：outer标签  【带标签的break】
            outer:for(int i=1;i<=10;i++){
                System.out.println(i);
                while(i==3){
                    break outer;
                }
            }
        }
}
