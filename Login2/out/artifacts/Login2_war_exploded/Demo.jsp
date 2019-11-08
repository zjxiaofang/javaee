<%--
  Created by IntelliJ IDEA.
  User: edz
  Date: 2019-11-03
  Time: 10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%!int day = 3;%>
<html>

<head>
    <title>Title</title>
</head>
<body>
<%--    <%out.println("我的ip地址是:"+request.getRemoteAddr());%>--%>
<%--<%--%>
<%--    if(day==6||day==7){--%>
<%--    out.print("周末");--%>
<%--}else{--%>
<%--    out.print("不是周末");--%>
<%--}--%>
<%--%>--%>
<body>
<%--    <%out.println("我的ip地址是:"+request.getRemoteAddr());%>--%>
<%
    int sum = 0;
    for(int i =1;i<=100;i++){
        sum+=i;
    }
    out.println(sum);
%>
<%--<h3>实例</h3>--%>
<%--<%--%>
<%--switch(day){--%>
<%--    case 1:--%>
<%--        out.println("星期一");--%>
<%--        break;--%>
<%--    case 2:--%>
<%--        out.println("星期二");--%>
<%--        break;--%>
<%--    case 3:--%>
<%--        out.println("星期三");--%>
<%--        break;--%>
<%--    case 4:--%>
<%--        out.println("星期四");--%>
<%--        break;--%>
<%--    case 5:--%>
<%--        out.println("星期五");--%>
<%--        break;--%>
<%--    case 6:--%>
<%--        out.println("星期六");--%>
<%--        break;--%>
<%--    case 7:--%>
<%--        out.println("星期七");--%>
<%--        break;--%>
<%--    default:--%>
<%--        out.println("不存在");--%>
<%--}--%>
<%--%>--%>

</body>
</html>
