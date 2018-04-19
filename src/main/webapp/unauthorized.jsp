<%--
  Created by IntelliJ IDEA.
  User: yhmi
  Date: 2018/4/18
  Time: 10:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="zh-cn">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>无权限访问页面</title>
    <!--ZUI Css-->
    <link href="${pageContext.request.contextPath}/zui/css/zui.css" rel="stylesheet">
</head>
<body>
    <div class="alert alert-warning with-icon">
        <i class="icon icon-frown"></i>
        <div class="content">
            <strong>注意：</strong>
            你无权访问此界面
        </div>
    </div>
<!-- jQuery (ZUI中的Javascript组件依赖于jQuery) -->
<script src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
<!-- ZUI Javascript组件 -->
<script src="${pageContext.request.contextPath}/zui/js/zui.js"></script>
</body>
</html>
