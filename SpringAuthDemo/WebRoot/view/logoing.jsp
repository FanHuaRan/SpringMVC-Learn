<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>   
    <title>登录页面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="script/jquery-1.10.2.js"></script>
	<script type="text/javascript" src="script/md5.js"></script>
    <script type="text/javascript" src="script/myscript.js"></script>
     <style type="text/css">
      .main{
        height:130px;
        width:430px;
        margin:0 auto;
      }
      h1{
        margin:0 auto;
      }
      #title{
      	margin:0 auto;
      }
      .myform{
      	 height:100px;
     	 width:175px;
     	 margin:0 auto;
      }
      .formdiv{
      	 height:120px;
     	 width:175px;
     	 margin:0 auto;
      }
      .logoingBtt{
      	float:left
      }
     </style>
  </head>
  
  <body>
  <div class="main">
    <h1 id="title">This is my JSP page</h1><br>
    <div class="formdiv">
    <!-- 使用表单提交 -->
    <form action="logoing" class="myform" method="post">
    <p>请输入工号：<input type="text" name="userId"/></p>
    <p>请输入密码： <input type="password" name="password" id="user_password"/></p>
    <p>
    <input type="submit" value="登录" class="logoingBtt" onclick="return check()" />
    <input type="button" value="取消" class="cancelBtt">
    </p>
    </form>
 	 ${msg}<br>
   </div>
 </div>
  </body>
</html>
