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
</head>
<body>
<div class="container" style="padding-top: 2em">
    <p class="with-padding bg-default row"><h1>图片轮播图列表添加</h1></p>
    <div class="row">
        <form action="${pageContext.request.contextPath}/pictureManager/addPictureManager.cms" method="post">
            <div class="input-control has-icon-left">
                <input id="pName" type="text" class="form-control" placeholder="列表名" name="pName">
                <label for="pName" class="input-control-icon-left"><i class="icon icon-file-text "></i></label>
            </div>
            <br/>
           <div>
               <label class="radio-inline">设置默认状态</label>
               <label class="radio-inline">
                   <input type="radio" name="pState" value="1">是
               </label>
               <label class="radio-inline">
                   <input type="radio" name="pState" value="0" checked> 否
               </label>
           </div>
            <br/>
            <button type="submit" class="btn btn-primary">提交</button>
        </form>
    </div>
</div>
<script src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
<script src="${pageContext.request.contextPath}/zui/js/zui.js"></script>
</body>
