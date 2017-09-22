<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/5
  Time: 14:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Modify修改密码</title>
</head>
<body>
<form action="/ModifyUserController" method="post">
    Username:<input type="text" name = "username"><br>
    Newpassword:<input type="password" name="newpassword"><br>
    ReNewpassword:<input type="password" name="renewpassword"><br>
    <input type="submit" value="sbumit">
    <input type="reset" value="reset">
</form>
</body>
</html>
