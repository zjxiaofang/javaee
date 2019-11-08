package com.banyuan.d1026;

import java.util.ArrayList;
import java.util.List;

public class Student2 {
    private int id;//学号
    private String name;//名字
    private int EScore;//英语
    private int MScore;//数学
    private int CScore;//语文
    private int HScore;//历史
    private int PScore;//政治
    public int getMin(){
        List<Integer> list = new ArrayList<>();
        list.add(EScore);
        list.add(MScore);
        list.add(CScore);
        list.add(HScore);
        list.add(PScore);
        int min = EScore;
        for(int i=0;i<list.size();i++){
            if(list.get(i)<min){
                min=list.get(i);
            }
        }
        return min;
    }
    public int getMax(){
        List<Integer> list = new ArrayList<>();
        list.add(EScore);
        list.add(MScore);
        list.add(CScore);
        list.add(HScore);
        list.add(PScore);
        int max = EScore;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>max){
                max=list.get(i);
            }
        }
        return max;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", EScore=" + EScore +
                ", MScore=" + MScore +
                ", CScore=" + CScore +
                ", HScore=" + HScore +
                ", PScore=" + PScore +",最高分数"+getMax()+",最低分数"+getMin()+",总分"+(EScore+MScore+CScore+HScore+PScore)+
                '}';
    }

    public Student2(int id, String name, int EScore, int MScore, int CScore, int HScore, int PScore) {
        this.id = id;
        this.name = name;
        this.EScore = EScore;
        this.MScore = MScore;
        this.CScore = CScore;
        this.HScore = HScore;
        this.PScore = PScore;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEScore() {
        return EScore;
    }

    public void setEScore(int EScore) {
        this.EScore = EScore;
    }

    public int getMScore() {
        return MScore;
    }

    public void setMScore(int MScore) {
        this.MScore = MScore;
    }

    public int getCScore() {
        return CScore;
    }

    public void setCScore(int CScore) {
        this.CScore = CScore;
    }

    public int getHScore() {
        return HScore;
    }

    public void setHScore(int HScore) {
        this.HScore = HScore;
    }

    public int getPScore() {
        return PScore;
    }

    public void setPScore(int PScore) {
        this.PScore = PScore;
    }
}
