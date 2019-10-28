package com.by.controller;

import com.by.domain.User;
import com.by.service.UserService;
import com.by.serviceimpl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class Score extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
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
        UserService us = new UserServiceImpl();
        us.updateUser(name,pwd,aa);
        try {
            u = us.findUser(name,pwd);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        int score = u.getScore();
        req.setAttribute("score",score);
        req.getRequestDispatcher("success.jsp").forward(req,resp);
    }
}
