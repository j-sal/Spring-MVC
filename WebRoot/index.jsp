<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'index.jsp' starting page</title>
  </head>
  
  <body>
    <form action="${pageContext.request.contextPath }/test/register.do" method="POST">
    	Name: <input type="text" name="name"/><br>
    	Age: <input type="text" name="age"/><br>
    	<input type="submit" value="Register"/>
    </form>
  </body>
</html>
