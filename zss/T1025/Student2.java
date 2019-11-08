package com.zss.T1025;

public class Student2 {
    private String name;
    private int eScore;
    private int mScore;
    private int cScore;
    private int hScore;

    public Student2(String name, int eScore, int mScore, int cScore, int hScore) {
        this.name = name;
        this.eScore = eScore;
        this.mScore = mScore;
        this.cScore = cScore;
        this.hScore = hScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int geteScore() {
        return eScore;
    }

    public void seteScore(int eScore) {
        this.eScore = eScore;
    }

    public int getmScore() {
        return mScore;
    }

    public void setmScore(int mScore) {
        this.mScore = mScore;
    }

    public int getcScore() {
        return cScore;
    }

    public void setcScore(int cScore) {
        this.cScore = cScore;
    }

    public int gethScore() {
        return hScore;
    }

    public void sethScore(int hScore) {
        this.hScore = hScore;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", eScore=" + eScore +
                ", mScore=" + mScore +
                ", cScore=" + cScore +
                ", hScore=" + hScore +
                '}';
    }
}
