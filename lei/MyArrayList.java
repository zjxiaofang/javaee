package com.banyuan.lei;

public class MyArrayList {//自定义的集合：MyArrayList
    //底层其实就是一个Object类型的数组：
    Object[] value;
    //count:数组中被使用的数量：（有效长度）
    int count;

    //空构造器
    public MyArrayList(){
        //value=new Object[3];
        this(3);
    }

    public MyArrayList(int length){
        value=new Object[length];
    }
    //向集合中添加数据操作
    public MyArrayList add(Object obj){
        value[count]=obj;
        count++;
        if(count>=value.length){
            //数组的扩容:
            //[1]有新数组
            Object[] newValue=new Object[value.length*2+2];
            //[2]将老数组中的内容复制到新数组里
            for(int i=0;i<=value.length-1;i++){
                newValue[i]=value[i];
            }
            //[3]value从老数组指向新数组
            value=newValue;
        }
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append("[");

        for(int i=0;i<=count-1;i++){
            sb.append(value[i]+",");
        }
        sb.setCharAt(sb.length()-1, ']');
        return sb.toString();
    }

    //按照索引取出元素
    public Object get(int index){
        if(index<0||index>count-1){
            throw new RuntimeException("索引超出范围");
        }
        return value[index];
    }

    public static void main(String[] args) {
//		MyArrayList list=new MyArrayList();
        MyArrayList list=new MyArrayList(3);//底层Object数组长度为：3
        list.add(12);//Object obj=Integer i=12;
        list.add("abc");
        list.add(9.4);//Object obj=Double d=9.4;
        list.add(false);
        list.add(8.3);
        list.add('a');


        list.add(12).add(13).add(18);
        System.out.println(list);

        System.out.println(list.get(5));;
    }
}
