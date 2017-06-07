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
<div class="linktree">
    
    <a href="#">Home</a>&raquo; <a href="#">Account</a>&raquo; <a href="#">My Wish List</a>



<br>
<h1 style="margin-top:0px;">My Wish List</h1>

<br>
 
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
    <form action="#" method="post" id="wishlist">
    <div class="wishlist-product">
      <table>
        <thead>
          <tr>
            <td class="remove">Remove</td>
            <td class="image">Image</td>
            <td class="name">Product Name</td>
            <td class="model">Model</td>
            <td class="stock">Stock</td>
            <td class="price">Unit Price</td>
            <td class="cart">Buy Now</td>
          </tr>
        </thead>
        <tbody>
                    <tr>
            <td class="remove"><input type="checkbox" name="remove[]" value="41" /></td>
            <td class="image"><a href="#"><img src="images/imac_1-50x50.jpg" alt="iMac" title="iMac" /></a>
              </td>
            <td class="name"><a href="#">iMac</a></td>
            <td class="model">Product 14</td>
            <td class="stock">In Stock</td>
            <td class="price"><div class="price">$100.00</div>
              </td>
            <td class="cart"><a class="button"><span>Add to Cart</span></a></td>
          </tr>
                    <tr>
            <td class="remove"><input type="checkbox" name="remove[]" value="40" /></td>
            <td class="image"><a href="#"><img src="images/20070919010738-99-50x50.jpg" alt="iPhone" title="iPhone" /></a>
              </td>
            <td class="name"><a href="../../oc.spthemes.us/index.php@route=product_2Fproduct&product_id=40">iPhone</a></td>
            <td class="model">product 11</td>
            <td class="stock">In Stock</td>
            <td class="price"><div class="price">$101.00</div>
              </td>
            <td class="cart"><a class="button"><span>Add to Cart</span></a></td>
          </tr>
                    <tr>
            <td class="remove"><input type="checkbox" name="remove[]" value="36" /></td>
            <td class="image"><a href="#"><img src="images/ipod_nano_1-50x50.jpg" alt="iPod Nano" title="iPod Nano" /></a>
              </td>
            <td class="name"><a href="#">iPod Nano</a></td>
            <td class="model">Product 9</td>
            <td class="stock">In Stock</td>
            <td class="price"><div class="price">$100.00</div>
              </td>
            <td class="cart"><a class="button"><span>Add to Cart</span></a></td>
          </tr>
                  </tbody>
      </table>
    </div>
  </form>
  <div class="buttons">
    <div class="left"><a href="#" class="button"><span>Back</span></a></div>
    <div class="right"><a class="button"><span>Update</span></a></div>
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
<br>

<jsp:include page="footer.jsp" />
</body>
</html>