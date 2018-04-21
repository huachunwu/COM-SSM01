<%--
  Created by IntelliJ IDEA.
  User: yhmi
  Date: 2018/4/15
  Time: 14:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="${pageContext.request.contextPath}/zui/lib/tabs/zui.tabs.css" rel="stylesheet">
<div class="tabs" id="tabsExample" style="height:600px"></div>
<script src="${pageContext.request.contextPath}/zui/lib/tabs/zui.tabs.js"></script>
<script>
    var tabs=[{
        title:"首页",
        url:"Page/cout.cms",
        type:"iframe",
        forbidClose: true,
        id:1
    }];
    $(".tabs").tabs({tabs:tabs});
</script>
