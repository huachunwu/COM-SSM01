
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
        <p class="with-padding bg-default row"><h1>图片轮播图列表修改</h1></p>
    <div class="row">
        <form action="${pageContext.request.contextPath}/pictureManager/addPictureManager.cms" method="post">
            <input type="hidden" name="pId" value="${pictureManager.pId}">
            <div class="input-control has-icon-left">
                <input id="pName" type="text" class="form-control" placeholder="列表名" name="pName" value="${pictureManager.pName}">
                <label for="pName" class="input-control-icon-left"><i class="icon icon-file-text "></i></label>
            </div>
            <br/>
           <div>
               <c:if test="${pictureManager.pState=='1'}">
                   <label class="radio-inline">设置默认状态</label>
                   <label class="radio-inline">
                       <input type="radio" name="pState" value="1" checked>是
                   </label>
                   <label class="radio-inline">
                       <input type="radio" name="pState" value="0"> 否
                   </label>
               </c:if>
               <c:if test="${pictureManager.pState=='0'}">
                   <label class="radio-inline">设置默认状态</label>
                   <label class="radio-inline">
                       <input type="radio" name="pState" value="1">是
                   </label>
                   <label class="radio-inline">
                       <input type="radio" name="pState" value="0" checked> 否
                   </label>
               </c:if>
           </div>
            <br/>
            <button type="submit" class="btn btn-primary">提交</button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <a href="${pageContext.request.contextPath}/pictureList/pictureListToAddView.cms?pId=${pictureManager.pId}" style="color: #ea644a" class="text-right btn btn-primary" id="trigger1"><i class="icon icon-plus-sign"></i>&nbsp;<small>添加</small></a>
        </form>
    </div>

    <div class="cards">
        <c:if test="${pictureManager.pictureLists!=null}">
            <c:forEach items="${pictureManager.pictureLists}" var="picture">
                <div class="col-xs-3">
                    <div class="card">
                        <img src="${pageContext.request.contextPath}/upload/${picture.pLUrl}" alt="">
                        <div class="card-heading"><strong>${picture.depict}</strong></div>
                        <div class="card-content text-muted">
                            <a href="${pageContext.request.contextPath}/pictureList/findPictureByPLId.cms?pLId=${picture.pLId}">
                                <i class="icon-heart"></i> 修改
                            </a>
                            <div class="pull-right text-danger"><a href="${pageContext.request.contextPath}/pictureManager/pLid=${picture.pLId}"><i class="icon-heart-empty"></i>删除</a> </div>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </c:if>
        <c:if test="${pictureManager.pictureLists==null}">
            <p class="hl-default">你没有添加数据</p>
        </c:if>
    </div>
</div>
<script src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
<script src="${pageContext.request.contextPath}/zui/js/zui.js"></script>
</body>
