<%--
  Created by IntelliJ IDEA.
  User: yhmi
  Date: 2018/4/15
  Time: 14:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>yhmi内容管理系统</title>
    <!--ZUI Css-->
    <link href="${pageContext.request.contextPath}/zui/css/zui.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/zui/css/zui-theme.css" rel="stylesheet">
    <style>
        body{
        //background-color: rgba(0,0,0,0.0);
        //background-color:red;
        }
    </style>
</head>
<body>
<!--导航栏-->

<nav class="navbar navbar-inverse" role="navigation">
    <div class="container-fluid">
        <!--导航头部-->
        <div class="navbar-header">
            <!--导航切换按钮-->
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse-example">
                <span class="sr-only">切换导航</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <!-- 品牌名称或logo -->
            <a class="navbar-brand" href="#">YHMI</a>
        </div>
        <!-- 导航项目 -->
        <div class="collapse navbar-collapse navbar-collapse-example">
            <!-- 一般导航项目 -->
            <ul class="nav navbar-nav">
                <li class="active"><a href="#"><i class="icon icon-home"></i>&nbsp;&nbsp;前台页面</a></li>
            </ul>
            <!-- 右侧的导航项目 -->
            <ul class="nav navbar-nav navbar-right">
                <li><a href="your/nice/url"><i class="icon icon-question"></i>&nbsp;&nbsp;帮助</a></li>
                <li><a href="#"><i class="icon icon-chat-dot"></i> 未处理业务&nbsp;&nbsp;<span class="label label-badge label-info">Default</span></a> </li>
                <li><a href="#"><i class="icon icon-chat-line"></i> 待审核信息&nbsp;&nbsp;<span class="label label-badge label-warning">Default</span></a> </li>
                <li class="dropdown">
                    <a href="your/nice/url" class="dropdown-toggle" data-toggle="dropdown">${SysUser.name}<b class="caret"></b></a>
                    <ul class="dropdown-menu" role="menu">
                        <li><a href="your/nice/url"><i class="icon icon-user"></i> 个人信息</a></li>
                        <li><a href="your/nice/url"><i class="icon icon-edit-sign"></i> 修改密码</a></li>
                        <li class="divider"></li>
                        <li><a href="your/nice/url"><i class="icon icon-signout"></i> 用户注销</a></li>
                    </ul>
                </li>
            </ul>
        </div><!-- END .navbar-collapse -->
    </div>
</nav>
<!-- jQuery (ZUI中的Javascript组件依赖于jQuery) -->
<script src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
<!-- ZUI Javascript组件 -->
<script src="${pageContext.request.contextPath}/zui/js/zui.js"></script>
</body>
</html>
