<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>后台模板</title>

<script type="text/javascript" src="js/jquery.min.js"></script>

<link rel="stylesheet" href="css/add.css" type="text/css" media="screen" />
<link rel="stylesheet" href="utilLib/bootstrap.min.css" type="text/css" media="screen" />

</head>
<body>
<div class="div_from_aoto" style="width: 500px;">
    <form action="/ssm_second/adminlogin.action" method="POST">
        <div class="control-group">
            <label class="laber_from">管理员ID</label>
            <div  class="controls" ><input name="adminid" class="input_from" type="text" placeholder=" 请输入您拥有的ID"/><p class=help-block></p></div>
        </div>
        <div class="control-group">
            <label class="laber_from">密码</label>
            <div  class="controls" ><input name="adminpassword" class="input_from" type="text" placeholder=" 请输入密码"><p class=help-block></p></div>
        </div>
        <div class="control-group">
            <label class="laber_from" >确认密码</label>
            <div  class="controls" ><input class="input_from" type=text placeholder=" 请输入确认密码"><p class=help-block></p></div>
        </div>
        <div class="control-group">
            <label class="laber_from">角色</label>
            <div  class="controls" >
                <SELECT name="adminrole" class="input_select">
                    <OpTION selected value="chairman">董事长</OpTION>
                    <OpTION value="generalmanager">总经理</OpTION>
                    <OpTION value="manager">经理</OpTION>
                    <OpTION value="executivedirector">主管</OpTION>
                </SELECT>
            </div>
        </div>
        <div class="control-group">
            <label class="laber_from" ></label>
            <div class="controls" ><button class="btn btn-success" style="width:120px;" >确认</button></div>
        </div>
    </form>
</div>
</body>
</html>