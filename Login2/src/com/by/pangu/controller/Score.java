package com.by.pangu.controller;

import com.by.pangu.domain.ScoreRecord;
import com.by.pangu.domain.User;
import com.by.pangu.service.UserService;
import com.by.pangu.serviceimpl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Vector;

/**
 * @author edz
 */
public class Score extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置请求信息的解码格式
        req.setCharacterEncoding("utf-8");
        //设置响应信息的编码格式
        resp.setCharacterEncoding("utf-8");
        //设置浏览器的解码格式
        resp.setContentType("text/html;charset=utf-8");
        String a=req.getParameter("type");
        int b = Integer.valueOf(a);
        int aa;
        if(b==1){
            aa=-3;
        }else if(b==2){
            aa=-6;
        }else {
            aa=-9;
        }
        String name = req.getParameter("name");
        String pwd = req.getParameter("pwd");
        User u = null;
        String tel= null;
        Vector<ScoreRecord> v = null;
        UserService us = new UserServiceImpl();
        us.updateUser(name,pwd,aa);
        try {
            u = us.findUser(name,pwd);
            tel = u.getTel();
            int id = u.getId();
            v =  us.findSrecord(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        int score = u.getScore();
        req.setAttribute("v",v);
        req.setAttribute("tel",tel);
        req.setAttribute("aa",aa);
        req.setAttribute("score",score);
        req.getRequestDispatcher("success2.jsp").forward(req,resp);
    }
}
