<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2023/3/9
  Time: 20:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%request.setAttribute("path",request.getContextPath()); %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${path}/findOrderUser" method="get">
    <label>订单编号：
        <input type="text" name="orderId">
    </label><br>

    <label>所属用户
        <input type="text" name="user.name">
    </label><br>

    <label>密码
        <input type="password" name="user.password">
    </label><br>

    <input type="submit" value="查询">

</form>

</body>
</html>
