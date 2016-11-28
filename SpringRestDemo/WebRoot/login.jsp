<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>自定义Spring Security登录页面</title>
</head>
<body>
	<h3>Login with Username and Password</h3>
	<!-- 表单的action 以及name要和Spring Security默认页面的name一样才能正常使用Spring Security -->
	<form name='f' action='/SpringRestDemo/j_spring_security_check' method='POST'>
 	<table>
    <tr><td>User:</td><td><input type='text' name='j_username' value=''></td></tr>
    <tr><td>Password:</td><td><input type='password' name='j_password'/></td></tr>
    <tr><td colspan='2'><input name="submit" type="submit" value="Login"/></td></tr>
  	</table>
</form>
</body>
</html>