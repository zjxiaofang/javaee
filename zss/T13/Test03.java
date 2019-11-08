package com.zss.T13;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
public class Test03 {
    public static void main(String[] args) throws IOException {
        System.out.println("--------server----------");
        //1,创建Socket，指定服务器端的端口号：
        ServerSocket ss=new ServerSocket(8888);
        Socket s = ss.accept();
        InputStream is = s.getInputStream();
        FileOutputStream fos=new FileOutputStream(new File("d:/a.jpg"));
        int n = is.read();
        while(n!=-1){
            fos.write(n);
            n = is.read();
        }

        //3,服务器向客户端返回数据：
        s.shutdownInput();
        OutputStream os = s.getOutputStream();
        DataOutputStream dos=new DataOutputStream(os);
        dos.writeUTF("上传文件成功！");

        //2.关闭流：
        dos.close();
        os.close();
        fos.close();
        is.close();
        s.close();
        ss.close();
    }
}
