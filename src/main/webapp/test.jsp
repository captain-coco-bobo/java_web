<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/8
  Time: 12:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/result" method="post">
    请输入验证码：<input type="text" name="code">
    <input type="submit" value="确定">
</form>
<img alt="验证码" id="scode" src="/testCode" >
<a href="#" onclick="javascript:flushCode();">看不清?</a>

</body>
</html>
