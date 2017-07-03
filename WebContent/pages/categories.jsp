<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ page import = "java.util.HashSet ,java.util.List,cn.com.fangself.model.to.queryto.GoodsInfoQueryTo,cn.com.fangself.model.pager.PageBean "%>
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
&raquo; <a href="#">MP3 Players</a> 
</div>
<br>  
<h1 style="margin-top:-10px;">MP3 Players</h1>
<br>
<div id="notification"></div>
<div id="column-left">


<div class="box">
  <div class="box-heading_left">Categories</div>
  <div class="box-content" style="background:none;border:none;">
    <div class="box-category">
      <ul>
                <li>
                    <a href="#">Desktops (13)</a>
                              <ul>
                        <li>
                            <a href="#"> - PC (0)</a>
                          </li>
                        <li>
                            <a href="#"> - Mac (1)</a>
                          </li>
                      </ul>
                  </li>
                <li>
                    <a href="#">Laptops &amp; Notebooks (5)</a>
                              <ul>
                        <li>
                            <a href="#"> - Macs (0)</a>
                          </li>
                        <li>
                            <a href="#"> - Windows (0)</a>
                          </li>
                      </ul>
                  </li>
                <li>
                    <a href="#">Components (2)</a>
                              <ul>
                        <li>
                            <a href="#"> - Mice and Trackballs (0)</a>
                          </li>
                        <li>
                            <a href="#"> - Monitors (2)</a>
                          </li>
                        <li>
                            <a href="#"> - Printers (0)</a>
                          </li>
                        <li>
                            <a href="#"> - Scanners (0)</a>
                          </li>
                        <li>
                            <a href="#"> - Web Cameras (0)</a>
                          </li>
                      </ul>
                  </li>
                <li>
                    <a href="#">Software (0)</a>
                            </li>
                <li>
                    <a href="#">Phones &amp; PDAs (3)</a>
                            </li>
                <li>
                    <a href="#">Cameras (2)</a>
                            </li>
                <li>
                    <a href="#" class="active">MP3 Players (4)</a>
                              <ul>
                        <li>
                            <a href="#"> - test 11 (0)</a>
                          </li>
                        <li>
                            <a href="#4"> - test 12 (0)</a>
                          </li>
                        <li>
                            <a href="#"> - test 15 (0)</a>
                          </li>
                        <li>
                            <a href="#"> - test 16 (0)</a>
                          </li>
                        <li>
                            <a href="#"> - test 17 (0)</a>
                          </li>

                      </ul>
                  </li>
              </ul>
    </div>
  </div>
</div>

</div>
 
<div id="content">
<div class="category-info">
<div class="image"><img src="images/ipod_touch_4-80x80.jpg" alt="MP3 Players" /></div>
<p>Shop Laptop feature only the best laptop deals on the market. By comparing laptop deals from the likes of PC World, Comet, Dixons, The Link and Carphone Warehouse, Shop Laptop has the most comprehensive selection of laptops on the internet. At Shop Laptop, we pride ourselves on offering customers the very best laptop deals. From refurbished laptops to netbooks, Shop Laptop ensures that every laptop - in every colour, style, size and technical spec - is featured on the site at the lowest possible price.</p>
</div>
        
<div class="column">
<div class="category-list block">
<h2>Refine Search</h2>                                                        	
<div class="column20p">
<ul>                                                                                                             
<li><a href="#">test 11 (0)</a></li>                          	                                                                                                        
<li><a href="#">test 12 (0)</a></li>
<li><a href="#">test 15 (0)</a></li>                                                                                                   
<li><a href="#">test 16 (0)</a></li>                                                                                                        
<li><a href="#">test 17 (0)</a></li>                                    	
</ul>
</div>
<div class="column20p">
<ul>                                                                                                                                            
<li><a href="#">test 18 (0)</a></li>                                 	
<li><a href="#">test 19 (0)</a></li>                                                                                                                             
<li><a href="#">test 20 (0)</a></li>                                   	                                                                                                           
<li><a href="#">test 21 (0)</a></li>                                                                                                                                              
<li><a href="#">test 22 (0)</a></li>                               	
</ul>
 </div>
