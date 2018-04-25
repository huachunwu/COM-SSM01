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
    <link href="${pageContext.request.contextPath}/zui/lib/kindeditor/kindeditor.css" rel="stylesheet">
</head>
<body>
<form action="${pageContext.request.contextPath}/wirter/addWirter.cms" method="post" class="col-md-offset-2 col-md-8">
    <br/>
    <br/>
    <span class="label label-badge   label-success" style="font-size: 1.3em">文章添加</span>
    <br/>
    <br/>
    <div class="input-control has-label-left">
        <input id="title" type="text" class="form-control" placeholder="" name="title" value="${wirterById.title}">
        <label for="title" class="input-control-label-left">文章标题</label>
    </div>
    <div class="input-control has-label-left">
        <select class="form-control" name="wTypeId" id="wTypeId">
            
        </select>
        <label for="wTypeId" class="input-control-label-left">文章类型:</label>
    </div>
    <div class="input-control has-label-left">
        <select class="form-control" name="wSign" id="wSign">
                <option value="0" selected>未发布</option>
                <option value="1">已发布</option>
        </select>
        <label for="wSign" class="input-control-label-left">文章状态:</label>
    </div>
    <textarea id="contentSimple" name="text" class="form-control kindeditorSimple" style="height:150px;">${wirterById.text}</textarea>
    <br/>
    <button type="submit" class="btn btn-primary">发布文章</button>
</form>
<script src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
<script src="${pageContext.request.contextPath}/zui/js/zui.js"></script>
<script src="${pageContext.request.contextPath}/zui/lib/kindeditor/kindeditor.js"></script>
<script>
    KindEditor.create('textarea.kindeditorSimple', {
        basePath: '/dist/lib/kindeditor/',
        bodyClass : 'article-content',
        resizeType : 1,
        allowPreviewEmoticons : false,
        allowImageUpload : false,
        items : [
            'fontname', 'fontsize', '|', 'forecolor', 'hilitecolor', 'bold', 'italic', 'underline',
            'removeformat', '|', 'justifyleft', 'justifycenter', 'justifyright', 'insertorderedlist',
            'insertunorderedlist', '|', 'emoticons', 'image', 'link'
        ]
    });
    $(function () {
       $.post(
           "${pageContext.request.contextPath}/wtype/findWtypeAll.cms",function (data) {
                for (var i=0;i<data.length;i++){
                    var wTyId="${wirterById.wTypeId}";
                    if (wTyId==data[i].wTypeId) {
                        $("#wTypeId").append("<option value='"+data[i].wTypeId+"' selected>"+data[i].wTypeName+"</option>");
                    }else {
                        $("#wTypeId").append("<option value='"+data[i].wTypeId+"'>"+data[i].wTypeName+"</option>");
                    }
                } 
           },"json"
       );
    });

</script>
</body>
</html>