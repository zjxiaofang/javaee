package com.zss.T04;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class JieCheng {
    public static void main(String[] args) {
        System.out.println(fac(6));
    }
    public  static  int fac(int a){
       if(a==1){
           return 1;
       }
        return a*fac(a-1);
    }
}
