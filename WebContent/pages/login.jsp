<%@ page contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
<head>
<jsp:include page="head.jsp" />
<script type="text/javascript" src="./js/login.js"></script>
</head>
<body>

<style type="text/css">
#content .content {
	padding: 10px;
	overflow: auto;
	margin-bottom: 20px;
	width:350px;float:left;
    	background-color: #eee;
    	border: 1px solid #BBBBBB;
	box-shadow: 1px 1px 1px #FFFFFF inset;	
	margin-right:20px;

}
</style>

<jsp:include page="header.jsp" />


<div style="width:1000px;margin: 0 auto;margin-top:10px;">
<div class="linktree">
        <a href="../../oc.spthemes.us/index.php@route=common_2Fhome">Home</a>
         &raquo; <a href="../../oc.spthemes.us/index.php@route=account_2Faccount">Account</a>
         &raquo; <a href="../../oc.spthemes.us/index.php@route=account_2Flogin">Login</a>
    </div>

  <h1 style="margin-top:-10px;">Account Login</h1>

<br>



 
<div id="column-right">
    <div class="box">
  <div class="box-heading_left">Account</div>
  <div class="box-content" style="background:none;border: solid 1px #E3E3E2;"><div class="box-category">
    <ul>
      <li><a href="#">Login</a> / <a href="#">Register</a></li>
      <li><a href="#">Forgotten Password</a></li>
      <li><a href="#">My Account</a></li>
      <li><a href="#">Wish List</a></li>
      <li><a href="#">Order History</a></li>
      <li><a href="#">Downloads</a></li>
      <li><a href="#">Returns</a></li>
      <li><a href="#">Transactions</a></li>
      <li><a href="#">Newsletter</a></li>
          </ul>
  </div>
</div>
</div>
  </div>
<div id="content">
      <div class="login-content">
    <div class="left">
      <h2>New Customer</h2>
      <div class="content">
        <p><b>Register Account</b></p>
        <p>By creating an account you will be able 	to shop faster, be up to date on an order's status, and keep track of the orders you have previously made.</p>
        <a href="#" class="button"><span>Continue</span></a></div>
    </div>
    <div class="right">
      <h2>用户&nbsp;登陆</h2>
      <form action="memberlogin.action" id="login">
        <div class="content">
          <p style="font-size:10px;">您可以选择用您用册是填写的Email或者电话号码作为用户ID</p>
          <b>用户ID:</b>
          <input type="text" name="username" value="" placeholder="请输入 用户ID" />
          <br />
          <b>密码:</b>
          <input type="password" name="userpwd" value="" placeholder="请输入密码" />
          <br />
          <a href="../../oc.spthemes.us/index.php@route=account_2Fforgotten">
          		忘记了密码?d点我</a><br />
          <img  src="../vcode.action" style="width:120px;height:40px;"/>
          <input type="text" id="vcode" onblur="checkViewCode();" placeholder="请输入验证码"/><br>
          <a onclick="checkViewCode();$('#login').submit();" class="button"><span>Login</span></a>
                  </div>
      </form>
    </div>
  </div>
  </div>
  
</div>


<br>
<br>
<br>
<br>
<br>
<br>
<br>

<jsp:include page="footer.jsp" />

</body>
</html>