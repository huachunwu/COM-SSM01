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
    <link href="${pageContext.request.contextPath}/zui/lib/tabs/zui.tabs.css" rel="stylesheet">
    <style>
        body{
            background: url("${pageContext.request.contextPath}/image/2.jpg") no-repeat 40% 0;
        }
    </style>
</head>
<body>
<div class="container-fluid">
    <div class="row">
        <jsp:include page="WEB-INF/jsp/admin/admin_header.jsp" />
    </div>
    <div class="row">
        <div class="col-lg-3">
            <jsp:include page="WEB-INF/jsp/admin/admin_left.jsp"/>
        </div>
        <div class="col-lg-9">
            <div class="tabs" id="tabsExample" style="height:600px"></div>
        </div>
    </div>
</div>
<script src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
<script src="${pageContext.request.contextPath}/zui/js/zui.js"></script>
<script src="${pageContext.request.contextPath}/zui/lib/tabs/zui.tabs.js"></script>
<script>
    var tabs=[{
        title:"仪表盘",
        url:"Page/cout.cms",
        icon:"icon icon-dashboard",
        type:"iframe",
        forbidClose: true,
        id:"1"
    }];
    $("#tabsExample").tabs({tabs:tabs});
    $("#treeMenu").on("click","a",function () {
        $('#treeMenu li.active').removeClass('active');
        $(this).closest('li').addClass('active');
        var flag=false;
        var url=$(this).attr("aurl");
        var icon=$(this).find("i").attr("class");
        var title=$(this).text();
        var id=$(this).attr("fid");
        if (id=="1"){
            flag=true;
        } else {
            flag=false;
        }
        var tabs1={
            title:title,
            url:url,
            type:"iframe",
            icon:icon,
            id:id,
            forbidClose:flag
        };
        var myTabs=$("#tabsExample").data("zui.tabs");
        var mySpecialTab = myTabs.getTab(id,true);
        if (url!="#"){
            myTabs.open(tabs1);
        }


    });
</script>
</body>
