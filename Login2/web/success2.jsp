<%@ page import="java.util.Vector" %>
<%@ page import="com.by.pangu.domain.ScoreRecord" %>
<%@ page import="com.by.pangu.domain.User" %><%--
  Created by IntelliJ IDEA.
  User: edz
  Date: 2019-10-29
  Time: 10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1" class="login-form" align="center">
    <tr>
        <td>名字</td>
        <td>电话</td>
        <td>总分</td>
        <td>扣分</td>
        <td>剩余分</td>
        <td>修改时间</td>
    </tr>
    <%
        Vector v = (Vector) request.getAttribute("v");
        String tel = (String) request.getAttribute("tel");
        for (int i = 0; i < v.size(); i++) {
            ScoreRecord sr = (ScoreRecord) v.get(i);
    %>
    <tr>
        <td><%=  sr.getName()%></td>
        <td><%=  tel%></td>
        <td><%=  sr.getScore()+sr.getScore()+sr.getScore2()%></td>
        <td><%=  sr.getScore()%></td>
        <td><%=  sr.getScore()+sr.getScore2()%></td>
        <td><%=  sr.getGmt_modified() %></td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>