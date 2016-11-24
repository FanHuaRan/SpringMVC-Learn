<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>注册页面</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
    <style type="text/css">
     .error{
      color:#ff0000;
      font-weight:bold;
     }
    </style>
  </head>
  
  <body>
    欢迎注册 <br>
  <form:form method="post" modelAttribute="person">
  <form:error path="*" cssClass="error"/>
  <table>
  
  <tr>
  <td>姓名</td>
  <td><form:input path="personName"/></td>
  <td><form:error path="personName" cssClass="error"/></td>
  </tr>
  
  <tr>
  <td>年龄</td>
  <td><form:input path="age"/></td>
  <td><form:error path="age" cssClass="error"/></td>
  </tr>
  
  <tr>
  <td>角色类型</td>
  <td><form:select path="personType" items="${persontypes}"
  		itemValue="" itemLabel="PersonTypeName"/>
  </td>
  <td><form:error path="personType" cssClass="error"/>
  </td>
  </tr>
  
  <tr>
  <td>班级</td>
  <td><form:select path="examClass" items="${examClasses}"
  		itemValue="" itemLabel="examClassName"/>
  </td>
  <td><form:error path="examClass" cssClass="error"/>
  </td>
  </tr>
  
  <tr>
  <td colspan="3"><input value="注册" type="submit" /></td>
  </tr>
  </table>
  </form:form>
  </body>
</html>
