<%--
  Created by IntelliJ IDEA.
  User: edz
  Date: 2019-10-27
  Time: 11:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

<%-- <%="<\% %\> \' \""%>--%>
<%
  out.print("<"+"%");
%>

 <%="a"%>
  <%! int i = 3;%>
  <%=(new java.util.Date()).toLocaleString()%>
  <%out.println(i++);%>
  </body>
</html>
