<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>个人信息</title>
<style type="text/css">
	h1{
		text-align: center;
	}
	.box{
		width:100%;
		height:100vh;
		display: flex;
		flex-direction: column;
		align-items: center;
		justify-content: center;
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
		<h1>会员信息表</h1>
		<table border="1">
			<tr>
				<th colspan="9">会员个人信息</th>
			</tr>
			<tr>
				<td>id</td>
				<td>名字</td>
				<td>年龄</td>
				<td>性别(男性：0，女性：1）</td>
				<td>电话</td>
				<td>住址</td>
				<td>爱好（跑步： 1，打球：2 游泳：3）</td>
				<td>加入时间</td>
				<td>备注</td>
				<td>操作</td>
			</tr>
			${str}
		</table>
		<div class="a">
			<a href="${pageContext.request.contextPath}/redirct/first">返回首页</a>
		</div>
	</div>
</body>
</html>