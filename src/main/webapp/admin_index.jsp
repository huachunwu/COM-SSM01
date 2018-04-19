<%--
  Created by IntelliJ IDEA.
  User: yhmi
  Date: 2018/4/15
  Time: 14:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>yhmi内容管理系统</title>
    <!--ZUI Css-->
    <link href="${pageContext.request.contextPath}/zui/css/zui.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/zui/css/zui-theme.css" rel="stylesheet">
    <style>
        body{
            background: url("${pageContext.request.contextPath}/image/2.jpg") no-repeat 40% 0;
        }
    </style>
</head>
<body>
<div class="container-fluid">
    <div class="row">
        <jsp:include page="WEB-INF/jsp/admin/admin_header.jsp" />
    </div>
    <div class="row">
        <div class="col-lg-3">
            <jsp:include page="WEB-INF/jsp/admin/admin_left.jsp"/>
        </div>
        <div class="col-lg-9">
            <jsp:include page="WEB-INF/jsp/admin/admin_context.jsp"/>
        </div>
    </div>
</div>
<script src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
<script src="${pageContext.request.contextPath}/zui/js/zui.js"></script>
</body>
