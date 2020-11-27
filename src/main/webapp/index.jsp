
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
<title>首页</title>
<style>
h1 {
	text-align: center;
}
h4 {
	text-align: center;
	height: 100%;
	width: 100%;
}
</style>
</head>
<body>
	<h1>欢迎来到会员管理系统</h1>
	<h4 id="mes"></h4>
	<script type="text/javascript">
	var s = 6;
//  向页面添加内容
	function f1(s){
		document.getElementById("mes").innerHTML="请稍等，还有"+s+"秒跳转";
	}
//  定时器:循环调用
	setInterval(function name(){
		s=s-1;
		f1(s);
		if(s==0){
			clearInterval();
			window.location.href='${pageContext.request.contextPath}/login/first';
		}
	}, 1000);
</script>
</body>
</html>
