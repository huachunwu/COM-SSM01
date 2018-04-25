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
    <link href="${pageContext.request.contextPath}/zui/lib/datatable/zui.datatable.min.css" rel="stylesheet">
</head>
<button type="button" style="color: #ea644a ;margin:2em;" class="text-right btn btn-primary" id="trigger1"><i class="icon icon-plus-sign"></i>&nbsp;<small>添加</small></button>
<body>
<table class="table datatable">
    <thead>
    <tr>
        <th>id</th>
        <th>用户名</th>
        <th>文章标题</th>
        <th>文章类型</th>
        <th>文章状态</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${wirterAll}" var="wirter">
        <tr>
            <td>${wirter.wId}</td>
            <td>${wirter.sysUser.name}</td>
            <td>${wirter.title}</td>
            <td>${wirter.wtype.wTypeName}</td>
            <c:if test="${wirter.wSign=='0'}">
                <td>未发布<i class="icon icon-minus-sign" style="color: #0a67fb"></i></td>
            </c:if>
            <c:if test="${wirter.wSign=='1'}">
                <td>已发布<i class="icon icon-check-circle" style="color: green;"></i></td>
            </c:if>
            <td><a href="${pageContext.request.contextPath}/wirter/findWirterById.cms?wId=${wirter.wId}"><i
                    class="icon icon-edit" style="color: #ea644a"></i></a>
                <a href="${pageContext.request.contextPath}/wirter/delWirter.cms?wId=${wirter.wId}" class="delWid"><i
                        class="icon icon-trash" style="color: #ea644a"></i></a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<script src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
<script src="${pageContext.request.contextPath}/zui/js/zui.js"></script>
<script src="${pageContext.request.contextPath}/zui/lib/datatable/zui.datatable.js"></script>
<script>
    $('table.datatable').datatable();
    $("#trigger1").on("click",function () {
        window.location.href = "${pageContext.request.contextPath}/wirter/WirterToAddView.cms";
    })
    $(".delWid").on("click",function () {
        if (confirm("你确定要删除本文章吗")){
            return true;
        } else {
            return false;
        }
    })
</script>
</body>
</html>