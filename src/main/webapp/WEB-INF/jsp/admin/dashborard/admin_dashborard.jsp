<%--
  Created by IntelliJ IDEA.
  User: yhmi
  Date: 2018/4/21
  Time: 8:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>yhmi仪表盘</title>
    <!--ZUI Css-->
    <link href="../zui/css/zui.css" rel="stylesheet">
    <link href="../zui/css/zui-theme.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row">
        <h1>上次登录时间&nbsp;<small class="label label-danger">2018/04/19</small></h1>
    </div>
    <div class="row" style="padding-top: 1em">
        <div class="col-sm-3 text-center">
            <a class="card" href="#" style="background-color: #3280fc">
                <div class="row">
                    <i class="icon icon-comments icon-5x col-sm-5" style="color: #ffffff;margin-top: 5px"></i>
                    <div class="col-sm-7">
                        <div class="row">
                            <h1  style="color: #ffffff">22</h1>
                        </div>
                        <div class="row">
                            <small  style="color: #ffffff">新的消息</small>
                        </div>
                    </div>
                </div>
                <div class="card-actions">
                    <div class="pull-left"  style="color: #ffffff">View&nbsp;Details</div>
                    <div class="pull-right"  style="color: #ffffff"><i class="icon icon-arrow-right"></i> </div>
                </div>
            </a>
        </div>
        <div class="col-sm-3 text-center">
            <a class="card" href="#" style="background-color: #03b8cf">
                <div class="row">
                    <i class="icon icon-group icon-5x col-sm-5"  style="color: #ffffff;margin-top: 5px"></i>
                    <div class="col-sm-7">
                        <div class="row">
                            <h1  style="color: #ffffff">22</h1>
                        </div>
                        <div class="row">
                            <small  style="color: #ffffff">新的消息</small>
                        </div>
                    </div>
                </div>
                <div class="card-actions">
                    <div class="pull-left"  style="color: #ffffff">View&nbsp;Details</div>
                    <div class="pull-right"  style="color: #ffffff"><i class="icon icon-arrow-right"></i> </div>
                </div>
            </a>
        </div>
        <div class="col-sm-3 text-center">
            <a class="card" href="#" style="background-color: #38b03f">
                <div class="row">
                    <i class="icon icon-paste icon-5x col-sm-5"  style="color: #ffffff;margin-top: 5px"></i>
                    <div class="col-sm-7">
                        <div class="row">
                            <h1  style="color: #ffffff">22</h1>
                        </div>
                        <div class="row">
                            <small  style="color: #ffffff">新的消息</small>
                        </div>
                    </div>
                </div>
                <div class="card-actions">
                    <div class="pull-left"  style="color: #ffffff">View&nbsp;Details</div>
                    <div class="pull-right"  style="color: #ffffff"><i class="icon icon-arrow-right"></i> </div>
                </div>
            </a>
        </div>
        <div class="col-sm-3 text-center">
            <a class="card" href="#" style="background-color: #ea644a">
                <div class="row">
                    <i class="icon icon-bug icon-5x col-sm-5"  style="color: #ffffff;margin-top: 5px"></i>
                    <div class="col-sm-7">
                        <div class="row">
                            <h1  style="color: #ffffff">22</h1>
                        </div>
                        <div class="row">
                            <small  style="color: #ffffff">新的消息</small>
                        </div>
                    </div>
                </div>
                <div class="card-actions">
                    <div class="pull-left"  style="color: #ffffff">View&nbsp;Details</div>
                    <div class="pull-right"  style="color: #ffffff"><i class="icon icon-arrow-right"></i> </div>
                </div>
            </a>
        </div>
    </div>
    <div class="row">
        <div class="col-sm-4">
            <div class="panel">
                <div class="panel-heading">
                    <i class="icon icon-calendar-empty"></i>
                    <span class="title"> 公告信息</span>
                </div>
                <div class="panel-body">
                    <p>最新公告</p>
                </div>
            </div>
        </div>
        <div class="col-sm-4">
            <div class="panel">
                <div class="panel-heading">
                    <i class="icon icon-bug"></i>
                    <span class="title"> 最新提交bug</span>
                </div>
                <div class="panel-body">
                    <ul class="list-group">
                        <li class="list-group-item">标题&nbsp;<span class="label label-danger">new</span> </li>
                        <li class="list-group-item">标题&nbsp;<span class="label label-danger">new</span> </li>
                        <li class="list-group-item">标题&nbsp;<span class="label label-danger">new</span> </li>
                        <li class="list-group-item">标题&nbsp;<span class="label label-danger">new</span> </li>
                        <li class="list-group-item">标题&nbsp;<span class="label label-danger">new</span> </li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="col-sm-4">
            <div class="panel">
                <div class="panel-heading">
                    <i class="icon icon-file"></i>
                    <span class="title"> 最新文章bug</span>
                </div>
                <div class="panel-body">
                    <ul class="list-group">
                        <li class="list-group-item">标题&nbsp;<span class="label label-danger">new</span> </li>
                        <li class="list-group-item">标题&nbsp;<span class="label label-danger">new</span> </li>
                        <li class="list-group-item">标题&nbsp;<span class="label label-danger">new</span> </li>
                        <li class="list-group-item">标题&nbsp;<span class="label label-danger">new</span> </li>
                        <li class="list-group-item">标题&nbsp;<span class="label label-danger">new</span> </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</div>
<script src="../js/jquery-3.3.1.js"></script>
<script src="../zui/js/zui.js"></script>
</body>
</html>
