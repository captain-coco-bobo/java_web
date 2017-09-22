<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="com.jianghaobo.User.MerchantUser" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/7
  Time: 0:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <% List merchants = (List) request.getAttribute("merchantName");
            for (int i = 0; i < merchants.size(); i++){
                MerchantUser merchantUser = (MerchantUser) merchants.get(i);
                String user = merchantUser.getUsername();

                %>

                 <a href="/CommodityController?merchantUserId=<%=merchantUser.getId()%>"><%= user %></a><br>

          <%  }%>

</body>
</html>
