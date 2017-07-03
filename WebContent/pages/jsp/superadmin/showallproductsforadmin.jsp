<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import = "java.util.HashSet ,java.util.List,cn.com.fangself.model.pager.PageBean "%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>后台模板</title>

<script type="text/javascript" src="js/jquery.min.js"></script>

<link rel="stylesheet" href="css/add.css" type="text/css" media="screen" />
<link rel="stylesheet" href="utilLib/bootstrap.min.css" type="text/css" media="screen" />

</head>
<%!
/* PageBean<GoodsInfo> pageBean = null;
List<GoodsInfo> datas = null; */
%>
<%
/* pageBean =(PageBean<GoodsInfo>) request.getAttribute("pagebeans");
datas = pageBean.getDatas(); */
%>
<body>
	<table id="products">
		<tr><td>111</td><td>111</td><td>111</td><td>111</td></tr>
		<tr><td>111</td><td>111</td><td>111</td><td>111</td></tr>
		<tr><td>111</td><td>111</td><td>111</td><td>111</td></tr>
		<tr><td>111</td><td>111</td><td>111</td><td>111</td></tr>
		<tr><td>111</td><td>111</td><td>111</td><td>111</td></tr>
	</table>
	<%-- <c:forEach var="names" items="<%=names %>"> ${names }</c:forEach>
	 --%>
	
	<c:forTokens var="entry" items="AA:bb:cc:dd" delims=":">
   		${entry }
	</c:forTokens>
	<%-- <c:forEach items="${result }" var="item" >
		${item }&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		
	</c:forEach> --%>
	 <table id="products">
 	 <c:forEach items="${result }" var="item">  
			<tr><td>${item.goodsuuid }</td><td>${item.goodsbrand }</td>${item.goodsprice }<td><img src="${item.goodsurl }"/></td><td>111</td></tr>
    </c:forEach>   
    </table>

</body>
</html>