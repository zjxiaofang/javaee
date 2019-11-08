package com.zss.T04;

public class LingXing2<size> {
    public static void main(String[] args) {
        int size=37;
        int center=size/2+1;
        int startNum=center;//每行起始位置
        int endNum=center;//每行结束位置

        boolean flag=true;

        for(int j=1;j<=size;j++){
            for(int i=1;i<=size;i++){
                if(i>=startNum&&i<=endNum){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            if(endNum-startNum+1==size){
                flag=false;
            }


            if(flag){//菱形上部分
                startNum--;
                endNum++;
            }else{//菱形下部分
                startNum++;
                endNum--;
            }

            System.out.println();
        }

    }
}
