package com.by.pangu.mapper;

import com.by.pangu.domain.ScoreRecord;
import com.by.pangu.domain.User;

import java.sql.SQLException;
import java.util.Vector;

/**
 * @author edz
 */
public interface UserDao {

    User selectOne(String name, String pwd) throws SQLException;

    void changeScore(String name, String pwd, int aa);

    Vector<ScoreRecord> findRecord(int id);
}
