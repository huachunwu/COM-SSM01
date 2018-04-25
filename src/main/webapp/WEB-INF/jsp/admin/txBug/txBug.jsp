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
<form action="${pageContext.request.contextPath}/txBug/findByPams.cms" method="post">
    <br/>
    <div class="row">
        <div class="col-xs-3">
            <input type="text" class="form-control" placeholder="用户名" name="sysUser.name">
        </div>
        <div class="col-xs-3">
            <select class="form-control" name="questionSpeed">
                <option value="">---请选择---</option>
                <option value="0">未处理<i class="icon icon-remove-sign" style="color: #ea644a"></i></option>
                <option value="1">处理中<i class="icon icon-minus-sign"style="color: #0a67fb"></i></option>
                <option value="2">已完成<i class="icon icon-check-circle" style="color: green;"></i></option>
            </select>
        </div>
        <div class="col-xs-3">
            <input type="text" class="form-control" placeholder="地址" name="sysUser.address">
        </div>
        <button type="submit" class="btn btn-primary">查询</button>
    </div>
    <br/>
</form>
<table class="table datatable">
    <thead>
    <tr>
        <th>id</th>
        <th>用户名</th>
        <th>电话</th>
        <th>提交时间</th>
        <th>提交类型</th>
        <th>处理进度</th>
        <th>描述</th>
        <th>地址</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${txBugAllPage.list}" var="txbug">
        <tr>
            <td>${txbug.txId}</td>
            <td>${txbug.sysUser.name}</td>
            <td>${txbug.sysUser.telephone}</td>
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
            <td><a href="${pageContext.request.contextPath}/txBug/editTOView.cms?txId=${txbug.txId}"><i class="icon icon-edit" style="color: #ea644a"></i></a> </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<ul class="pager pager-loose">
    <c:if test="${txBugAllPage.currentPage==1}">
    <li class="previous disabled"><a href="2">«</a></li>
    </c:if>
    <c:if test="${txBugAllPage.currentPage!=1}">
        <li class="previous"><a href="${pageContext.request.contextPath}/txBug/findAll.cms?currentPage=${txBugAllPage.currentPage-1}">«</a></li>
    </c:if>
    <c:forEach begin="1" end="${txBugAllPage.totalPage}" var="i">
      <c:if test="${txBugAllPage.currentPage==i}">
          <li class="active"><a href="${pageContext.request.contextPath}/txBug/findAll.cms?currentPage=${i}">${i}</a></li>
      </c:if>
        <c:if test="${txBugAllPage.currentPage!=i}">
            <li><a href="${pageContext.request.contextPath}/txBug/findAll.cms?currentPage=${i}">${i}</a></li>
        </c:if>
    </c:forEach>
    <c:if test="${txBugAllPage.currentPage==txBugAllPage.totalPage}">
        <li class="next disabled"><a href="your/nice/url">»</a></li>
    </c:if>
    <c:if test="${txBugAllPage.currentPage!=txBugAllPage.totalPage}">
        <li class="next"><a href="${pageContext.request.contextPath}/txBug/findAll.cms?currentPage=${txBugAllPage.currentPage+1}">»</a></li>
    </c:if>
</ul>
<script src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
<script src="${pageContext.request.contextPath}/zui/js/zui.js"></script>
<script src="${pageContext.request.contextPath}/zui/lib/datatable/zui.datatable.js"></script>
<script>
    $('table.datatable').datatable();
</script>
</body>
</html>