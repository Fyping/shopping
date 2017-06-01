<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
System.out.println(basePath);
%>
<!DOCTYPE html>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
	<form action="testsqlconnection.action" method="post">
		<input type="submit" value="/testsqlconnection.action"/>
	</form>
	<form action="testMemberShopcart.action" method="post">
		<input type="submit" value="/testMemberShopcart.action"/>
	</form>
	<form action="login" method="post">
		<input type="submit" value="/login"/>
	</form>
	<form action="loginstatus" method="post">
		<input type="submit" value="/loginstatus"/>
	</form>
	<form action="logout" method="post">
		<input type="submit" value="/logout"/>
	</form>
	<form action="register" method="post">
		<input type="submit" value="/register"/>
	</form>
	<form action="pages/jsp/adminlogin.jsp" method="get">
		<input type="submit" value="/adminglogin.jsp"/>
	</form>
	<form action="test" method="get">
		<input type="submit" value="/adminglogin.jsp"/>
	</form>
	<form action="adminlogin.action" method="post">
	    adminid =3 adminpassword=helloworld   url == ' adminlogin.action ' <br>
	    <input type="hidden" name="adminid" value="3">
	    <input type="hidden" name="adminpassword" value="helloworld">
		<input type="submit" value="adminlogin.action"/>
	</form>
	<form action="goodsdetails.action" method="post">
		<input type="submit" value="goodsdetails.action"/>
	</form>
  </body>
</html>
