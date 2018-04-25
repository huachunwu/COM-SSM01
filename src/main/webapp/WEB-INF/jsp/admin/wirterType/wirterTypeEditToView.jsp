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
</head>
<body>
<form action="${pageContext.request.contextPath}/wtype/editWTypebyId.cms" method="post" class="col-md-offset-2 col-md-8">
    <br/>
    <br/>
    <span class="label label-badge   label-success" style="font-size: 1.3em">文章类型修改</span>
    <br/>
    <br/>
    <div class="input-control has-label-left">
        <input id="wTypeId" type="text" class="form-control" placeholder="" name="wTypeId" value="${wtypeBywtypeId.wTypeId}" readonly>
        <label for="wTypeId" class="input-control-label-left">类型id</label>
    </div>
    <div class="input-control has-label-left">
        <input id="wTypeName" type="text" class="form-control" placeholder="" name="wTypeName" value="${wtypeBywtypeId.wTypeName}">
        <label for="wTypeName" class="input-control-label-left">类名</label>
    </div>
    <button type="submit" class="btn btn-primary">修改文章类型</button>
</form>
<script src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
<script src="${pageContext.request.contextPath}/zui/js/zui.js"></script>
</body>
</html>