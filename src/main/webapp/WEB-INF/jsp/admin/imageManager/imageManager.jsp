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
<button type="button" style="color: #ea644a" class="text-right btn btn-primary" id="trigger1"><h4><i class="icon icon-plus-sign"></i>&nbsp;<small>添加</small></h4></button>
<table class="table datatable">
    <thead>
    <tr>
        <th>id</th>
        <th>列表名称</th>
        <th>是否默认</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${pictureManagerList}" var="pictureManager">
        <tr>
            <td>${pictureManager.pId}</td>
            <td>${pictureManager.pName}</td>
            <c:if test="${pictureManager.pState=='1'}">
                <td><i class="icon icon-check-circle-o" style="color: green;"></i></td>
            </c:if>
            <c:if test="${pictureManager.pState!='1'}">
                <td><i class="icon icon-remove-circle" style="color: red;"></i></td>
            </c:if>
            <td>
                <a href="${pageContext.request.contextPath}/pictureManager/editToView.cms"> <i class="icon icon-edit"></i></a> <a href="#"><i class="icon icon-trash"></i></a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<script src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
<script src="${pageContext.request.contextPath}/zui/js/zui.js"></script>
<script src="${pageContext.request.contextPath}/zui/lib/datatable/zui.datatable.js"></script>
<script>
    $("#trigger1").on("click",function () {
        window.location.href = "${pageContext.request.contextPath}/pictureManager/addPictureManagerToView.cms";
    })
</script>
</body>
</html>