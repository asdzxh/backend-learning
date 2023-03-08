
<%--
  Created by IntelliJ IDEA.
  User: xuelong
  Date: 2023/2/11
  Time: 21:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<%
  request.setAttribute("path", request.getContextPath());
%>

<html>
<head>
  <title>Title</title>
</head>
<body>

  <h1>问卷调查</h1>
  <h2>您的姓名</h2>
  <p>${name}</p>
  <h2>您的学习方向</h2>
  <p>${course}</p>
  <h2>您的学些目的</h2>
  <p>${purpose}</p>

</body>
</html>
