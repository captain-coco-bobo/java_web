<%@ page import="com.jianghaobo.User.Commodity" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/20
  Time: 14:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
       <% Commodity commodity = (Commodity) request.getAttribute("commodity");%>
       <% String imgpath = commodity.getPicture();%>
        商品编号<%= commodity.getId()%><br>
        商品名称<%= commodity.getUsername()%><br>
        商品描述<%= commodity.getDescription()%><br>
        商品库存<%= commodity.getInventory()%><br>
        隶属商家<%= commodity.getMerchantid()%><br>
        <img src="<%=imgpath%>">
        <form action="/oreder?<%=System.currentTimeMillis()%>">
            请输入购买的商品数量<input type="text" name="commoditynumber"><br>
            <input type="submit" value="buy">
        </form>


</body>
</html>
