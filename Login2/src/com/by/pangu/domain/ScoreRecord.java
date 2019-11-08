package com.by.pangu.domain;

import java.sql.Date;

/**
 * @author edz
 */
public class ScoreRecord {
    private int id;
    private int score;
    private int score2;
    private int uid;
    private String name;
    private Date gmt_create;
    private Date gmt_modified;

    public Date getGmt_modified() {
        return gmt_modified;
    }

    public ScoreRecord(int id, int score, int score2, int uid, String name, Date gmt_create, Date gmt_modified) {
        this.id = id;
        this.score = score;
        this.score2 = score2;
        this.uid = uid;
        this.name = name;
        this.gmt_create = gmt_create;
        this.gmt_modified = gmt_modified;
    }

    public ScoreRecord() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore2() {
        return score2;
    }

    public void setScore2(int score2) {
        this.score2 = score2;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
