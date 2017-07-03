<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
<head>
<jsp:include page="head.jsp" />
</head>
<body>

<jsp:include page="header.jsp" />

<div style="width:1000px;margin: 0 auto;margin-top:10px;">
<div id="column-right">
    <div class="box">
  <div class="box-heading_left">Account</div>
  <div class="box-content" style="background:none;border: solid 1px #E3E3E2;"><div class="box-category">
    <ul>
      <li><a href="#">My Account</a></li>
      <li><a href="#">Edit Account</a></li>
      <li><a href="#">Password</a></li>
      <li><a href="#">Wish List</a></li>
      <li><a href="#">Order History</a></li>
      <li><a href="#">Downloads</a></li>
      <li><a href="#">Returns</a></li>
      <li><a href="#">Transactions</a></li>
      <li><a href="#">Newsletter</a></li>
      <li><a href="#">Logout</a></li>
          </ul>
  </div>
</div>
</div>
  </div>
<div id="content">
    <h2>My Account</h2>
  <div class="content">
    <ul>
      <li><a href="#">Edit your account information</a></li>
      <li><a href="#">Change your password</a></li>
      <li><a href="#">Modify your address book entries</a></li>
      <li><a href="#">Modify your wish list</a></li>
    </ul>
  </div>
  <h2>My Orders</h2>
  <div class="content">
    <ul>
      <li><a href="#">View your order history</a></li>
      <li><a href="#">Downloads</a></li>
      <li><a href="#">Your Reward Points</a></li>
      <li><a href="#">View your return requests</a></li>
      <li><a href="#">Your Transactions</a></li>
    </ul>
  </div>
  <h2>Newsletter</h2>
  <div class="content">
    <ul>
      <li><a href="#">Subscribe / unsubscribe to newsletter</a></li>
    </ul>
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
<br>
<jsp:include page="footer.jsp" />
</body>
</html>