/*login的js*/
/*登录提示框*/
$("#loading").on('click',function () {
    var myMessage=new $.zui.Messager('<i class="icon icon-spin icon-spinner"></i>&nbsp;正在登录请稍后...',{
        time:0,
        parent:'body',
        close:false,

    });
    myMessage.show();
    setTimeout(function () {
        myMessage.hide();
        $("#login").submit();
    },3000);

});
/*表单校验*/
$("#username").on("blur",function () {
    var reg=/^[a-zA-Z_-]\w{4,20}$/;
    if ($(this).val()==""){
        $("#user_message").html("");
        $(this).parent().removeClass("has-success").removeClass("has-error").addClass("has-error");
        $("#user_message").append("<i class=\"icon icon-times\"></i>");
        $("#user_message").next().html("用户名不能为空").css("color","#ea644a")
    }else if ($(this).val().length<6){
        $("#user_message").html("");
        $(this).parent().removeClass("has-error").removeClass("has-success").addClass("has-error");
        $("#user_message").append("<i class=\"icon icon-times\"></i>");
        $("#user_message").next().html("");
        $("#user_message").next().html("用户名长度为6-20").css("color","#ea644a")
    }else if (!reg.test($(this).val())){
        $("#user_message").html("");
        $(this).parent().removeClass("has-error").removeClass("has-success").addClass("has-error");
        $("#user_message").append("<i class=\"icon icon-times\"></i>");
        $("#user_message").next().html("");
        $("#user_message").next().html("用户不存在");
    }else{
        $("#user_message").html("");
        $(this).parent().removeClass("has-error").removeClass("has-success").addClass("has-success");
        $("#user_message").append("<i class=\"icon icon-check\"></i>");
        $("#user_message").next().html("");
    }
});