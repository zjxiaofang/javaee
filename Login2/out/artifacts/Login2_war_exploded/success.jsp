<%--
  Created by IntelliJ IDEA.
  User: edz
  Date: 2019-10-28
  Time: 19:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>选择</title>
</head>
<body>
${restMsg}

<form action="score" >
<select name="type"  >
    <option value="0">--请选择--</option>
    <option value="1">违停</option>
    <option value="2">闯红灯</option>
    <option value="3">酒驾</option>
</select>
    <input type="hidden" name="name" value="${name}">
    <input type="hidden" name="pwd" value="${pwd}">
    <br/>
<input type = "submit" value="提交" >
</form>
${score}
</body>
</html>

