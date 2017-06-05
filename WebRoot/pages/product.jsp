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
        <a href="#">Home</a>
         &raquo; <a href="#">iMac</a>
    </div>

  <h1 style="margin-top:-10px;">iMac</h1>
</div>
<div id="container_bg">


<style type="text/css">

.linktree {
	margin-top:0px;
	margin-bottom:10px;
	margin-left:3px;
}

.linktree a {
	color:#666;
	text-decoration:none;
	font-size:11px;
}

#menu {
	border-radius:5px;
}
</style>



<div id="column-left">
<div class="box">
  <div class="box-heading_left">Categories</div>
  <div class="box-content" style="background:none;border:none;">
    <div class="box-category">
<ul>
<li><a href="#">Desktops (13)</a></li>
<li><a href="#">Laptops &amp; Notebooks (5)</a></li>
<li><a href="#">Components (2)</a></li>
<li><a href="#">Software (0)</a></li>
<li><a href="#">Phones &amp; PDAs (3)</a></li>
<li><a href="#">Cameras (2)</a></li>
<li><a href="#">MP3 Players (4)</a></li>
</ul>
</div>
</div>
</div>
</div>
 
<div id="content">
<div class="block-white"> 
<div class="block-content">
           
</div>
<div class="separator"></div>
<div class="block-content">
<div class="product-info">
                                	
<div class="left">                		                			
<div class="image"><a href="#" title="iMac" ><img src="images/imac_1-228x228.jpg" title="iMac" alt="iMac" id="image" /></a></div>
<div class="image-additional">
<a href="#" title="iMac"><img src="images/imac_3-74x74.jpg" title="iMac" alt="iMac" /></a>
<a href="#" title="iMac"><img src="images/imac_2-74x74.jpg" title="iMac" alt="iMac" /></a>
</div>                		                        
</div>
				    			
<div class="right">
<div id="tabs" class="tabs">
<a href="#tab-information" class="selected"><img alt="Information" src="images/Info.png" style="margin-top:6px;" /><div></div></a>
<a href="#tab-description">Description</a>
<a href="#tab-review">Reviews (0)</a>
<a href="#tab-related">Related Products (1)</a>
</div>
  
<div id="tab-information" class="tab-content">
<div id="information"></div>
			
	
<div class="description">
<span>&raquo;&nbsp;Brand:</span> <a href="#">Apple</a><br />
<span>&raquo;&nbsp;Product Code:</span> Product 14<br />
<span>&raquo;&nbsp;Reward Points:</span> 0<br />
<span>&raquo;&nbsp;Availability:</span> In Stock                        
</div>
                            
<div class="price">
<span class="price-new">$119.50</span>
<div class="price-tax">Ex Tax: $100.00</div>
</div>
<br>
<div class="cart">
<div>Qty:<input class="quantity" type="text" name="quantity" size="2" value="1" />
<input type="hidden" name="product_id"  value="41" />
&nbsp;<a id="button-cart" class="button"><span>Add to Cart</span></a>
</div>
<div>
<span>&nbsp;&nbsp;&nbsp;- OR -&nbsp;&nbsp;&nbsp;</span>
</div>
<div>
<a class="wishlist"><img src="images/wishlist.png" style="margin-top:6px;" title="Add to Wish List"/></a>
<a class="compare"><img src="images/compare.png" style="margin-top:6px;" title="Add to Compare"/></a>
</div>
</div>
<div class="review">
<div>
<img src="images/stars.png" alt="0 reviews" />&nbsp;&nbsp;
<a onclick="$('a[href=\'#tab-review\']').trigger('click');#tab-review\']').trigger('click');">0 reviews</a>&nbsp;&nbsp;|&nbsp;&nbsp;
<a onclick="$('a[href=\'#tab-review\']').trigger('click');#tab-review\']').trigger('click');">Write a review</a>
</div>
</div>
<div>
Just when you thought iMac had everything, now there is even more. More powerful Intel Core 2 Duo processors. And more memory standard. Combine this with Mac OS X Leopard and iLife 2008, and it is more all-in-one than ever. iMac packs amazing performance into a stunningly slim space.</div>
</div>
<div class="price">
</div>
</div>
</div>
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