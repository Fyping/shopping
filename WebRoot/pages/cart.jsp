<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ page import = "java.util.List,cn.com.fangself.model.pager.PageBean "%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en" dir="ltr">
<head>
<jsp:include page="head.jsp" />
</head>
<body>

<jsp:include page="header.jsp" />


<div style="width:1000px;margin: 0 auto;margin-top:10px;">
<div class="linktree">
        <a href="#">Home</a>
         &raquo; <a href="#">Shopping Cart</a>
    </div>
<h1 style="margin-top:-10px;">Shopping Cart&nbsp;(20.00kg)</h1>

<br>
     <form action="#" method="post" id="basket">
      <div class="cart-info">
        <!-- --------------------------------------------------------- -->

        <!-- --------------------------------------------------------- -->
   
   
       <table>
          <thead>
            <tr>
              <td class="remove">剔除</td>
              <td class="image">商品</td>
              <td class="name">品牌</td>
              <td class="model">描述</td>
              <td class="quantity">数量</td>
              <td class="price">单价</td>
              <td class="total">总价</td>
            </tr>
          </thead>
          <tbody>
          
           	 <c:forEach items="${shopCartListPagebean.datas }" var="item">  
			
               <tr>
              <td class="remove"><input type="checkbox" name="remove[]" value="41" /></td>
              <td class="image"><a href="#"><img style="height:80px;width:80px;"src="${item.goodsurl }" alt="" title="${item.goodsurl }" /></a>
                </td>
              <td class="name"><a href="#">${item.goodsbrand }</a>
                </td>
              <td class="model">${item.goodsdescript }</td>
              <td class="quantity"><input type="text" name="quantity[41]" value="2" size="3" /></td>
              <td class="price">$100.00</td>
              <td class="total">$200.00</td>
            </tr>
			</c:forEach> 
        </table>
		<table>
		  <thead>
            <tr>
              <td class="total">总数量</td>
              <td class="total">总金额</td>
            </tr>
          </thead>
		  <tbody>
            <tr><td>11</td><td>￥111.00</td></tr>
          </tbody>
		</table>
   
   <!-- -------------------------------------------- -->
     
      </div>
    </form>
    

    <div class="buttons">
      <div class="left"><a class="button"><span>Update</span></a></div>
      <div class="right"><a href="#" class="button"><span>Checkout</span></a></div>
      <div class="center"><a href="#" class="button" style="width:120px;"><span>Continue Shopping</span></a></div>
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