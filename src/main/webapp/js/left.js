/*var myTreeData = [{
    html: '<a href="#"><i class="icon icon-dashboard"></i>仪表盘</a>'
}, {
    html: '<a href="#"><i class="icon icon-file-image"></i>轮播图管理</a>'
},
    {html:'<a href="#"><i class="icon icon-bug"></i>业务管理</a>'},
    {
        html: '<a href="#"><i class="icon icon-paste"></i>文章管理</a>',
        children: [{html: '<a href="#"><i class="icon icon-file"></i>文章</a>'}, {html: '<a href="#"><i class="icon icon-file-text-alt"></i>文章类型</a>'}, {html: '<a href="#"><i class="icon icon-comment"></i>留言管理</a>'}]
    },
    {
        html: '<a href="#"><i class="icon icon-cogs"></i>系统管理</a>', children: [{
            html: '<a href="#"><i class="icon icon-group"></i>用户管理</a>'
        }, {html: '<a href="#"><i class="icon icon-shield"></i>角色管理</a>'},
            {html: '<a href="#"><i class="icon icon-sitemap"></i>权限管理</a>'},
            {
                html: '<a href="#"><i class="icon icon-cog"></i>日志管理</a>', children: [{
                    html: '<a href="#">登录日志</a>'
                },{
                    html: '<a href="#">系统操作日志</a>'
                }]
            }]
    }, {
        html: '<a href="5555" onclick="return false"><i class="icon icon-file-excel"></i>数据报表</a>'
    }

];*/
$("#treeMenu").on("click","a",function () {
    $('#treeMenu li.active').removeClass('active');
    $(this).closest('li').addClass('active');
    alert($(this).text());
    menu($(this).text());
})
function menu(data) {
    $("#bred").html("");
    $("#bred").append("<li><a href='#'>"+data+"</a></li>");
}