<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/3
  Time: 23:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>WeleComeToRegist</title>
</head>
<body>
        <form action="/RegistUserController" method="post">
            Username:<input type="text" name = "username"><br>
            Password:<input type="password" name="password"><br>
            Repassword:<input type="password" name="repassword"><br>
            <input type="submit" value="sbumit">
            <input type="reset" value="reset">
        </form>
</body>
</html>
