<%--
  Created by IntelliJ IDEA.
  User: edz
  Date: 2019-10-28
  Time: 17:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆</title>
    <link rel = "stylesheet" href="style.css">
</head>

<body>
<form action="login" method="post" class="login-form">
    <h1>登陆页面</h1>
    <div class="txtb">
        <span data-placeholder="用户名"></span>
        <input type="text" name="userName">
    </div>
    <div class="txtb">
        <span data-placeholder="密码"></span>
        <input type="password" name="password">
    </div>
    <input type="submit" class="logbtn" value="登陆">
</form>
</body>
</html>
