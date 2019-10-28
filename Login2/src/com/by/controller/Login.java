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

public class Login extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("userName");
        String pwd = req.getParameter("password");
        User user = new User(name,pwd);
        UserService us = new UserServiceImpl();
        User u = null;
        try {
            u = us.findUser(name,pwd);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if(u!=null){
            String restMsg = "输入正确";
            req.setAttribute("restMsg",restMsg);
            req.setAttribute("name",name);
            req.setAttribute("pwd",pwd);
            req.getRequestDispatcher("success.jsp").forward(req,resp);
        }else{
            String restMsg = "输入的:" + pwd + "密码错误";
            req.setAttribute("restMsg", restMsg);
            req.getRequestDispatcher("error.jsp").forward(req, resp);
        }
    }
}
