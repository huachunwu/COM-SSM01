// 手动通过点击模拟高亮菜单项
$('#treeMenu').on('click', 'a', function() {
    $('#treeMenu li.active').removeClass('active');
    $(this).closest('li').addClass('active');
});