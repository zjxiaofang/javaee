package com.zss.Test10;

import java.io.File;

public class Bianli {
    public static void main(String[] args) {
        File f=new File("d:/b");
        bianLi(f,1);
    }

    public static void bianLi(File f,int level){
        File[] listFiles = f.listFiles();
        for(File file:listFiles){
            for(int i=1;i<=level;i++){
                System.out.print("-");
            }
            System.out.println(file.getName());
            if(file.isDirectory()){
                bianLi(file,level+1);
            }
        }
    }
}
