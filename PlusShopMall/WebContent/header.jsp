
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>plus商城</title>
<!-- 新 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/bootstrap/css/default.css">

<!-- <link rel="stylesheet" href="${pageContext.request.contextPath}/css/carousel.css" > -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/style.css">

<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="${pageContext.request.contextPath}/js/jquery-1.11.3.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script
	src="${pageContext.request.contextPath}/css/bootstrap/js/bootstrap.min.js"></script>
<!-- <script src="${pageContext.request.contextPath}/js/common.js"></script> -->

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/mystyle.css">

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/rightbar/style.css">

<script
	src="${pageContext.request.contextPath}/rightbar/jquery-2.0.3.min.js"
	type="text/javascript"></script>
	
	<!-- 商品动画 -->
	<link rel="stylesheet"
	href="${pageContext.request.contextPath}/goods_an/css/hoverex-all.css">
	<link rel="stylesheet"
	href="${pageContext.request.contextPath}/goods_an/css/templates.css">
	<script
	src="${pageContext.request.contextPath}/goods_an/js/jquery-1.7.2.min.js"
	type="text/javascript"></script>
	<script
	src="${pageContext.request.contextPath}/goods_an/js/jquery.hoverex.js"
	type="text/javascript"></script>
	
	
	
</head>
<body>


	<!-- 侧边栏开始 -->
	<script type="text/javascript">
		$(document).ready(function() {
			$(".side ul li").hover(function() {
				$(this).find(".sidebox").stop().animate({
					"width" : "124px"
				}, 200).css({
					"opacity" : "1",
					"filter" : "Alpha(opacity=100)",
					"background" : "#ae1c1c"
				})
			}, function() {
				$(this).find(".sidebox").stop().animate({
					"width" : "54px"
				}, 200).css({
					"opacity" : "0.8",
					"filter" : "Alpha(opacity=80)",
					"background" : "#000"
				})
			});
		});
		//回到顶部
		function goTop() {

			$('html,body').animate({
				'scrollTop' : 0
			}, 600);
		}
	</script>
	<div class="side">

		<ul>

			<li><a href="#"><div class="sidebox">
						<img src="${pageContext.request.contextPath}/rightbar/rightbar_img/side_icon01.png">客服中心
					</div></a></li>

			<li><a href="#"><div class="sidebox">
						<img src="${pageContext.request.contextPath}/rightbar/rightbar_img/side_icon02.png">客户案例
					</div></a></li>

			<li><a href="javascript:void(0);"><div class="sidebox">
						<img src="${pageContext.request.contextPath}/rightbar/rightbar_img/side_icon04.png">QQ客服
					</div></a></li>

			<li><a href="javascript:void(0);"><div class="sidebox">
						<img src="${pageContext.request.contextPath}/rightbar/rightbar_img/side_icon03.png">新浪微博
					</div></a></li>

			<li style="border: none;"><a href="javascript:goTop();"
				class="sidetop"><img src="${pageContext.request.contextPath}/rightbar/rightbar_img/side_icon05.png"></a></li>

		</ul>

	</div>
	<!-- 侧边栏结束 -->


	<div class="container">


		<br>
		<div class="row-fluid" style="margin-top: 100px">
			<div class="span12">
				<h2>
					<em> <span style="font-size:30px;">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp购物可以治愈一切！</span></em>
				</h2>
				<p >
					<em style="font-size:15px">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
						&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
						&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
						&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp——
						一位很有名的人</em>
				</p>
			</div>
		</div>
		<br> <br>
		<div class="row clearfix">
			<div class="col-md-12 ">



				<ol class="breadcrumb text-right" id="info">

					<li id="li1"><span>
					<%
						String user_name=(String)session.getAttribute("loginName");
						if(user_name!=null)
						{
							out.print(user_name);
						}
						else
						{
							out.print("游客");
						}
					%>
					
					您好，欢迎来到Plus商城！</span> <a
						href="${pageContext.request.contextPath}/login/login.jsp" data-toggle="modal">[登录]&nbsp;&nbsp;/&nbsp;&nbsp;[新用户注册]</a>&nbsp;</li>
					<li><a href="shopcar.action" onclick="">购物车 <span class="badge"
							id="cartBadge"></span></a></li>
					<li><a href="#" onclick="">收藏夹 <span class="badge"
							id="cartBadge"></span></a></li>
				</ol>
				<nav class="navbar navbar-default navbar-fixed-top"
					role="navigation">
					<div class="navbar-header">
						<button type="button" class="navbar-toggle" data-toggle="collapse"
							data-target="#bs-example-navbar-collapse-1">
							<span class="sr-only">Toggle navigation</span><span
								class="icon-bar"></span><span class="icon-bar"></span><span
								class="icon-bar"></span>
						</button>
						<a class="navbar-brand"
							href="${pageContext.request.contextPath}/index.action"><span
							class="logo">Plus</span> 商城</a>
					</div>

					<div class="collapse navbar-collapse"
						id="bs-example-navbar-collapse-1">
						<ul class="nav navbar-nav">
							<li class="active"><a
								href="${pageContext.request.contextPath}/index.action">首页</a></li>
							<li><a
								href="sale_goods.action">热销商品</a></li>
							<li><a
								href="new_goods.action">新到商品</a></li>

							<li><a
								href="goods_sort.action?sort=3">商品分类</a></li>
						</ul>
						<form class="navbar-form navbar-left" role="search">
							<div class="form-group">
								<input type="text" class="form-control" />
							</div>
							<button type="submit" class="btn btn-default">店内搜索</button>
						</form>
						<ul class="nav navbar-nav navbar-right">

							<li class="dropdown"><a href="#" class="dropdown-toggle"
								data-toggle="dropdown">排序<strong class="caret"></strong></a>
								<ul class="dropdown-menu">
									<li><a href="#">按价格从低到高</a></li>
									<li><a href="#">按价格从高到低</a></li>
									<li class="divider"></li>
									<li><a href="#">按销量从高到低</a></li>
									<li><a href="#">按销量从低到高</a></li>
								</ul></li>
						</ul>
					</div>

				</nav>
			</div>
		</div>