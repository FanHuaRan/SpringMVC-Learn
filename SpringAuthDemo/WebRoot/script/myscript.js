function check(){
    $("#user_password").val(hex_md5($("#user_password").val()));
    console.log($("#user_password").val());
    return true;
}