package com.zss.T1025;

import java.util.Arrays;

public class Test04 {
    public static void main(String[] args) {
        Student s1 = new Student("a",18,190.5);
        Student s2 = new Student("b",19,190.5);
        Student s3 = new Student("c",17,190.5);
        Student[] ss = {s1,s2,s3};
//        sort(ss);
//        System.out.println(""+ss[0]+ss[1]+ss[2]);




    }
    public static void sort(Student[] arr){
        for(int j=1;j<=arr.length-1;j++){
            for(int i=j;i<=arr.length-1;i++){
                if(arr[j-1].getAge()>arr[i].getAge()){
//                    Student t = arr[j-1];
//                    arr[j-1] = arr[i];
//                    arr[i] = t;
                    swap(arr[j-1],arr[i]);
                }
            }
        }
    }

    public static void swap(Student[] arr,int a,int b){
        Student t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }
    public static void swap(Student a,Student b){
        Student t = a;
        a = b;
        b = t;
    }
}
