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
<form action="${pageContext.request.contextPath}/txBug/editById.cms" method="post" class="col-md-offset-3 col-md-6">
    <br/>
    <br/>
    <span class="label label-badge   label-success" style="font-size: 1.3em">业务修改</span>
    <br/>
    <br/>
    <div class="input-control has-label-left">
        <input id="txId" type="text" class="form-control" placeholder="" name="txId" value="${txBugByTxId.txId}" readonly>
        <label for="txId" class="input-control-label-left">业务id:</label>
    </div>
    <div class="input-control has-label-left">
        <input id="txCreatetime" type="text" class="form-control" placeholder="" name="txCreatetime" value="${txBugByTxId.txCreatetime}" readonly>
        <label for="txCreatetime" class="input-control-label-left">业务创建时间:</label>
    </div>
    <div class="input-control has-label-left">
        <input id="sysUser.name" type="text" class="form-control" placeholder="" name="sysUser.name" value="${txBugByTxId.sysUser.name}" readonly>
        <label for="sysUser.name" class="input-control-label-left">用户名:</label>
    </div>
    <div class="input-control has-label-left">
        <input id="sysUser.telephone" type="text" class="form-control" placeholder="" name="sysUser.telephone" value="${txBugByTxId.sysUser.telephone}" readonly>
        <label for="sysUser.telephone" class="input-control-label-left">联系方式</label>
    </div>
    <div class="input-control has-label-left">
        <input id="questionDescribe" type="text" class="form-control" placeholder="" name="questionDescribe" value="${txBugByTxId.questionDescribe}" readonly>
        <label for="questionDescribe" class="input-control-label-left">描述:</label>
    </div>
    <div class="input-control has-label-left">
        <select class="form-control" name="questionSpeed" id="questionSpeed">
            <c:if test="${txBugByTxId.questionSpeed=='0'}">
                <option value="0" selected>未处理</option>
                <option value="1">处理中</option>
                <option value="2">已完成</option>
            </c:if>
            <c:if test="${txBugByTxId.questionSpeed=='1'}">
                <option value="0">未处理</option>
                <option value="1" selected>处理中</option>
                <option value="2">已完成</option>
            </c:if>
            <c:if test="${txBugByTxId.questionSpeed=='2'}">
                <option value="0">未处理</option>
                <option value="1">处理中</option>
                <option value="2" selected>已完成</option>
            </c:if>
        </select>
        <label for="questionSpeed" class="input-control-label-left">状态:</label>
    </div>
    <div class="input-control has-label-left">
        <input id="sysUser.address" type="text" class="form-control" placeholder="" name="sysUser.address" value="${txBugByTxId.sysUser.address}" readonly>
        <label for="sysUser.address" class="input-control-label-left">地址:</label>
    </div>
    <div class="input-control has-label-left">
        <textarea id="solution"  class="form-control" placeholder="解决方案" name="solution">
        </textarea>
        <label for="solution" class="input-control-label-left">解决方案</label>
    </div>
    <br/>
    <button type="submit" class="btn btn-primary">修改</button>
</form>
<script src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
<script src="${pageContext.request.contextPath}/zui/js/zui.js"></script>
<script src="${pageContext.request.contextPath}/zui/lib/datatable/zui.datatable.js"></script>
</body>
</html>