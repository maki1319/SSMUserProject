<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>增加会员</title>
<script type="text/javascript">
	var b = ${b};
	if(!b){
		alert("添加失败！");
	}
</script>
<style type="text/css">
	body{
		font-size:16px;
	}
	.box{
		width:100%;
		height:100vh;
		display: flex;
		flex-direction: column;
		align-items: center;
		justify-content: center;
	}
	input[type=text],input[type=password]{
		width:160px;
		height: 26px;
	}
	input[type=submit]{
		width:70px;
		height: 32px;
	}
	.form-group{
		padding: 2px;
		margin: 5px 0;
		text-align: left;
	}
	textarea {
		resize:none;
		width:160px;
		height:72px;
	}
	label{
		display:inline-block;
		width:77px;
		text-align: center;
		vertical-align: top;
		text-align: center;
	}
	.textarea{
		height:77px;
		line-height:77px;
		display: inline-block;
	}
	.sub{
		text-align: center;
	}
	.sex{
		display: inline-block;
		margin: 0 5px;
	}
	h1{
		text-align: center;
	}
	.a{
		width:100%;
		text-align: center;
		margin: 15px 0;
	}
</style>
</head>
<body>
<div class="box">
	<form action="${pageContext.request.contextPath}/addMember">
		<h1>会员管理系统</h1>
		<div class="form-group"><label>姓名：</label><input type="text" name="name" /></div>
		<div class="form-group"><label>年龄：</label><input type="text" name="age" /></div>
		<div class="form-group">
			<label>性别：</label>
			<span class="sex">男：</span><input type="radio" name="sex" value="0"/>
			<span class="sex">女：</span><input type="radio" name="sex" value="1"/>
		</div>
		<div class="form-group"><label>电话：</label><input type="text" name="phone" /></div>
		<div class="form-group"><label>地址：</label><input type="text" name="address" /></div>
		<div class="form-group"><label>爱好：</label>跑步：<input type="checkbox" name="hobby" value="1">
			打球：<input type="checkbox" name="hobby" value="2">
			游泳：<input type="checkbox" name="hobby" value="3"></div>
		<div class="form-group textarea"><label>备注：</label><textarea rows="5" cols="10" name="remarks"></textarea></div>
		<div class="form-group sub"><input type="submit" value="添加" /></div>
		<div class="a">
			<a href="${pageContext.request.contextPath}/redirct/first">返回首页</a>
		</div>
	</form>
</div>
</body>
</html>