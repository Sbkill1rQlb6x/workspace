<%@include file="/WEB-INF/views/header.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div id="category_top">
	<div class="am-hide-lg-only kz" id="leftbtn">
		<i class="am-icon-angle-left"></i>
	</div>
	<div class="am-hide-lg-only kz" style="right: 0px;" id="rightbtn">
		<i class="am-icon-angle-right"></i>
	</div>
	<div class="am-container">
		<ul class="am-avg-sm-2 am-avg-md-3 am-avg-lg-6 am-thumbnails"
			id="topface">
			<li><a href="category2.html">
					<div class="ctl">
						<img src="images/face1.jpg">
						<h3>一号女嘉宾</h3>
						<p>MMM</p>
					</div>
					<button type="button" class="am-btn am-btn-default">进入专栏</button>
			</a></li>
			<li><a href="http://www.sina.com">
					<div class="ctl">
						<img src="images/face2.jpg">
						<h3>二号女嘉宾</h3>
						<p>AmazeUI</p>
					</div>
					<button type="button" class="am-btn am-btn-default">进入专栏</button>
			</a></li>
			<li><a href="http://www.qq.com">
					<div class="ctl">
						<img src="images/face3.jpg">
						<h3>三号女嘉宾</h3>
						<p>云适配</p>
					</div>
					<button type="button" class="am-btn am-btn-default">进入专栏</button>
			</a></li>
			<li><a href="http://www.youku.com">
					<div class="ctl">
						<img src="images/face4.jpg">
						<h3>四号女嘉宾</h3>
						<p>XXXX</p>
					</div>
					<button type="button" class="am-btn am-btn-default">进入专栏</button>
			</a></li>
			<li><a href="http://www.yahoo.com">
					<div class="ctl">
						<img src="images/face5.jpg">
						<h3>五号女嘉宾</h3>
						<p>去哪</p>
					</div>
					<button type="button" class="am-btn am-btn-default">进入专栏</button>
			</a></li>
			<li><a href="http://www.china.com">
					<div class="ctl">
						<img src="images/face6.jpg">
						<h3>六号女嘉宾</h3>
						<p>Yahoo</p>
					</div>
					<button type="button" class="am-btn am-btn-default">进入专栏</button>
			</a></li>
		</ul>

	</div>

</div>

<script>
	var countnum = 5 //一共多少个图 例如6个请输入5
	$("#leftbtn")
			.click(
					function() {
						var temp_href = $("#topface li:eq(0) a").attr("href");
						var temp_img = $("#topface li:eq(0) img").attr("src");
						var temp_h3 = $("#topface li:eq(0) h3").html();
						var temp_p = $("#topface li:eq(0) p").html();

						for (i = 0; i < countnum; i++) {
							var n = i + 1;
							$("#topface li:eq(" + i + ") a").attr(
									'href',
									$("#topface li:eq(" + n + ") a").attr(
											"href"));
							$("#topface li:eq(" + i + ") img").attr(
									'src',
									$("#topface li:eq(" + n + ") img").attr(
											"src"));
							$("#topface li:eq(" + i + ") h3").html(
									$("#topface li:eq(" + n + ") h3").html());
							$("#topface li:eq(" + i + ") p").html(
									$("#topface li:eq(" + n + ") p").html());
						}
						;
						$("#topface li:eq(" + countnum + ") a").attr('href',
								temp_href);
						$("#topface li:eq(" + countnum + ") img").attr('src',
								temp_img);
						$("#topface li:eq(" + countnum + ") h3").html(temp_h3);
						$("#topface li:eq(" + countnum + ") p").html(temp_p);
					});
	$("#rightbtn").click(
			function() {
				var temp_href = $("#topface li:eq(" + countnum + ") a").attr(
						"href");
				var temp_img = $("#topface li:eq(" + countnum + ") img").attr(
						"src");
				var temp_h3 = $("#topface li:eq(" + countnum + ") h3").html();
				var temp_p = $("#topface li:eq(" + countnum + ") p").html();

				for (i = countnum; i > 0; i--) {
					var n = i - 1;
					$("#topface li:eq(" + i + ") a").attr('href',
							$("#topface li:eq(" + n + ") a").attr("href"));
					$("#topface li:eq(" + i + ") img").attr('src',
							$("#topface li:eq(" + n + ") img").attr("src"));
					$("#topface li:eq(" + i + ") h3").html(
							$("#topface li:eq(" + n + ") h3").html());
					$("#topface li:eq(" + i + ") p").html(
							$("#topface li:eq(" + n + ") p").html());
				}
				;
				$("#topface li:eq(0) a").attr('href', temp_href);
				$("#topface li:eq(0) img").attr('src', temp_img);
				$("#topface li:eq(0) h3").html(temp_h3);
				$("#topface li:eq(0) p").html(temp_p);
			});
</script>

<div id="cattit">
	<ul class="am-avg-sm-2 am-avg-md-2 am-avg-lg-2">
		<li><h3>
				<a href="#">合作专栏</a>
			</h3></li>
		<li class="active-none"><h3>
				<a href="#">个人专栏</a>
			</h3></li>
	</ul>
</div>
<hr data-am-widget="divider" style=""
	class="am-divider am-divider-default" />

<div id="cattlist" class="am-container">
	<ul class="am-avg-sm-1 am-avg-md-3 am-avg-lg-4">
		<c:forEach begin="1" end="12">
			<li>
				<div class="cattlist_0">
					<div class="cattlist_1">
						<div class="am-g">

							<div class="am-u-sm-4 am-u-md-5 am-u-lg-5 am-vertical-align">
								<div class="am-vertical-align-middle">
									<img src="images/face1.jpg">
								</div>
							</div>
							<div class="am-u-sm-8 am-u-md-7 am-u-lg-7">

								<h3>山边小溪</h3>
								<h4>东软</h4>
								<p>
									文章<span>9</span>
								</p>
							</div>
						</div>
					</div>
					<div class="cattlist_2">
						<p>设计的空间发生快，乐十分的骄傲了开发奥斯卡的房间辣椒反馈。发奥斯卡的房间辣椒反馈。设计的空间发生快，</p>
					</div>
					<div class="cattlist_3">
						<button type="button" class="am-btn am-btn-warning"><a href="${pageContext.request.contextPath}/diary_show.jsp" class="a_fontcolor">查看详情</a>
						</button>
					</div>
				</div>
			</li>
		</c:forEach>




	</ul>
</div>


<%@include file="/WEB-INF/views/footer.jsp"%>