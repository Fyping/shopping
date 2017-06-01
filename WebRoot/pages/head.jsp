<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<meta charset="utf-8"/>
<link rel="stylesheet" type="text/css" href="${srcpath }css.css" />
<title>优购手机商城</title>
<style type="text/css">
a:link,a:visited{
 text-decoration:none;  /*超链接无下划线*/
 color:grey;
 font-size:12px;
}
a:hover{
 text-decoration:none;  /*鼠标放上去有下划线*/
 color:black;
 font-size:13px;
 cursor:pointer;
}

</style>
<script>
function sendpagecode(hand){
	var codenum ="pagecode="+hand.innerHTML;
	alert(codenum);
    var xhr ;
    if (window.XMLHttpRequest)
    {// code for IE7+, Firefox, Chrome, Opera, Safari
        xhr=new XMLHttpRequest();
    }
    else
    {// code for IE6, IE5
        xhr=new ActiveXObject("Microsoft.XMLHTTP");
    }
    xhr.open("POST","goodsdetails.action",true);
    xhr.setRequestHeader("Content-type","application/x-www-form-urlencoded");
    xhr.send(codenum);
}

</script>