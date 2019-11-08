package com.by.pangu.service;

import com.by.pangu.domain.ScoreRecord;
import com.by.pangu.domain.User;

import java.sql.SQLException;
import java.util.Vector;

/**
 * @author edz
 */
public interface UserService {
    User findUser(String name, String pwd) throws SQLException;

    void updateUser(String name, String pwd, int aa);

    Vector<ScoreRecord> findSrecord(int id);
}
