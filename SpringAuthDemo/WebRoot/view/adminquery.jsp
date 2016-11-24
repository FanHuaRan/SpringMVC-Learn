<%@ page contentType="text/html; charset=UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  
    <title>My JSP 'adminquery.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

  </head>
  
  <body>
      <h1>查询中心</h1>
     <a href="index">主页</a>
     <a href="exit">退出</a><br>
     <c:forEach items="${examClasss}" var="exam">
	    班级编号：${exam.examClassId}
	    班级名称：${exam.examClassName}
	  <a href="querys/examstudent/${exam.examClassId}">查询</a><br>
    </c:forEach>
  </body>
</html>
