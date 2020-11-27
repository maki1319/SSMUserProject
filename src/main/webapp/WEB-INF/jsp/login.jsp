<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" isELIgnored="false"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
	form{
		width:auto;
		padding: 10px;
		position: absolute;
		left:50%;
		top: 50%;
		transform: translate(-50%,-50%)
	}
	input[type=text],input[type=password]{
		border:0.5px solid #000000;
		width:160px;
		height: 26px;
	}
	label{
	display:inline-block;
		width:77px;
		text-align: center;
	}
	.form-group{
		padding: 2px;
		margin: 5px 0;
		text-align: center;
	}
	input[type=submit]{
		width:70px;
		height: 32px;
	}
	h1{
		text-align: center;
	}
	h2{
		text-align: center;
	}
</style>
<script type="text/javascript">
	var b = ${b};
	if(b!=null&&(!b)){
		alert("账号或密码不对！");
	}
</script>
</head>
<body>
	<h2>${msg}</h2>
	<form action="${pageContext.request.contextPath}/login/login" method="post">
		<h1>会员管理系统</h1>
		<div class="form-group">
			<label>用户名：</label>
			<input type="text" name="name" value="ssm"/>
		</div>
		<div class="form-group">
			<label>密码：</label>
			<input type="password" name="password" value="123"/>
		</div>
		<div class="form-group">
			<input type="submit" value="登录"/>
		</div>
	</form>
</body>
</html>