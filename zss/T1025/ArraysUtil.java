package com.zss.T1025;

import java.util.Comparator;

public class ArraysUtil {
    public static void sort(Object[] arr) {
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = j; i < arr.length - 1; i++) {
                Comparable com1 = (Comparable) arr[j];
                Comparable com2 = (Comparable) arr[i + 1];
                if (com1.compareTo(com2) > 0) {
                    Object t;
                    t = arr[j - 1];
                    arr[j - 1] = arr[i];
                    arr[i] = t;
                }
            }
        }
    }

    public static void sort2(Object[] arr, Comparator com) {
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = j; i < arr.length - 1; i++) {
                if(com.compare(arr[j-1],arr[i])<0){
                    Object t;
                    t = arr[j - 1];
                    arr[j - 1] = arr[i];
                    arr[i] = t;
                }
            }
        }
    }
}
