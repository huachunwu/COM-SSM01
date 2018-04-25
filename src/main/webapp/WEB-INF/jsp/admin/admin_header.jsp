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
            <a class="navbar-brand" href="${pageContext.request.contextPath}/index.jsp">YHMI</a>
        </div>
        <!-- 导航项目 -->
        <div class="collapse navbar-collapse navbar-collapse-example">
            <!-- 一般导航项目 -->
            <ul class="nav navbar-nav">
                <li class="active"><a href="${pageContext.request.contextPath}/index.jsp"><i class="icon icon-home"></i>&nbsp;&nbsp;前台页面</a></li>
            </ul>
            <!-- 右侧的导航项目 -->
            <ul class="nav navbar-nav navbar-right">
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">${SysUser.name}<b class="caret"></b></a>
                    <ul class="dropdown-menu" role="menu">
                        <li><a href="#" data-toggle="modal" data-target="#myModal"><i class="icon icon-edit-sign"></i> 修改密码</a></li>
                        <li class="divider"></li>
                        <li><a href="sysUser/logOut.cms" id="logOut"><i class="icon icon-signout"></i> 用户注销</a></li>
                    </ul>
                </li>
            </ul>
        </div><!-- END .navbar-collapse -->
    </div>
</nav>

<div class="modal fade" id="myModal">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span><span class="sr-only">关闭</span></button>
                <h4 class="modal-title">修改密码</h4>
            </div>
            <div class="modal-body">
               <form action="#" id="update" method="post">
                   <div class="input-control has-icon-right">
                       <input id="password" type="text" class="form-control" placeholder="密码">
                       <label for="password" class="input-control-icon-right"><i class="icon icon-key"></i></label>
                   </div>
                   <div class="input-control has-icon-right">
                       <input id="rpassword" type="text" class="form-control" placeholder="确认密码">
                       <label for="rpassword" class="input-control-icon-right"><i class="icon icon-key"></i></label>
                   </div>
                   <span id="s"></span>
               </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal" id="close">关闭</button>
                <button type="button" class="btn btn-primary" id="save">修改</button>
            </div>
        </div>
    </div>
</div>
<!-- jQuery (ZUI中的Javascript组件依赖于jQuery) -->
<script src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
<!-- ZUI Javascript组件 -->
<script src="${pageContext.request.contextPath}/zui/js/zui.js"></script>
<script src="${pageContext.request.contextPath}/js/header.js"></script>
<script>
    $("#save").on("click",function () {
        var password=$("#password").val();
        var rpassword=$("#rpassword").val();
        if (password!=null){
            if (password==rpassword){
                $('#myModal').modal('toggle', 'center')
                $("#close").button();
            }else {
                $("#s").append("两次输入的密码不相等");
            }
        } else {
            $("#s").append("输入的密码为空");
        }
    });
</script>
</body>
</html>
