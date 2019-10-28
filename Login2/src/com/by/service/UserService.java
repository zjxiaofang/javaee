package com.by.service;

import com.by.domain.User;

import java.sql.SQLException;

public interface UserService {
    User findUser(String name, String pwd) throws SQLException;

    void updateUser(String name, String pwd, int aa);
}
