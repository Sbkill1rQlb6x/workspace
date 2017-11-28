
<%@ include file="/header.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
 <link rel="stylesheet"
	href="${pageContext.request.contextPath}/login/css/common.css"> 
	<link rel="stylesheet"
	href="${pageContext.request.contextPath}/login/css/login.css">
	<script src="${pageContext.request.contextPath}/login/js/jquery-1.7.2.min.js"></script>
</head>
<body>
<script type="text/javascript">
function validate()
{
	var str = document.getElementById("phone");
	var xmlhttp;
	if (window.XMLHttpRequest)
	{
	    //  IE7+, Firefox, Chrome, Opera, Safari 浏览器执行代码
	    xmlhttp=new XMLHttpRequest();
	}
	else
	{
	    // IE6, IE5 浏览器执行代码
	    xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
	}
	xmlhttp.open("GET","yanzhengma.action?phonenumber="+str.value+"&t="+Math.random(),true);
	xmlhttp.send();
	}
</script>
<div class="login_cont">
		<div class="login_nav">
			<div class="nav_slider">
				<a href="#" class="signup focus">注册</a>
				<a href="#" class="signin">登录</a>
			</div>
		</div>
		<form action="register.action" method="post">
			<div class="input_signup active">
				<input class="input" id="user_name" type="text" aria-label="用户名（包含字母／数字／下划线" placeholder="用户名" name="user_name">
				<div class="hint">请填写符合格式的用户名</div>
				<input class="input" id="user_email" type="text" aria-label="邮箱" placeholder="邮箱" name="user_email">
				<div class="hint">请填写邮箱</div>
				<input class="input" id="phone" type="text" class="account" aria-label="手机号（仅支持中国大陆）" placeholder="手机号（仅支持中国大陆）" name="phone">
				<div class="hint">请填写手机号</div>
				<input type="button"  value="获取验证码"  onclick="validate()"/>
				<input class="input" id="password" type="password" aria-label="密码" placeholder="密码（不少于 6 位）" name="password">
				<div class="hint">请填写符合格式的密码</div>
				<input class="input" id="repassword" type="password" aria-label="密码" placeholder="再次输入密码">
				<div class="hint">请再次输入密码</div>
				<input type="submit" id="submit" class="button" name="button" value="注册">
			</div>
		</form>
		<form action="login.action" method="post">
			<div class="input_signin">
				<input class="input" id="login_user_name" type="text" aria-label="用户名" placeholder="用户名" name="login_user_name">
				<div class="hint">请输入用户名</div>
				<input class="input" id="login_password" type="password" aria-label="密码" placeholder="密码" name="login_password">
				<div class="hint">请输入密码</div>
				<input type="submit" id="button" class="button" name="button" value="登录">
				<div class="forget">
					<a href="forget.html">忘记密码？</a>
				</div>
			</div>
		</form>
	</div>
	<script type="text/javascript" src="${pageContext.request.contextPath}/login/js/login.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/login/js/form.js"></script> 
	
</body>
</html>