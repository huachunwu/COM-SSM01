$("#treeMenu").on("click","a",function () {
    $('#treeMenu li.active').removeClass('active');
    $(this).closest('li').addClass('active');
    var aurl=$(this).attr("aurl");
    var icon=$(this).attr("class");
    var title=$(this).text();
    var fid=$(this).attr("fid");
    var myTabs=$("#tabsExample").data("zui.tabs");
    alert(fid);
    var mySpecialTab = myTabs.getTab(fid);
    var tabs1={
        title:title,
        url:aurl,
        type:"iframe",
        icon:icon,
        id:fid
    };
        console.log(mySpecialTab.title);
        if (mySpecialTab.title==title){
            myTabs.reload(mySpecialTab)
        }else{
            alert("sds");
        }

})
