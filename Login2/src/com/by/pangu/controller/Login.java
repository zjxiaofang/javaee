package com.by.pangu.controller;

import com.by.pangu.domain.User;
import com.by.pangu.service.UserService;
import com.by.pangu.serviceimpl.UserServiceImpl;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @author edz
 */
public class Login extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置请求信息的解码格式
        req.setCharacterEncoding("utf-8");
        //设置响应信息的编码格式
        resp.setCharacterEncoding("utf-8");
        //设置浏览器的解码格式
        resp.setContentType("text/html;charset=utf-8");
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
