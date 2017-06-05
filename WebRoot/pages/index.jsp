<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
<head>
<jsp:include page="head.jsp" />
</head>
<body>

<jsp:include page="header.jsp" />

<div id="wrapper">
<div class="slider-wrapper theme-orman">
<div class="ribbon"></div>
<div id="slider" class="nivoSlider" style="border: 1px solid #444;box-shadow: 0 0 5px 0 #080808;">
<a href="default.htm"><img src="images/banner.jpg" alt="" title="This is an example of a caption" /></a>
<a href="default.htm"><img src="images/banner2.jpg" alt="" title="This is an example of a caption" /></a>
</div>
<br>
<div class="controlNav_box"></div>
</div>
</div>
<script type="text/javascript" src="slider/scripts/jquery-1.7.1.min.js"></script>
<script type="text/javascript" src="slider/jquery.nivo.slider.pack.js"></script>
<script type="text/javascript">
    $(window).load(function() {
        $('#slider').nivoSlider();
    });
</script>
<div class="container">
<div class="text_box_left">热销</div>
<div class="box-product">
<div>
<div class="showhim">
<div class="image">
<a href="product.html"><img src="images/product_holder.jpg" alt="小米" />
<div class="showme">
<div class="description_featured" style="min-height:110px;">	
<p>Just when you thought iMac had everything, now there is even more. More powerful Intel Core 2 Duo processors. And more memory standard. ...</p>
</div>
</div>
</a>
<div class="name"><a href="#">小米</a></div>
<div class="priced">
<ul>
<li>$119.50</li>
<li><a href="#">Add to Cart</a></li>
</ul>
 </div>
<div style="margin-top:24px;"></div>
</div>	
<div class="showme">	        	
</div></div>           
</div>            
<div>
<div class="showhim">
<div class="image">
<a href="product.html"><img src="images/product_holder.jpg" alt="iPhone" />
<div class="showme">
<div class="description_featured" style="min-height:110px;">	
<p>iPhone is a revolutionary new mobile phone that allows you to make a call by simply tapping a name or number in your address book, a favo...</p>
</div>
</div>
</a>
<div class="name"><a href="#">iPhone</a></div>
<div class="priced">
<ul>
<li>$120.68</li>
<li><a href="#">Add to Cart</a></li>
</ul>
</div>
<div style="margin-top:24px;"></div>
</div>	
</div>      
</div>
<div>
<div class="showhim">
<div class="image">
<a href="product.html"><img src="images/product_holder.jpg" alt="OPPO" />
<div class="showme">
<div class="description_featured" style="min-height:110px;">	
<p>More room to move.With 80GB or 160GB of storage and up to 40 hours of battery life, the new iPod classic lets you enjoy...</p>
</div>
</div>
</a>
<div class="name"><a href="#">OPPO</a></div>
<div class="priced">
<ul>
<li>$119.50</li>
<li><a href="#">Add to Cart</a></li>
</ul>
</div>
<div style="margin-top:24px;"></div>
</div>	
<div class="showme">	        	
</div>
</div>
</div>
<div>
<div class="showhim">
<div class="image">
<a href="product.html"><img src="images/product_holder.jpg" alt="华为" />
<div class="showme">
<div class="description_featured" style="min-height:110px;">	
<p>Video in your pocket. Its the small iPod with one very big idea: video. The worlds most popular music player now lets you enjoy...</p>
</div>
</div>
</a>
<div class="name"><a href="#">华为</a></div>
<div class="priced">
<ul>
<li>$119.50</li>
<li><a href="#">Add to Cart</a></li>
</ul>
</div>
<div style="margin-top:24px;"></div>
</div>	
<div class="showme">	        	
</div>
</div>
</div>
</div>
</div>
<br>

<jsp:include page="footer.jsp" />

</body>
</html>