package com.by.mapperimpl;

import com.by.domain.User;
import com.by.mapper.UserDao;
import com.by.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author edz
 */
public class UserDaoImpl implements UserDao {

    @Override
    public User selectOne(String name, String pwd) {
        //数据库
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        User user =null;
        try {
            conn = DBUtil.getConnection();
            String sql = "select * from account3 where name=? and pwd = ?";
            ps = DBUtil.getPreparedStatement(conn, sql);
            ps.setString(1, name);
            ps.setString(2, pwd);
            rs = ps.executeQuery();
            if(rs.next()){
                user = new User(rs.getInt("id"),rs.getString("name"),rs.getString("pwd"),rs.getInt("score"),rs.getString("tel"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeAll(rs, ps, conn);
        }
        return user;
    }

    @Override
    public void changeScore(String name, String pwd, int aa) {
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        User user =null;
        try {
            conn = DBUtil.getConnection();
            String sql = " update account set score=?where name=? and pwd = ?";

            ps = DBUtil.getPreparedStatement(conn, sql);
            ps.setInt(1,12+aa);
            ps.setString(2, name);
            ps.setString(3, pwd);
            int a = ps.executeUpdate();
//            if(rs.next()){
//                user = new User(rs.getInt("id"),rs.getString("name"),rs.getString("pwd"),rs.getInt("score"),rs.getString("tel"));
//            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeAll(rs, ps, conn);
        }


    }
}
