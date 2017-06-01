<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%!
    String adminid = new String();
    %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- 引入 Bootstrap -->
<link href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<title>优购购物商城后台管理入口</title>
<style>
html,body{
 	heiht:100%;
 	width:100%;
}
 #main{
 	heiht:100%;
 	width:100%;
 }
 #content{
 	height:30%;
 	widht:50%;
 	margin-top:20%;
 	margin-left:40%;
 }	
</style>
<script type="text/javascript">
function login(){
	alert(1);
	let username = document.getElementById("admin");
	let userpwd = document.getElementById("pwd");
	alert(username);
	    var xhr ;
	    if (window.XMLHttpRequest)
	    {// code for IE7+, Firefox, Chrome, Opera, Safari
	        xhr=new XMLHttpRequest();
	    } 
	    else
	    {// code for IE6, IE5
	        xhr=new ActiveXObject("Microsoft.XMLHTTP");
	    } 
	    
	    
       var logininfo = "";
	    logininfo+="adminid="+username.value+"&adminpassword="+userpwd.value;
	    xhr.open("POST","/ssm_second/adminlogin.action",true);
	    xhr.setRequestHeader("Content-type","application/x-www-form-urlencoded");
	    xhr.send(logininfo);
	    alert(logininfo); 
		 
}
</script>
</head>
<body>
 <div id="main">
  <div id="content">
<form class="form-inline" role="form" method="post">
  <div class="form-group">
    <label class="sr-only" for="name">名称</label>
    <input name="adminid" type="text" class="form-control" id="admin" placeholder="请输入管理员ID" pattern="[0-9]{10}"/>
    <input name="adminid" type="hidden" value="<%=adminid%>">
  </div>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  <button type="button" class="btn btn-default" onclick="login();">提交</button>
   <br><br>
  <div class="form-group">
    <label class="sr-only" for="name">名称</label>
    <input name="adminpassword" type="password" id="pwd"  class="form-control" placeholder="请输入密码" pattern="[a-z|A-Z|0-9|`|~|!|@|#|$|%|^|&|*|(|)|_|+|-|=|[|]|{|}|\||;|:|']{6,130}"/>
  </div>
  <div class="checkbox">
    <label>
      <input type="checkbox">记住否</label>
  </div>
  <button type="button" class="btn btn-default" onclick="login();">提交</button>
</form>  
  </div>
 </div>
	<!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
	<script src="https://code.jquery.com/jquery.js"></script>
	<!-- 包括所有已编译的插件 -->
	<script src="./../../bootstrap-3.3.7/js/bootstrap.min.js"></script>
</body>
</html>