package com.by.pangu.serviceimpl;

import com.by.pangu.domain.ScoreRecord;
import com.by.pangu.domain.User;
import com.by.pangu.mapper.UserDao;
import com.by.pangu.mapperimpl.UserDaoImpl;
import com.by.pangu.service.UserService;

import java.sql.SQLException;
import java.util.Vector;

/**
 * @author edz
 */
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

    @Override
    public Vector<ScoreRecord> findSrecord(int id) {
        UserDao ud = new UserDaoImpl();
        return ud.findRecord(id);
    }
}
