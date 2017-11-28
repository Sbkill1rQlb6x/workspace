<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
	
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Set render engine for 360 browser -->
<meta name="renderer" content="webkit">

<!-- No Baidu Siteapp-->
<meta http-equiv="Cache-Control" content="no-siteapp" />

<link rel="icon" type="image/png" href="assets/i/favicon.png">

<!-- Add to homescreen for Chrome on Android -->
<meta name="mobile-web-app-capable" content="yes">
<link rel="icon" sizes="192x192" href="assets/i/app-icon72x72@2x.png">

<!-- Add to homescreen for Safari on iOS -->
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta name="apple-mobile-web-app-title" content="Amaze UI" />
<link rel="apple-touch-icon-precomposed"
	href="assets/i/app-icon72x72@2x.png">

<!-- Tile icon for Win8 (144x144 + tile color) -->
<meta name="msapplication-TileImage"
	content="assets/i/app-icon72x72@2x.png">
<meta name="msapplication-TileColor" content="#0e90d2">
<link rel="stylesheet" href="./assets/css/amazeui.css">
<link rel="stylesheet" href="./assets/css/amazeui.min.css">

<link rel="stylesheet" href="./assets/css/amazeui.datatables.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/app.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/public.css">

<title>Insert title here</title>
</head>
<body>

	<header class="am-topbar am-topbar-fixed-top wos-header">
	<div class="am-container">
		<h1 class="am-topbar-brand">
			<a href="${pageContext.request.contextPath}/WEB-INF/views/home.jsp">互助</a>
		</h1>

		<button
			class="am-topbar-btn am-topbar-toggle am-btn am-btn-sm am-btn-warning am-show-sm-only"
			data-am-collapse="{target: '#collapse-head'}">
			<span class="am-sr-only">导航切换</span> <span class="am-icon-bars"></span>
		</button>

		<div class="am-collapse am-topbar-collapse" id="collapse-head">
			<ul class="am-nav am-nav-pills am-topbar-nav">
				<li><a href="${pageContext.request.contextPath}/home.jsp">首页</a></li>
				<li><a href="information.jsp">今日资讯</a></li>
				<li><a href="${pageContext.request.contextPath}/diary.jsp">专栏</a></li>
				<li class="am-dropdown" data-am-dropdown><a
					class="am-dropdown-toggle" data-am-dropdown-toggle
					href="javascript:;"> 案例 <span class="am-icon-caret-down"></span>
				</a>
					<ul class="am-dropdown-content">
						<li class="am-dropdown-header">案例</li>
						<li><a href="#">1. 游戏案例</a></li>
						<li><a href="#">2. 营销案例</a></li>
						<li><a href="#">3. 工具案例</a></li>
						<li><a href="cases.html">4. 全部案例</a></li>
					</ul></li>
				<li><a href="${pageContext.request.contextPath}/lost.do">评测</a></li>
				<li><a href="${pageContext.request.contextPath}/activity.jsp">活动</a></li>
			</ul>

			<div class="am-topbar-right">
				<button class="am-btn am-btn-danger am-topbar-btn am-btn-sm"
					data-am-offcanvas="{target: '#myside',effect: 'push'}">
					<span class="am-icon-home am-icon-sm"></span>
				</button>
			</div>
		</div>
	</div>
	</header>
	<!-- 侧边栏内容 -->
	<div id="myside" class="am-offcanvas">
		<div class="am-offcanvas-bar am-offcanvas-bar-flip">
			<div class="am-offcanvas-content">
				<div class="am-g login-face-center">
					<img class="am-circle am-img-thumbnail"
						src="http://s.amazeui.org/media/i/demos/bw-2014-06-19.jpg?imageView/1/w/1000/h/1000/q/80"
						width="140" height="140" style="text-align: center;" />
				</div>
				<div class="am-g">
					<ul class="am-nav side_content">
						<li><a href="${pageContext.request.contextPath}/login.do">登录</a></li>
						<li><a href="${pageContext.request.contextPath}/register.do">注册</a></li>
						<li><a href="#">消息</a></li>
						<li class="am-nav-divider"></li>
						<li><a href="#">我的动态</a></li>
						<li><a href="#">设置</a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>






	<!--[if (gte IE 9)|!(IE)]><!-->
	<script src="./assets/js/jquery.min.js"></script>
	<!--<![endif]-->
	<!--[if lte IE 8 ]>
<script src="http://libs.baidu.com/jquery/1.11.3/jquery.min.js"></script>
<script src="http://cdn.staticfile.org/modernizr/2.8.3/modernizr.js"></script>
<script src="assets/js/amazeui.ie8polyfill.min.js"></script>
<![endif]-->
	<script src="./assets/js/amazeui.min.js"></script>
	<script src="./assets/js/public.js"></script>
	<script type="./assets/js/amazeui.datatables.min.js"></script>