package com.by.mapper;

import com.by.domain.User;

import java.sql.SQLException;

public interface UserDao {

    User selectOne(String name, String pwd) throws SQLException;

    void changeScore(String name, String pwd, int aa);
}
