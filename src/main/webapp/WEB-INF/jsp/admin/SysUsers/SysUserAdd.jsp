<%--
  Created by IntelliJ IDEA.
  User: yhmi
  Date: 2018/4/21
  Time: 16:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>yhmi内容管理系统</title>
    <!--ZUI Css-->
    <link href="${pageContext.request.contextPath}/zui/css/zui.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/zui/css/zui-theme.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/zui/lib/datetimepicker/datetimepicker.css" rel="stylesheet">
</head>
<body>
<form action="${pageContext.request.contextPath}/sysUser/addSysUser.cms" method="post" class="col-md-offset-2 col-md-8">
    <br/>
    <br/>
    <span class="label label-badge   label-success" style="font-size: 1.3em">用户添加</span>
    <br/>
    <br/>
    <div class="input-control has-label-left">
        <input id="username" type="text" class="form-control" placeholder="" name="username">
        <label for="username" class="input-control-label-left">登录用户</label>
    </div>
    <div class="input-control has-label-left">
        <input id="password" type="text" class="form-control" placeholder="" name="password">
        <label for="password" class="input-control-label-left">登录密码</label>
    </div>
    <div class="input-control has-label-left">
        <input id="telephone" type="tel" class="form-control" placeholder="" name="telephone" >
        <label for="telephone" class="input-control-label-left">联系方式</label>
    </div>
    <div class="input-control has-label-left">
        <input id="birthday" type="text" class="form-control form-date" placeholder="" name="birthday"  readonly>
        <label for="birthday" class="input-control-label-left">生日</label>
    </div>
    <div class="input-control">
        性别：
           <label class="radio-inline">
               <input type="radio" name="sex" value="0"> 男
           </label>
           <label class="radio-inline">
               <input type="radio" name="sex" value="1"> 女
           </label>
    </div>
    <div class="input-control has-label-left">
        <input id="name" type="text" class="form-control" placeholder="" name="name">
        <label for="name" class="input-control-label-left">名字</label>
    </div>
    <div class="input-control has-label-left">
        <input id="email" type="email" class="form-control" placeholder="" name="email" >
        <label for="email" class="input-control-label-left">邮箱</label>
    </div>
    <div class="input-control has-label-left">
        <input id="address" type="text" class="form-control" placeholder="" name="address">
        <label for="address" class="input-control-label-left">地址</label>
    </div>
    <div class="input-control has-label-left">
        <select class="form-control" name="sign" id="sign">
                <option value="0">禁用</option>
                <option value="1">启用</option>
        </select>
        <label for="sign" class="input-control-label-left">状态:</label>
    </div>
    <div class="input-control has-label-left">
        <select class="form-control" name="roleId" id="roleId">
                <option value="1">管理员</option>
                <option value="2" >普通用户</option>
        </select>
        <label for="roleId" class="input-control-label-left">所属角色</label>
    </div>
    <br/>
    <button type="submit" class="btn btn-primary">添加用户</button>
</form>
<script src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
<script src="${pageContext.request.contextPath}/zui/js/zui.js"></script>
<script src="${pageContext.request.contextPath}/zui/lib/datetimepicker/datetimepicker.js"></script>
<script>
    $(".form-date").datetimepicker(
        {
            language:  "zh-CN",
            weekStart: 1,
            todayBtn:  1,
            autoclose: 1,
            todayHighlight: 1,
            startView: 2,
            minView: 2,
            forceParse: 0,
            format: "yyyy/mm/dd"
        });
</script>
</body>
</html>