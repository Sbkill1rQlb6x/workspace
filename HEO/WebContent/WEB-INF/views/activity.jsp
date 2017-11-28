<%@include file="/WEB-INF/views/header.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div class="am-container" style="margin-top: 10px">
	<img src="images/tad1.png" class="am-img-responsive" alt="" />
</div>
<div class="star am-container mcenter">
	<span><img src="images/star.png">即将开始</span>
</div>
<div class="am-container events">
	<ul data-am-widget="gallery"
		class="am-gallery am-avg-sm-1 am-avg-md-2 am-avg-lg-2 am-gallery-bordered"
		data-am-gallery="{  }">
		<c:forEach begin="1" end="4" var="c">
		<li>
			<div class="am-gallery-item">
				<a href="${pageContext.request.contextPath}/activity_show.jsp" class="">
					<img src="${pageContext.request.contextPath}/images/bb1.jpg" alt="活动标题" />
					<div class="efe">活动标题</div>
					<p>活动简介活动简介活动简介活动简介活动简介活动简介活动简介活动简介活动简介活动简介</p>
					<div class="am-gallery-desc fee">
						<div class="am-fl">大连</div>
						<div class="am-fr">2017-10-20</div>
					</div>
				</a>
			</div>
		</li>
		</c:forEach>
		
	</ul>
	<div class="am-fr"></div>

</div>



<div class="star am-container mcenter">
	<span><img src="images/star.png">往期活动</span>
</div>
<div class="am-container">
	<ul data-am-widget="gallery"
		class="am-gallery am-avg-sm-2 am-avg-md-3 am-avg-lg-3 am-gallery-default"
		data-am-gallery="{ pureview: true }">
		<li>
			<div class="am-gallery-item">
				<a href="http://s.amazeui.org/media/i/demos/bing-1.jpg" class="">
					<img src="http://s.amazeui.org/media/i/demos/bing-1.jpg" alt="活动标题" />
					<div class="events-btn">
						<button type="button" class="am-btn am-btn-default">活动回顾</button>
					</div>
				</a>
			</div>
		</li>
		<li>
			<div class="am-gallery-item">
				<a href="http://s.amazeui.org/media/i/demos/bing-2.jpg" class="">
					<img src="http://s.amazeui.org/media/i/demos/bing-2.jpg"
					alt="某天 也许会相遇 相遇在这个好地方" />
					<div class="events-btn">
						<button type="button" class="am-btn am-btn-default">活动回顾</button>
					</div>
				</a>
			</div>
		</li>
		<li>
			<div class="am-gallery-item">
				<a href="http://s.amazeui.org/media/i/demos/bing-3.jpg" class="">
					<img src="http://s.amazeui.org/media/i/demos/bing-3.jpg"
					alt="不要太担心 只因为我相信" />
					<div class="events-btn">
						<button type="button" class="am-btn am-btn-default">活动回顾</button>
					</div>
				</a>
			</div>
		</li>
		<li>
			<div class="am-gallery-item">
				<a href="http://s.amazeui.org/media/i/demos/bing-4.jpg" class="">
					<img src="http://s.amazeui.org/media/i/demos/bing-4.jpg"
					alt="终会走过这条遥远的道路" />
					<div class="events-btn">
						<button type="button" class="am-btn am-btn-default">活动回顾</button>
					</div>
				</a>
			</div>
		</li>
		<li>
			<div class="am-gallery-item">
				<a href="http://s.amazeui.org/media/i/demos/bing-3.jpg" class="">
					<img src="http://s.amazeui.org/media/i/demos/bing-3.jpg"
					alt="不要太担心 只因为我相信" />
					<div class="events-btn">
						<button type="button" class="am-btn am-btn-default">活动回顾</button>
					</div>
				</a>
			</div>
		</li>
		<li>
			<div class="am-gallery-item">
				<a href="http://s.amazeui.org/media/i/demos/bing-4.jpg" class="">
					<img src="http://s.amazeui.org/media/i/demos/bing-4.jpg"
					alt="终会走过这条遥远的道路" />
					<div class="events-btn">
						<button type="button" class="am-btn am-btn-default">活动回顾</button>
					</div>
				</a>
			</div>
		</li>
	</ul>
	<div class="am-fr"></div>

</div>






<%@include file="/WEB-INF/views/footer.jsp"%>