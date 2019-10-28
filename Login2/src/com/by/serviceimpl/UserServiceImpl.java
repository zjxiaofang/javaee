package com.by.serviceimpl;

import com.by.domain.User;
import com.by.mapper.UserDao;
import com.by.mapperimpl.UserDaoImpl;
import com.by.service.UserService;

import java.sql.SQLException;

public class UserServiceImpl implements UserService {
    @Override
    public User findUser(String name, String pwd) throws SQLException {
        UserDao ud = new UserDaoImpl();
        return ud.selectOne(name,pwd);
    }

    @Override
    public void updateUser(String name, String pwd, int aa) {
        UserDao ud = new UserDaoImpl();
        ud.changeScore(name,pwd,aa);

    }
}
