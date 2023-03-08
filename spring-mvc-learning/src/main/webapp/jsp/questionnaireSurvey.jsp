<%--
  Created by IntelliJ IDEA.
  User: xuelong
  Date: 2023/3/7
  Time: 16:38
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
<form method="get" action="${path}/user/q">
    <h1>问卷调查</h1>
    <h2>您的姓名</h2>
    <input type="text" name="name"><br/>
    <h2>您的学习方向</h2>
    <select name="course">
        <option value="java">java</option>
        <option value="前端">前端</option>
        <option value="c">c</option>
    </select><br/>
    <h2>您的学习目的</h2>
    <div>
        <label>
            <input type="checkbox" name="purpose" value="就业找工作">
            就业找工作
        </label>
        <label>
            <input type="checkbox" name="purpose" value="工作要求">
            工作要求
        </label>
        <label>
            <input type="checkbox" name="purpose" value=" 兴趣爱好">
            兴趣爱好
        </label>
        <label>
            <input type="checkbox" name="purpose" value="其他">
            其他
        </label>
    </div>
    <input type="submit" value="提交">
</form>

</body>
</html>
