package com.by.pangu.mapperimpl;

import com.by.pangu.domain.ScoreRecord;
import com.by.pangu.domain.User;
import com.by.pangu.mapper.UserDao;
import com.by.pangu.util.DBUtil;

import java.sql.*;
import java.util.Vector;

/**
 * @author edz
 */
public class UserDaoImpl implements UserDao {

    @Override
    public User selectOne(String name, String pwd) {
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
        System.out.println(name);
        System.out.println(pwd);
        System.out.println(aa);
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        User user =null;
        try {
            conn = DBUtil.getConnection();
            String sql = "update account3 set score=? where name=? and pwd = ?";
            ps = DBUtil.getPreparedStatement(conn, sql);
            ps.setInt(1,(selectOne(name,pwd).getScore()+aa));
            ps.setString(2, name);
            ps.setString(3, pwd);
            int a = ps.executeUpdate();
            if(a>0){
                System.out.println("成功");
            }else {
                System.out.println("失败");
            }
            String sql2 = "insert into record values(null,?,?,?,?,default,default) ";
            ps = DBUtil.getPreparedStatement(conn, sql2);
            ps.setInt(1,-aa);
            ps.setInt(2,(selectOne(name,pwd).getScore()+aa));
            ps.setInt(3,selectOne(name,pwd).getId());
            ps.setString(4,name);
            int b = ps.executeUpdate();
            if(b>0){
                System.out.println("成功");
            }else {
                System.out.println("失败");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeAll(rs, ps, conn);
        }
    }

    @Override
    public Vector<ScoreRecord> findRecord(int id2) {
        Vector<ScoreRecord> list=new Vector<>();
        Connection conn=null;
        ResultSet rs =null;
        PreparedStatement ps=null;
        try {
            conn=DBUtil.getConnection();
            String sql = "select * from record where uid=? ";
            ps = DBUtil.getPreparedStatement(conn, sql);
            ps.setInt(1,id2);
            rs = ps.executeQuery();

            while(rs.next()){
               int id = rs.getInt("id");
               int score = rs.getInt("score");
               int score2 = rs.getInt("score2");
               int uid = rs.getInt("uid");
               String name = rs.getString("name");
               Date date = rs.getDate("gmt_create");
               Date date2 = rs.getDate("gmt_modified");
               ScoreRecord sr =new ScoreRecord(id,score,score2,uid,name,date,date2);
               list.add(sr);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
            DBUtil.closeAll(rs,ps,conn);
        }
        return list;
}}