<div class="column20p">
<ul>                                                                                                                                            
<li><a href="#">test 23 (0)</a></li>                                                                                                       
<li><a href="#">test 24 (0)</a></li>                                                                                                      
<li><a href="#">test 4 (0)</a></li>     
<li><a href="#">test 5 (0)</a></li>    
<li><a href="#">test 6 (0)</a></li>                               	
</ul>
</div>
<div class="column20p">
<ul>
                                                                                                                                            
<li><a href="#">test 7 (0)</a></li>    
<li><a href="#">test 8 (0)</a></li>      
<li><a href="#">test 9 (0)</a></li>
</ul>
</div>
</div>
</div>
<div class="product-filter column">
<div class="limit">
<dl class="btn-drop">
<dt></dt>
<dd>15</dd>
<select onchange="location = this.value;">
<option value="#" selected="selected">15</option>
<option value="#">25</option>
<option value="#">50</option>
<option value="#">75</option>
<option value="#">100</option>
</select>
</dl>
Show:</div>
<div class="sort">
<dl class="btn-drop">
<dt></dt>
<dd>Default</dd>
<select onchange="location = this.value;">
<option value="#" selected="selected">Default</option>
<option value="#">Name (A - Z)</option>
<option value="#">Name (Z - A)</option>
<option value="#">Price (Low &gt; High)</option>
<option value="#">Price (High &gt; Low)</option>
<option value="#">Rating (Highest)</option>
<option value="#">Rating (Lowest)</option>
<option value="#">Model (A - Z)</option>
<option value="#">Model (Z - A)</option>
</select>
</dl>
Sort By:</div>
<div class="display">
<div class="combo">
<a title="List" class="view-list active" onclick="display('list');"><span class="icon icon-list">&nbsp;</span></a><a title="Grid" class="view-grid" onclick="display('grid');"><span class="icon icon-grid">&nbsp;</span></a>
</div>
Display:</div>
            <div class="product-compare"><a href="#" id="compare-total">Product Compare (0)</a></div>
            <div class="clearfix"></div>
        </div>
        <div class="product-list">
        
        	
        	 <c:forEach items="${datas }" var="item">  
        	<div class="struct">
                	<div class="struct-right"></div>
                    <div class="struct-left"></div>
                    <div class="struct-center">
                    	<div class="line">
                            <a href="#" class="image-link">
                                <div class="image">
                                	<img style="width:120px;height:120px;"src="${item.goodsurl }" title="iPod Touch" alt="iPod Touch" />
                                 </div>
                            </a>
                            
                            <div class="right">
                              <div class="price">￥${item.goodsprice}</div>
                                <div class="cart combo">
                                    <a onclick="addToCompare('32');" title="Add to Compare"><span class="icon icon-compare">&nbsp;</span></a><a onclick="addToCart('32');" title="Add to Cart"><span class="icon icon-basket">&nbsp;</span></a><a onclick="addToWishList('32');" title="Add to Wish List"><span class="icon icon-wish">&nbsp;</span></a>
                                </div>
                            </div>
                            <div class="name"><a href="#">${item.goodsbrand }</a></div>
                            <div class="description">${item.goodsdescript }</div>
                            <div class="clearfix"></div>
                        </div>
        			</div>
            </div>
            </c:forEach>   
        
                    </div>
        <div class="clearfix"></div>
        <div class="column">
        	<div class="pagination">
        		<div class="pagecode" style="width:80px;"><a href="goodsdetails.action" onclick="sendpagecode(this);">最后一页</a></div>
        		<div class="pagecode"><a href="goodsdetails.action"  onclick="sendpagecode(this);">5</a></div>
        		<div class="pagecode"><a href="goodsdetails.action"  onclick="sendpagecode(this);">4</a></div>
        		<div class="pagecode"><a href="goodsdetails.action"  onclick="sendpagecode(this);">3</a></div>
        		<div class="pagecode"><a href="goodsdetails.action"  onclick="sendpagecode(this);">${pageBean.pageCode+1 }</a></div>
        		<div class="pagecode" style="width:60px;"onclick="sendpagecode(this);">第一页</div>
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
</div>
</div>
</body>
</html>