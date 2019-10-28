package com.by.domain;

public class User {
    private int id;
    private String name;
    private String pwd;
    private int score;
    private String tel;

    public User() {
    }

    public User(String name, String pwd, int score, String tel) {
        this.name = name;
        this.pwd = pwd;
        this.score = score;
        this.tel = tel;
    }

    public User(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
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

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", score=" + score +
                ", tel='" + tel + '\'' +
                '}';
    }

    public User(int id, String name, String pwd, int score, String tel) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.score = score;
        this.tel = tel;
    }
}
