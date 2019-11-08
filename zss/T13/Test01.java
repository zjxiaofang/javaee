package com.zss.T13;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Test01 {
    public static void main(String[] args) throws IOException, IOException {
        File f=new File("d:/bjsxt/a.txt");
        FileInputStream fis=new FileInputStream(f);
        int n=fis.read();
        while(n!=-1){//读到文件的结尾的时候，会读取一个-1过来，那么循环就停止了
            System.out.println((char)n);
            n=fis.read();
        }
        fis.close();
//        byte[] b=new byte[8];
//        int len = fis.read(b);//读取的数组中的有效字节长度
//        while(len!=-1){
//            //System.out.println(len);
//            for(int i=0;i<=len-1;i++){
//                System.out.println((char)b[i]);
//            }
//            len = fis.read(b);
//        }
    }
}
