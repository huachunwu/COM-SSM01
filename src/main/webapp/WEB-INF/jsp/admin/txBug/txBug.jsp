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
    <link href="${pageContext.request.contextPath}/zui/lib/datatable/zui.datatable.css" rel="stylesheet">
</head>
<body>
<table class="table datatable">
    <thead>
    <tr>
        <th>id</th>
        <th>用户名</th>
        <th>提交时间</th>
        <th>提交类型</th>
        <th>处理进度</th>
        <th>描述</th>
        <th>地址</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${txBugs}" var="txbug">
        <tr>
            <td>${txbug.txId}</td>
            <td>${txbug.sysUser.name}</td>
            <td>${txbug.txCreatetime}</td>
            <td>${txbug.questionType}</td>
            <c:if test="${txbug.questionSpeed=='0'}">
                <td>未处理<i class="icon icon-remove-sign" style="color: #ea644a"></i> </td>
            </c:if>
            <c:if test="${txbug.questionSpeed=='1'}">
                <td>处理中<i class="icon icon-minus-sign"style="color: #0a67fb"></i> </td>
            </c:if>
            <c:if test="${txbug.questionSpeed=='2'}">
                <td>已完成<i class="icon icon-check-circle" style="color: green;"></i> </td>
            </c:if>
            <td>${txbug.questionDescribe}</td>
            <td>${txbug.sysUser.address}</td>
            <td><a href="${pageContext.request.contextPath}/txId=${txbug.txId}"><i class="icon icon-edit" style="color: #ea644a"></i></a> </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<script src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
<script src="${pageContext.request.contextPath}/zui/js/zui.js"></script>
<script src="${pageContext.request.contextPath}/zui/lib/datatable/zui.datatable.js"></script>
<script>
    $('table.datatable').datatable();
</script>
</body>
</html>