/**
 * 
 */

function checkViewCode(){
	
	let vcode = document.getElementById("vcode").value;
	let xhr ;
	if(window.XMLHttpRequest){
		xhr = new XMLHttpRequest();
	}else{
		xhr = new ActiveXObject("Microsoft.XMLHTTP");
	}
	xhr.onreadystatechange=function(){
		if(xhr.readyState==4&&xhr.status==200){
			 let res = xhr.responseText;
			alert(200);
			alert("response is" + res);
		}else{
			//alert(0);
		}
	}
	xhr.open("POST","../vcodesubmit.action",true);
	let data = vcode;
	xhr.send(data);
	
}