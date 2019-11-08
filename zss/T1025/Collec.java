package com.zss.T1025;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collec {
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add("java");
        col.add("java2");
        for(Object o:col){
            System.out.println(o);
        }
        System.out.println("=====");
        Iterator it = col.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        Iterator it2 = col.iterator();



    }
}
