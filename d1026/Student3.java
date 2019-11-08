package com.banyuan.d1026;

import java.util.ArrayList;
import java.util.List;

public class Student3 {
    private int id;
    private String name;
    private int EScore;
    private  int MScore;
    private int CScore;
    private  int HScore;
    private int DScore;

    public int getMin(){
        List<Integer> list = new ArrayList<>() ;
        list.add(EScore);
        list.add(MScore);
        list.add(CScore);
        list.add(HScore);
        list.add(DScore);
        int min =EScore;
        for(int i=0;i<list.size();i++){
            if(list.get(i)<min) {
                min=list.get(i);
            }
        }
        return min;
    }

    public int getMax(){
        List<Integer> list = new ArrayList<>() ;
        list.add(EScore);
        list.add(MScore);
        list.add(CScore);
        list.add(HScore);
        list.add(DScore);
        int max =EScore;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>max) {
                max=list.get(i);
            }
        }
        return max;
    }

    @Override
    public String toString() {
        return "Student3{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", EScore=" + EScore +
                ", MScore=" + MScore +
                ", CScore=" + CScore +
                ", HScore=" + HScore +
                ", DScore=" + DScore +
                '}' + ",最低分"+getMin()+ ",最高分"+getMax()+",总分"+(EScore+MScore+CScore+HScore+DScore);
    }

    public Student3(int id, String name, int EScore, int MScore, int CScore, int HScore, int DScore) {
        this.id = id;
        this.name = name;
        this.EScore = EScore;
        this.MScore = MScore;
        this.CScore = CScore;
        this.HScore = HScore;
        this.DScore = DScore;
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

    public int getDScore() {
        return DScore;
    }

    public void setDScore(int DScore) {
        this.DScore = DScore;
    }
}
