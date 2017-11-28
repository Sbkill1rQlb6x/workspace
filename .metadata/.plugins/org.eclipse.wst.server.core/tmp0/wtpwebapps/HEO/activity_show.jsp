<%@include file="/WEB-INF/views/header.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div class="banner">
	<div class="am-g am-container padding-none">
		<div class="am-u-sm-12 am-u-md-12 am-u-lg-8 padding-none">
			<div data-am-widget="slider" class="am-slider am-slider-c1"
				data-am-slider='{"directionNav":false}'>
				<ul class="am-slides">
					<li><img src="images/tad3.png">
						<div class="am-slider-desc">活动图片</div></li>
					<li><img src="images/tad3.png">
						<div class="am-slider-desc">活动图片</div></li>
					<li><img src="images/tad3.png">
						<div class="am-slider-desc">活动图片</div></li>
					<li><img src="images/tad3.png">
						<div class="am-slider-desc">活动图片</div></li>
				</ul>
			</div>

		</div>
		<div class="am-u-sm-12 am-u-md-0 am-u-lg-4 padding-none lrad">
			<div data-am-widget="titlebar"
				class="am-titlebar am-titlebar-default" id="df_title">
				<h2 class="am-titlebar-title ">活动详情</h2>
			</div>
			<div id="hdxq">
				<h2>主题：前后端分离的目的和作用</h2>
				<h2>时间：2017-10-21</h2>
				<h2>地点：大连 大连东软信息学院A3-221</h2>
				<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;活动简介活动简介活动简介活动简介活动简介活动简介活动简介活动简介活动简介活动简介活动简介活动简介活动简介活动简介活动简介活动简介</p>
			</div>
			<script>
                if (document.body.scrollWidth>1024){
                    var heightdiv=$('.am-slides img').height()-$('#df_title').height()-30
                    $('#hdxq').css('height',heightdiv+'px')
                }
            </script>
		</div>
	</div>
</div>

<div class="am-g am-container padding-none">
	<div class="am-u-sm-12 am-u-md-12 am-u-lg-8 ">
		<div data-am-widget="titlebar" class="am-titlebar am-titlebar-default">
			<h2 class="am-titlebar-title ">活动简介</h2>
		</div>
		<div class="newsshow">
			<p class="ltr">
				<span>
					&nbsp;&nbsp;&nbsp;&nbsp;做Web开发也可以说是B/S架构开发，B端和S端从技术体系角度而言异构性很大，换而言之就是B端使用的技术和S端使用的技术不适于同一个体系，这样的结果导致实际开发中，很难做到专业分工，如果项目开发过程中管控不到位，这样的问题可能会影响到整个项目的开发质量，因此前后端分离的目的之一就是要做到专业化分工，提高项目的质量和开发效率。</span>
			</p>
		</div>
	</div>
	<div class="am-u-sm-0 am-u-md-0 am-u-lg-4 ">
		<div data-am-widget="titlebar" class="am-titlebar am-titlebar-default"
			style="margin-bottom: 20px">
			<h2 class="am-titlebar-title ">主办方</h2>
		</div>
		<ul class="am-avg-sm-2 am-avg-md-2 am-avg-lg-2 am-thumbnails">
			<li><img class="am-thumbnail" src="images/bb2.jpg" /></li>
			<li><img class="am-thumbnail" src="images/bb2.jpg" /></li>
		</ul>
	</div>
</div>







<%@include file="/WEB-INF/views/footer.jsp"%>