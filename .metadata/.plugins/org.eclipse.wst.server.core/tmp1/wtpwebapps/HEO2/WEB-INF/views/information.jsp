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
						<div class="am-slider-desc">滚动新闻</div></li>
					<li><img src="images/tad3.png">
						<div class="am-slider-desc">滚动新闻</div></li>
					<li><img src="images/tad3.png">
						<div class="am-slider-desc">滚动新闻</div></li>
					<li><img src="images/tad3.png">
						<div class="am-slider-desc">滚动新闻</div></li>
				</ul>
			</div>

		</div>
		<div class="am-u-sm-0 am-u-md-0 am-u-lg-4 padding-none lrad">
			<ul class="am-avg-sm-1 am-avg-md-2 am-avg-lg-1">
				<li class="ms"><img src="images/tad3.png"
					class="am-img-responsive"></li>
				<li><img src="images/tad3.png" class="am-img-responsive"></li>
			</ul>
		</div>
	</div>
</div>



<div class="am-g am-container padding-none">
	<div class="am-u-sm-12 am-u-md-12 am-u-lg-8">
		<div data-am-widget="list_news"
			class="am-list-news am-list-news-default ">
			<div class="am-list-news-bd">
				<ul class="am-list">
				<c:forEach begin="1" end="10">
				<li
						class="am-g am-list-item-desced am-list-item-thumbed am-list-item-thumb-left"
						style="border-top: 0px">
						<div class="am-u-sm-5 am-list-thumb">
							<a href="${pageContext.request.contextPath}/information_show.jsp"> <img
								src="images/bb2.jpg" alt="新闻标题" />
							</a>
						</div>

						<div class=" am-u-sm-7 am-list-main">
							<h3 class="am-list-item-hd">
								<a href="${pageContext.request.contextPath}/information_show.jsp">新闻标题</a>
							</h3>

							<div class="am-list-item-text">新闻内容</div>

						</div>
					</li>
					<div class="newsico am-fr">
						<i class="am-icon-clock-o">2017/10/20</i> <i
							class="am-icon-hand-pointer-o">12322</i>
					</div>
				</c:forEach>	
				

				</ul>

				<ul data-am-widget="pagination"
					class="am-pagination am-pagination-default">

					<li class="am-pagination-prev "><a href="#" class="">上一页</a></li>


					<li class=""><a href="#" class="">1</a></li>
					<li><a href="#">2</a></li>
					<li class=""><a href="#" class="">3</a></li>
					<li class=""><a href="#" class="">4</a></li>
					<li class=""><a href="#" class="">5</a></li>
					<li class=""><a href="#" class="">6</a></li>
					<li class=""><a href="#" class="">7</a></li>
					<li class=""><a href="#" class="">8</a></li>
					<li class=""><a href="#" class="">9</a></li>
					<li class=""><a href="#" class="">10</a></li>
					<li class="am-pagination-next "><a href="#" class="">下一页</a></li>
				</ul>
			</div>
		</div>
	</div>
	<div class="am-u-sm-0 am-u-md-0 am-u-lg-4 am-hide-sm">
		<div class="tag bgtag">
			<div data-am-widget="titlebar"
				class="am-titlebar am-titlebar-default">
				<h2 class="am-titlebar-title ">热门标签</h2>
			</div>
			<ul>
				<li class=""><a href="#">的房间打开</a></li>
				<li><a href="#">阿斯达</a></li>
				<li><a href="#">恩恩</a></li>
				<li><a href="#">十二分</a></li>
				<li><a href="#">爱妃</a></li>
				<li><a href="#">而非</a></li>
				<li><a href="#">为非</a></li>
				<li><a href="#">二位</a></li>
				<li><a href="#">维吾尔</a></li>
				<li><a href="#">玩儿玩儿</a></li>
			</ul>
			<div class="am-cf"></div>
		</div>
	</div>
</div>


<div data-am-widget="gotop" class="am-gotop am-gotop-fixed">
	<a href="#top" title="回到顶部"> <span class="am-gotop-title">回到顶部</span>
		<i class="am-gotop-icon am-icon-chevron-up"></i>
	</a>
</div>



<%@include file="/WEB-INF/views/footer.jsp"%>