<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2023/3/7
  Time: 16:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
request.setAttribute("path",request.getContextPath());
%>
<html>
<head>
    <title>Title</title>
    <style>
        *{
            border: 0;
            margin: 0;
            padding: 0;
            list-style: none;
            font-family: wodeziti;
        }
        body{
            width: 100%;
            height: 100%;
            overflow-x: hidden;
            position: relative;
        }
        .contanier{
            border: 8px solid white;
            width: 450px;
            height: 300px;
            background-color: lightgoldenrodyellow;
            border-radius: 20px;
            margin: auto;
            position: relative;
            top: 200px;
        }

        .button{
            margin-left: 1.5em;
            margin-right: 1.5em;
            margin-top: 0.5em;
            width: 100px;
            height: 30px;
            cursor: pointer;
            border-radius:10%
        }
        .button:hover{
            background-color: orange;
            color: #111111;
        }
        .td-left{
            width: 100px;
            height: 50px;
            text-align: right;
            color: #A6A6A6
        }
        .td-right{
            padding-left: 50px;
            color: #A6A6A6
        }
        .inp{
            width: 251px;
            height: 32px;
            border: 1px solid #A6A6A6;
            border-radius: 10px;
            padding-left: 10px;
        }
        #p1{
            color: #FFD026;
        }
        #p2{
            color: #A6A6A6;
            font-size: 20px
        }
    </style>
</head>
<body>
<div class="contanier" >
    <div class="cleft" style="float: left;margin: 15px">
        <h3 id="p1" >用户登录</h3>
        <h3 id="p2">User Login</h3>
    </div>
    <div class="cCenter" style="float: left; margin-top: 50px;">
        <form action="${path}/user/u" method="get">
            <table>
                <tbody>
                <tr>
                    <td class="td-left"><label>用户账号</label></td>
                    <td class="td-right"><input type="text" class="inp" name="name" id="name" ></td>
                </tr>
                <tr>
                    <td class="td-left"><label>密码</label></td>
                    <td class="td-right"><input type="password" class="inp" name="password" id="passwprd" ></td>
                </tr>
                </tbody>
            </table>
            <input type="submit" value="登录" class="button" id="login" style="margin-left: 200px">

        </form></div>
</div>

<script>
    $(function () {
        $("#login").click(function () {
            var name = $("#name").val();
            var passwd = $("#password").val();
            if (account == '') {
                $("#accinfo").text("提示:账号不能为空");
            } else if (passwd == '') {
                $("#passinfo").text("提示:密码不能为空");
            }else {
                return true;
            }
            return false;

        })
    })
</script>
</body>
</html>
