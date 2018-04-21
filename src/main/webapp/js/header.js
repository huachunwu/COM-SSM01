$("#logOut").on("click",function () {
    if (confirm("你确定要退出登录吗？")){
        return true;
    } else{
        return false;
    }
});