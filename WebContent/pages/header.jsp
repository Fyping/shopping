<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<div class="menu">
<ul>
<li style="width:0px;"><a></a></li>
<li class="active"><a href="index.html" class="home">Home</a></li>
<li><a href="wishlist.html" class="wishlist">收藏</a></li>
<li><a href="account.html" class="account">个人中心</a></li>
<li><a href="cart.html" class="cart">购物车</a></li>
<li><a class="checkout">下单</a></li>
<li style="float:right;"><a href="login.jsp" class="login">登陆</a></li>
<li style="float:right;"><a class="register">注册</a></li>
</ul>
</div>
<div style="width:1000px;margin:0 auto;">
<div id="cart">
<div class="heading">
<a style="padding:8px;margin-left:-14px;">购物车</a><span style="font-size:14px;color:#fff;">&raquo;</span>
<a><span id="购物车总价格"> 0 件 - ￥0.00</span></a></div>
<div class="content"></div>
</div>  
<div id="search">
<div class="button-search"></div>
<input type="text" name="filter_name" value="Search" onclick="this.value = '';" onkeydown="this.style.color = '#888';" />
</div>
</div>
<div class="header">
<div class="logo_img"><a href="default.htm"><img alt="Site Name" src="images/logo.png"></a></div></div>
<div id="menu">
<ul>  
<!-- <li><a href="categories.html">Desktops</a>

</li> -->
<li><a href="categories.html">所有手机</a>   	
<div>
<ul>	
<li><a href="default.htm">Macs (0)</a></li>
<li><a href="default.htm">Windows (0)</a></li>
</ul>
</div>
</li>
<li><a href="categories.html">手机配件</a>
<div>
<ul>	
<li><a href="default.htm">充电宝</a></li>
<li><a href="default.htm">钢化膜</a></li>
<li><a href="default.htm">手机壳</a></li>
<li><a href="default.htm">自拍神器</a></li>
<li><a href="default.htm">数据线</a></li>
</ul>
</div>
</li>
<li><a href="categories.html">老人机</a></li>
<li><a href="categories.html">运营商</a>
<div>
<ul>	
<li><a href="default.htm">中国移动</a></li>
<li><a href="default.htm">中国联通</a></li>
<li><a href="default.htm">中国电信</a></li>
</ul>
</div>
</li>

<li><a href="categories.html">手机社区</a></li>
</ul>
</div>