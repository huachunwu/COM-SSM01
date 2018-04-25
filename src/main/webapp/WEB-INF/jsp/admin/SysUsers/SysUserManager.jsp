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
<body>
    <button type="button" style="color: #ea644a ;margin:2em;" class="text-right btn btn-primary " id="trigger1"><i class="icon icon-plus-sign"></i>&nbsp;<small>添加</small></button>

<table class="table datatable">
    <thead>
    <tr>
        <th>id</th>
        <th>登录名</th>
        <th>联系方式</th>
        <th>用户名</th>
        <th>状态</th>
        <th>所属角色</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${sysUserAll}" var="sysUser">
        <tr>
            <td>${sysUser.uid}</td>
            <td>${sysUser.username}</td>
            <td>${sysUser.telephone}</td>
            <td>${sysUser.name}</td>
            <c:if test="${sysUser.sign=='0'}">
                <td style="color: #ea644a">禁用<i class="icon icon-toggle-on" style="color: #ea644a"></i></td>

            </c:if>
            <c:if test="${sysUser.sign=='1'}">
                <td style="color: #38b03f">启用<i class="icon icon-toggle-on" style="color: #38b03f"></i></td>
            </c:if>
            <th>${sysUser.sysRole.roleName}</th>
            <td><a href="${pageContext.request.contextPath}/sysUser/findSysUserByUid.cms?uId=${sysUser.uid}"><i
                    class="icon icon-edit" style="color: #ea644a"></i></a>
                <a href="${pageContext.request.contextPath}/sysUser/delSysUserByUid.cms?uId=${sysUser.uid}" class="delWid"><i
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
        window.location.href = "${pageContext.request.contextPath}/sysUser/toAdd.cms";
    })
    $(".delWid").on("click",function () {
        if (confirm("你确定要删除此用户吗")){
            return true;
        } else {
            return false;
        }
    })
</script>
</body>
</html>