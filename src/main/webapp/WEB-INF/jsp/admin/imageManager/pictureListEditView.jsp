
<%--
  Created by IntelliJ IDEA.
  User: yhmi
  Date: 2018/4/15
  Time: 14:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<div class="container" style="padding-top: 2em">
        <p class="with-padding bg-default row"><h1>图片轮播图修改</h1></p>
    <div class="row">
        <form action="${pageContext.request.contextPath}/pictureList/editPictureByPLId.cms" method="post" enctype="multipart/form-data">
            <input type="hidden" name="pId" value="${pictureList.pId}">
            <input type="hidden" name="pLId" value="${pictureList.pLId}">
            <div class="input-control has-icon-left">
                <input id="pName" type="text" class="form-control" placeholder="描述" name="depict" value="${pictureList.depict}">
                <label for="pName" class="input-control-icon-left"><i class="icon icon-file-text "></i></label>
            </div>
            <br/>
            <div class="input-control has-icon-left">
                <input id="input" type="file" class="form-control" placeholder="文件上传" name="file">
                <label for="input" class="input-control-icon-left"><i class="icon icon-file-text "></i></label>
            </div>
            <br/>
            <button type="submit" class="btn btn-primary">提交</button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <a href="${pageContext.request.contextPath}/" style="color: #ea644a" class="text-right btn btn-primary" id="trigger1"><i class="icon icon-plus-sign"></i>&nbsp;<small>添加</small></a>
        </form>
    </div>
</div>
<script src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
<script src="${pageContext.request.contextPath}/zui/js/zui.js"></script>
</body>
