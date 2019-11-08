package com.zss.T1025;

import java.util.ArrayList;
import java.util.List;

public class AList {
    public static void main(String[] args) {
        List list = new ArrayList();
        boolean a =list.add("2");
        list.add("asd");
        list.add("2222");
        list.add("asdsdas");
        list.add(1,"abc");
        System.out.println(list);
        list.set(1,"2");

    }
}
