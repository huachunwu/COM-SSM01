<%--
  Created by IntelliJ IDEA.
  User: yhmi
  Date: 2018/4/15
  Time: 14:20
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
</head>
<body>
<nav class="menu" data-ride="menu" style="background-color: #ffffff">
    <ul id="treeMenu" class="tree tree-menu" data-ride="tree">
    </ul>
</nav>
<!-- jQuery (ZUI中的Javascript组件依赖于jQuery) -->
<script src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
<!-- ZUI Javascript组件 -->
<script src="${pageContext.request.contextPath}/zui/js/zui.js"></script>
<script src="${pageContext.request.contextPath}/js/left.js"></script>
<script>
    $(function () {
        $.post("sysRole/listByRoleId.cms",function (data) {
            $("#treeMenu").tree({data: data});
        });
    });
</script>
</body>
</html>
