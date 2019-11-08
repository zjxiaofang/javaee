package com.by.pangu.util.filter;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginFilter implements Filter {

    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        chain.doFilter(req, resp);
        HttpServletRequest request = (HttpServletRequest)req;
        HttpServletResponse response = (HttpServletResponse)resp;
        String uri = request.getRequestURI();
        if(uri.endsWith("login.jsp")){
            chain.doFilter(request,response);
            return;
        }


    }

    @Override
    public void init(FilterConfig config) throws ServletException {

    }

}
