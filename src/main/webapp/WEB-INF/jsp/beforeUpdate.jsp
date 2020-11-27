<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>修改会员之前查询</title>
<script type="text/javascript">
	var b = ${b};
	if(b==0){
		alert("抱歉，查询不到！");
	}
	if(b==2){
		alert("请重新查询！");
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
		margin: 18px 0;
		text-align: left;
	}
	label{
		display:inline-block;
		min-width:100px;
		text-align: center;
		vertical-align: top;
		text-align: center;
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
		<form action="${pageContext.request.contextPath}/beforeUpdate">
			<h1>会员管理系统</h1>
			<div class="form-group">
				<label>姓名（手机号码）：</label><input type="text" name="namephone"/></div>
			<div class="form-group" style="text-align: center;">
				<input type="submit" value="查询" /></div>
				<div class="a">
			<a href="${pageContext.request.contextPath}/redirct/first">首页</a>
		</div>
		</form>
	</div>
</body>
</html>