<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/5
  Time: 13:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>WelComeToHome</title>
</head>
<body>
        <form action="/loginUserController" method="post">
            Username: <input type="text" name="username" style="font-size: 36px"><br>
            Password: <input type="password" style="font-size: 36px" name="password"><br>
            请输入验证码：<input type="text" name="code"><br>
            <input type="submit" value="submit"style="font-size: 36px">
            <input type="reset"value="reset" style="font-size: 36px">
        </form>
        <img alt="验证码" id="scode" src="/testCode" >
        <a href="#" onclick="javascript:flushCode();">看不清?</a>
</body>
</html>
