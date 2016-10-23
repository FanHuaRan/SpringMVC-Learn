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
     <style type="text/css">
      h1{
       margin:0 auto;
      }
      #title{
      	margin:0 auto;
      }
      .myform{
      	 height:100px;
     	 width:250px;
     	 margin:0 auto;
      }
      .logoingBtt{
      }
     </style>
  </head>
  
  <body>
    <h1 id="title">This is my JSP page</h1><br>
    <!-- 使用表单提交 -->
    <form action="logoing" class="myform" method="post">
    <p>请输入姓名：<input type="text" name="userName"/></p>
    <p>请输入工号： <input type="password" name="userID"/></p>
    <p>
    <input type="submit" value="登录" class="logoingBtt"/>
    <input type="button" value="取消" class="cancelBtt">
    </p>
    </form>
 	 ${msg}<br>
  </body>
</html>
