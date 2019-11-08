package com.banyuan.lei;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        //Arrays工具类的使用：源码中构造器私有化， private Arrays() {}，不能创建Arrays的对象
        //Array a=new Arrays();
        int[] arr={1,4,7,2,5,8};
        //[1]toString:查看数组中的元素
        //System.out.println(Arrays.toString(arr));//[1, 4, 7, 2, 5, 8]
        //[1-1]自己模拟[a,b,c,d]效果，方法1
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i<arr.length-1){
                System.out.print(arr[i]+",");
            }else{
                System.out.print(arr[i]);
            }
        }
        System.out.println("]");
        //[1-2]自己模拟[a,b,c,d]效果,方法2
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]+",");
        }

        sb.setCharAt(sb.length()-1, ']');
        System.out.println(sb);
        //[2]sort 排序
        //Arrays.sort(arr);
        //System.out.println("排序后的数组："+Arrays.toString(arr));
        //[3]binarySearch二分法查找，必须在有序的数组中进行查找。
        System.out.println(Arrays.binarySearch(arr, 18));
        //[4]复制
        System.out.println(Arrays.toString(Arrays.copyOf(arr, 9)));//[1, 4, 7, 2, 5, 8, 0, 0, 0]
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 2, 5)));//从[2,5)--->2,3,4
        //[5]填充
        Arrays.fill(arr, 1);//将所有元素变为1
        System.out.println(Arrays.toString(arr));
        Arrays.fill(arr, 2, 5, 6);//从[2,5)位置填充为指定的元素6
        System.out.println(Arrays.toString(arr));
        //[6]equals
        int[] arr1={1,3,7,9};
        int[] arr2={1,3,7,9};
        System.out.println(arr1==arr2);//判断左右的值，引用数据类型来说，判断的是左右的地址 ，一定是false
        System.out.println(arr1.equals(arr2));//false
        System.out.println(Arrays.equals(arr1, arr2));//true

        int[] arr3={1,2,345,32,56};
        //目标数组：
        int[] arr4=new int[10];
        System.arraycopy(arr3, 2, arr4, 3, 3);
        System.out.println(Arrays.toString(arr4));
    }
}