<%--
  Created by IntelliJ IDEA.
  User: yhmi
  Date: 2018/4/15
  Time: 14:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>登录</title>
    <!--ZUI Css-->
    <link href="${pageContext.request.contextPath}/zui/css/zui.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/login.css" rel="stylesheet">
</head>
<body>
<!--布局-->
<div class="container-fluid">
    <!--登录表单-->
    <form action="${pageContext.request.contextPath}/sysUser/login.cms" method="post" id="login">
        <br/>
        <!--用户登录-->
        <div class="input-control has-icon-left has-icon-right row col-sm-offset-3 col-sm-6 col-sm-offset-3">
            <!--用户登录框-->
            <input id="username" type="text" class="form-control" placeholder="用户名" name="username">
            <!--用户输入框中的user图片-->
            <label for="username" class="input-control-icon-left col-sm-6"><i class="icon icon-user"></i> </label>
            <!--用户登录的后半部分-->
            <label for="username" class="input-control-icon-right col-sm-3" id="user_message"></label>
            <span></span>
        </div>
        <!--密码输入框-->
        <div class="input-control has-icon-left row col-sm-offset-3 col-sm-6 col-sm-offset-3">
            <input id="password" type="password" class="form-control" placeholder="密码" name="password">
            <label for="password" class="input-control-icon-left"><i class="icon icon-key"></i></label>
        </div>
        <!--验证码-->
        <div class="input-control row col-sm-offset-3 col-sm-6 col-sm-offset-3">
            <input id="check" type="text" placeholder="验证码" class="form-control col-xs-6" style="width: 50%" name="piccode">
            <img src="${pageContext.request.contextPath}/CheckImage.cms" height="40" width="160" class="col-xs-6" id="piccode">
            <span style="color: #ea644a">${msg}</span>
        </div>
        <br/>
        <br/>
        <!--登录按钮-->
        <div class="row col-sm-offset-3 col-sm-6 col-sm-offset-3">
            <button id="loading" type="button" class="btn btn-primary btn-block" >登录</button>
        </div>
        <br/>
    </form>
</div>
<!-- jQuery (ZUI中的Javascript组件依赖于jQuery) -->
<script src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
<!-- ZUI Javascript组件 -->
<script src="${pageContext.request.contextPath}/zui/js/zui.js"></script>
<script src="${pageContext.request.contextPath}/js/login.js"></script>
<script>
    $("#piccode").on("click",function () {
        var time=new Date().getTime();
        $(this).attr("src","${pageContext.request.contextPath}/CheckImage.cms?d="+time);
    });
</script>
</body>
</html>
