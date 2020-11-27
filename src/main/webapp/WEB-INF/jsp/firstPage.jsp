<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
	.box a{
		font-size: 24px;
		color:#0000FF;
		text-decoration: none;
	}
	.box a:hover{
		text-decoration: underline;
	}
</style>
</head>
<body>

	<div class='box'>
		<h1>会员管理系统</h1>
		<a href="${pageContext.request.contextPath}/redirct/add">增加会员</a>
		<a href="${pageContext.request.contextPath}/redirct/delete">删除会员</a>
		<a href="${pageContext.request.contextPath}/redirct/before">修改会员</a>
		<a href="${pageContext.request.contextPath}/redirct/select">查询会员</a>
	</div>
</body>
</html>