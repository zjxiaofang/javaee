package com.zss.T13;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;


public class Test02 {
    public static void main(String[] args) throws UnknownHostException, IOException {
        System.out.println("--------client---------");
        //1.创建Socket,指定服务器端的ip和端口号：
        Socket s=new Socket("192.168.51.250", 8888);
        OutputStream os = s.getOutputStream();

        //2.获取本机上的图片：
        FileInputStream fis=new FileInputStream(new File("D:/b/1.List.jpg"));
        int n = fis.read();
        while(n!=-1){
            os.write(n);
            n = fis.read();
        }
        //4.接收服务器端返回的数据：
        s.shutdownOutput();
        InputStream is = s.getInputStream();
        DataInputStream dis=new DataInputStream(is);
        System.out.println("服务器反馈数据："+dis.readUTF());

        //3.关闭资源：
        dis.close();
        is.close();
        fis.close();
        os.close();
        s.close();
    }
}
