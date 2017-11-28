
<%@include file="/topad.jsp"%>
<%@include file="../header.jsp"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div class="carousel slide" id="carousel-210314" data-ride="carousel"
	data-interval="2000">
	<ol class="carousel-indicators">
		<li class="active" data-slide-to="0" data-target="#carousel-210314">
		</li>
		<li data-slide-to="1" data-target="#carousel-210314"></li>
		<li data-slide-to="2" data-target="#carousel-210314"></li>
	</ol>
	<div class="carousel-inner">
		<div class="item active">
			<img alt=""
				src="${pageContext.request.contextPath}/images/adver/ad1.jpg" />

		</div>
		<div class="item">
			<img alt=""
				src="${pageContext.request.contextPath}/images/adver/ad2.jpg" />

		</div>
		<div class="item">
			<img alt=""
				src="${pageContext.request.contextPath}/images/adver/ad3.jpg" />
		</div>
	</div>
	<a class="left carousel-control" href="#carousel-210314"
		data-slide="prev"><span class="glyphicon glyphicon-chevron-left"></span></a>
	<a class="right carousel-control" href="#carousel-210314"
		data-slide="next"><span class="glyphicon glyphicon-chevron-right"></span></a>
</div>
<!-- 今日推荐 -->
<div class="row clearfix">

	<div class="col-md-2 column ">
		<div class="thumbnail today-style">
			<div class="caption">
				<h3 style="color: red;">吃货天堂</h3>
			</div>
			<img
				src="${pageContext.request.contextPath}/images/goods/recommend.png" />
		</div>
	</div>



	<c:forEach items="${commfoods}" var="c" varStatus="vs">
		<c:if test="${vs.count<=5 }">
		<div class="col-md-2 column ">

			<div class="thumbnail homegoods">
								<div class="he-wrap tpl1">

									<img alt="暂无图片"
										src="${pageContext.request.contextPath}${c.goods_pic}1.jpg" />

									<div class="he-view">

										<div class="sider-right a0" data-animate="fadeInRight">
											<a href="#" data-animate="fadeInRight"></a>
											<a href="#" class="a1 zoom" data-animate="fadeInRight"></a><a
												href="#" class="a2 undo" data-animate="fadeInRight"></a><a
												href="#" class="a3 check" data-animate="fadeInRight"> </a><a
												href="#" class="a4 close" data-animate="fadeInRight"></a>

										</div>

									</div>

								</div>
								<div class="caption caption-style">
									
									<p class="font-red">￥ ${c.goods_sale_price }</p>
									<a href="goods_detail.action?goods_id=${c.goods_id}">
									<p>${c.goods_name }</p>
									</a>
								</div>
							</div>
		
		</div>
		
		</c:if>

	</c:forEach>

</div>


<div class="navtitle">
	<span class="cate-title">服装</span> <a
		class="btn btn-default btn-xs pull-right btn-more" href="#"
		role="button">更多美味</a>
	<ul class="list-inline pull-right cate-ul">

	</ul>
</div>




<div class="tabbable" id="tabs-716765">
	<ul class="nav nav-tabs">
		<li class="active"><a href="#panel-519989" data-toggle="tab">男装</a></li>
		<li><a href="#panel-546923" data-toggle="tab">女装</a></li>
		<li><a href="#xie" data-toggle="tab">鞋</a></li>
	</ul>
	<div class="tab-content">
		<div class="tab-pane active" id="panel-519989">
			<p>
			<div class="row">
				<c:forEach items="${manclothes }" var="g" varStatus="gvs">
					<c:if test="${gvs.count<=6 }">
					
					<div class="col-md-2">
						<a href="#">
							<div class="thumbnail homegoods">
								<div class="he-wrap tpl1">

									<img alt="暂无图片"
										src="${pageContext.request.contextPath}${g.goods_pic}1.jpg" />

									<div class="he-view">

										<div class="sider-right a0" data-animate="fadeInRight">

											<a href="#" class="a1 zoom" data-animate="fadeInRight"></a><a
												href="#" class="a2 undo" data-animate="fadeInRight"></a><a
												href="#" class="a3 check" data-animate="fadeInRight"> </a><a
												href="#" class="a4 close" data-animate="fadeInRight"></a>

										</div>

									</div>

								</div>
								<div class="caption caption-style">
								<p class="font-red">￥ ${g.goods_sale_price }</p>
									<a href="goods_detail.action?goods_id=${g.goods_id}">
									<p>${g.goods_name}</p>
									</a>
								</div>
							</div>
						</a>
					</div>
					
					
					</c:if>
				</c:forEach>
			</div>
			</p>
		</div>
		<div class="tab-pane" id="panel-546923">
			<p>
			<div class="row">
				<c:forEach items="${womanclothes }" var="g" varStatus="gvs">
					<c:if test="${gvs.count<=6 }">
					
					<div class="col-md-2">
						<a href="#">
							<div class="thumbnail homegoods">
								<div class="he-wrap tpl1">

									<img alt="暂无图片"
										src="${pageContext.request.contextPath}${g.goods_pic}1.jpg" />

									<div class="he-view">

										<div class="sider-right a0" data-animate="fadeInRight">

											<a href="#" class="a1 zoom" data-animate="fadeInRight"></a><a
												href="#" class="a2 undo" data-animate="fadeInRight"></a><a
												href="#" class="a3 check" data-animate="fadeInRight"> </a><a
												href="#" class="a4 close" data-animate="fadeInRight"></a>

										</div>

									</div>

								</div>
								<div class="caption caption-style">
								<p class="font-red">￥ ${g.goods_sale_price }</p>
									<a href="goods_detail.action?goods_id=${g.goods_id}">
									<p>${g.goods_name}</p>
									</a>
								</div>
							</div>
						</a>
					</div>
					
					
					</c:if>
				</c:forEach>
			</div>
			</p>
		</div>

		<div class="tab-pane" id="xie">
			<p>
			<div class="row">
				<c:forEach items="${shoes }" var="g" varStatus="gvs">
					<c:if test="${gvs.count<=6 }">
					
					<div class="col-md-2">
						<a href="#">
							<div class="thumbnail homegoods">
								<div class="he-wrap tpl1">

									<img alt="暂无图片"
										src="${pageContext.request.contextPath}${g.goods_pic}1.jpg" />

									<div class="he-view">

										<div class="sider-right a0" data-animate="fadeInRight">

											<a href="#" class="a1 zoom" data-animate="fadeInRight"></a><a
												href="#" class="a2 undo" data-animate="fadeInRight"></a><a
												href="#" class="a3 check" data-animate="fadeInRight"> </a><a
												href="#" class="a4 close" data-animate="fadeInRight"></a>

										</div>

									</div>

								</div>
								<div class="caption caption-style">
								<p class="font-red">￥ ${g.goods_sale_price }</p>
									<a href="goods_detail.action?goods_id=${g.goods_id}">
									<p>${g.goods_name}</p>
									</a>
								</div>
							</div>
						</a>
					</div>
					
					
					</c:if>
				</c:forEach>
			</div>
			</p>
		</div>

	</div>
</div>




<div class="row">
	<div class="col-md-4">
		<div class="panel panel-default">
			<div class="panel-heading" style="background-color: #4998a1;">

				<h3 class="panel-title">热销商品</h3>
			</div>
			<div class="panel-body">

				<div class="row">
					<c:forEach items="${homehot }" var="g" varStatus="gvs">
					<c:if test="${gvs.count<=2 }">
					
					<div class="col-md-6">
						<a href="#">
							<div class="thumbnail homegoods">
								<div class="he-wrap tpl1">

									<img alt="暂无图片"
										src="${pageContext.request.contextPath}${g.goods_pic}1.jpg" />

									<div class="he-view">

										<div class="sider-right a0" data-animate="fadeInRight">

											<a href="#" class="a1 zoom" data-animate="fadeInRight"></a><a
												href="#" class="a2 undo" data-animate="fadeInRight"></a><a
												href="#" class="a3 check" data-animate="fadeInRight"> </a><a
												href="#" class="a4 close" data-animate="fadeInRight"></a>

										</div>

									</div>

								</div>
								<div class="caption caption-style">
								<p class="font-red">￥ ${g.goods_sale_price }</p>
									<a href="goods_detail.action?goods_id=${g.goods_id}">
									<p>${g.goods_name}</p>
									</a>
								</div>
							</div>
						</a>
					</div>
					</c:if>
				</c:forEach>
				</div>
			</div>
		</div>
	</div>

	<div class="col-md-4">
		<div class="panel panel-default">
			<div class="panel-heading " style="background-color: #76488e;">

				<h3 class="panel-title">新到商品</h3>
			</div>
			<div class="panel-body">

				<div class="row">
					<c:forEach items="${homenew }" var="g" varStatus="gvs">
					<c:if test="${gvs.count<=2 }">
					
					<div class="col-md-6">
						<a href="#">
							<div class="thumbnail homegoods">
								<div class="he-wrap tpl1">

									<img alt="暂无图片"
										src="${pageContext.request.contextPath}${g.goods_pic}1.jpg" />

									<div class="he-view">

										<div class="sider-right a0" data-animate="fadeInRight">

											<a href="#" class="a1 zoom" data-animate="fadeInRight"></a><a
												href="#" class="a2 undo" data-animate="fadeInRight"></a><a
												href="#" class="a3 check" data-animate="fadeInRight"> </a><a
												href="#" class="a4 close" data-animate="fadeInRight"></a>

										</div>

									</div>

								</div>
								<div class="caption caption-style">
								<p class="font-red">￥ ${g.goods_sale_price }</p>
									<a href="goods_detail.action?goods_id=${g.goods_id}">
									<p>${g.goods_name}</p>
									</a>
								</div>
							</div>
						</a>
					</div>
					</c:if>
				</c:forEach>
				</div>
			</div>
		</div>
	</div>

	<div class="col-md-4">
		<div class="panel panel-default">
			<div class="panel-heading " style="background-color: #e77005;">

				<h3 class="panel-title">特价商品</h3>
			</div>
			<div class="panel-body">

				<div class="row">
					<c:forEach items="${homesale }" var="g" varStatus="gvs">
					<c:if test="${gvs.count<=2 }">
					
					<div class="col-md-6">
						<a href="#">
							<div class="thumbnail homegoods">
								<div class="he-wrap tpl1">

									<img alt="暂无图片"
										src="${pageContext.request.contextPath}${g.goods_pic}1.jpg" />

									<div class="he-view">

										<div class="sider-right a0" data-animate="fadeInRight">

											<a href="#" class="a1 zoom" data-animate="fadeInRight"></a><a
												href="#" class="a2 undo" data-animate="fadeInRight"></a><a
												href="#" class="a3 check" data-animate="fadeInRight"> </a><a
												href="#" class="a4 close" data-animate="fadeInRight"></a>

										</div>

									</div>

								</div>
								<div class="caption caption-style">
								<p class="font-red">￥ ${g.goods_sale_price }</p>
									<a href="goods_detail.action?goods_id=${g.goods_id}">
									<p>${g.goods_name}</p>
									</a>
								</div>
							</div>
						</a>
					</div>
					</c:if>
				</c:forEach>
				</div>
			</div>
		</div>
	</div>
</div>


<div class="panel panel-default">
	<div class="panel-heading "
		style="background: linear-gradient(90deg, #f03118, #e62910)">

		<h3 class="panel-title">秒杀商品<%@ include file="/clock/clock.jsp" %></h3>
	</div>
	<div class="panel-body">

		<div class="row">
			<c:forEach items="${homekill }" var="g" varStatus="gvs">
					<c:if test="${gvs.count<=6 }">
					
					<div class="col-md-2">
						<a href="#">
							<div class="thumbnail homegoods">
								<div class="he-wrap tpl1">

									<img alt="暂无图片"
										src="${pageContext.request.contextPath}${g.goods_pic}1.jpg" />

									<div class="he-view">

										<div class="sider-right a0" data-animate="fadeInRight">

											<a href="#" class="a1 zoom" data-animate="fadeInRight"></a><a
												href="#" class="a2 undo" data-animate="fadeInRight"></a><a
												href="#" class="a3 check" data-animate="fadeInRight"> </a><a
												href="#" class="a4 close" data-animate="fadeInRight"></a>

										</div>

									</div>

								</div>
								<div class="caption caption-style">
								<p class="font-red">￥ ${g.goods_sale_price }</p>
									<a href="goods_detail.action?goods_id=${g.goods_id}">
									<p>${g.goods_name}</p>
									</a>
								</div>
							</div>
						</a>
					</div>
					</c:if>
				</c:forEach>
		</div>
	</div>
</div>

<div class="row-fluid">
	<div class="span12">
		<div class="page-header">
			<h3
				style="text-align: center; font-size: 16px; color: #333; font-weight: 500">
				<em>·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp爱生活&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp</em>
			</h3>
		</div>
	</div>
</div>

<div class="row">
	<div class="col-md-6">
		<div class="panel panel-default">
			<div class="panel-heading "
				style="background: linear-gradient(90deg, #974676, #9e4075)">

				<h3 class="panel-title">爱男神</h3>
			</div>
			<div class="panel-body">

				<div class="row">
					<c:forEach items="${homemangod }" var="g" varStatus="gvs">
					<c:if test="${gvs.count<=3 }">
					
					<div class="col-md-4">
						<a href="#">
							<div class="thumbnail homegoods">
								<div class="he-wrap tpl1">

									<img alt="暂无图片"
										src="${pageContext.request.contextPath}${g.goods_pic}1.jpg" />

									<div class="he-view">

										<div class="sider-right a0" data-animate="fadeInRight">

											<a href="#" class="a1 zoom" data-animate="fadeInRight"></a><a
												href="#" class="a2 undo" data-animate="fadeInRight"></a><a
												href="#" class="a3 check" data-animate="fadeInRight"> </a><a
												href="#" class="a4 close" data-animate="fadeInRight"></a>

										</div>

									</div>

								</div>
								<div class="caption caption-style">
								<p class="font-red">￥ ${g.goods_sale_price }</p>
									<a href="goods_detail.action?goods_id=${g.goods_id}">
									<p>${g.goods_name}</p>
									</a>
								</div>
							</div>
						</a>
					</div>
					</c:if>
				</c:forEach>
				</div>
			</div>
		</div>
	</div>

	<div class="col-md-6">
		<div class="panel panel-default">
			<div class="panel-heading "
				style="background: linear-gradient(90deg, #cd375e, #c1314d);">

				<h3 class="panel-title">爱女神</h3>
			</div>
			<div class="panel-body">

				<div class="row">
					<c:forEach items="${homegodness }" var="g" varStatus="gvs">
					<c:if test="${gvs.count<=3 }">
					
					<div class="col-md-4">
						<a href="#">
							<div class="thumbnail homegoods">
								<div class="he-wrap tpl1">

									<img alt="暂无图片"
										src="${pageContext.request.contextPath}${g.goods_pic}1.jpg" />

									<div class="he-view">

										<div class="sider-right a0" data-animate="fadeInRight">

											<a href="#" class="a1 zoom" data-animate="fadeInRight"></a><a
												href="#" class="a2 undo" data-animate="fadeInRight"></a><a
												href="#" class="a3 check" data-animate="fadeInRight"> </a><a
												href="#" class="a4 close" data-animate="fadeInRight"></a>

										</div>

									</div>

								</div>
								<div class="caption caption-style">
								<p class="font-red">￥ ${g.goods_sale_price }</p>
									<a href="goods_detail.action?goods_id=${g.goods_id}">
									<p>${g.goods_name}</p>
									</a>
								</div>
							</div>
						</a>
					</div>
					</c:if>
				</c:forEach>
				</div>
			</div>
		</div>
	</div>
</div>


<div class="row-fluid">
	<div class="span12">
		<div class="page-header">
			<h3
				style="text-align: center; font-size: 16px; color: #333; font-weight: 500">
				<em>·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp爱美鞋&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp·&nbsp</em>
			</h3>
		</div>
	</div>
</div>

<div class="row">
	<div class="col-md-6">
		<div class="panel panel-default">
			<div class="panel-heading "
				style="background: linear-gradient(90deg, #5e6c90, #4c5e8c)">

				<h3 class="panel-title">男神鞋柜</h3>
			</div>
			<div class="panel-body">

				<div class="row">
					<c:forEach items="${homemanshoes }" var="g" varStatus="gvs">
					<c:if test="${gvs.count<=3 }">
					
					<div class="col-md-4">
						<a href="#">
							<div class="thumbnail homegoods">
								<div class="he-wrap tpl1">

									<img alt="暂无图片"
										src="${pageContext.request.contextPath}${g.goods_pic}1.jpg" />

									<div class="he-view">

										<div class="sider-right a0" data-animate="fadeInRight">

											<a href="#" class="a1 zoom" data-animate="fadeInRight"></a><a
												href="#" class="a2 undo" data-animate="fadeInRight"></a><a
												href="#" class="a3 check" data-animate="fadeInRight"> </a><a
												href="#" class="a4 close" data-animate="fadeInRight"></a>

										</div>

									</div>

								</div>
								<div class="caption caption-style">
								<p class="font-red">￥ ${g.goods_sale_price }</p>
									<a href="goods_detail.action?goods_id=${g.goods_id}">
									<p>${g.goods_name}</p>
									</a>
								</div>
							</div>
						</a>
					</div>
					</c:if>
				</c:forEach>
				</div>
			</div>
		</div>
	</div>

	<div class="col-md-6">
		<div class="panel panel-default">
			<div class="panel-heading "
				style="background: linear-gradient(90deg, #488bad, #337e8d);">

				<h3 class="panel-title">女神鞋柜</h3>
			</div>
			<div class="panel-body">

				<div class="row">
					<c:forEach items="${homewomanshoes }" var="g" varStatus="gvs">
					<c:if test="${gvs.count<=3 }">
					
					<div class="col-md-4">
						<a href="#">
							<div class="thumbnail homegoods">
								<div class="he-wrap tpl1">

									<img alt="暂无图片"
										src="${pageContext.request.contextPath}${g.goods_pic}1.jpg" />

									<div class="he-view">

										<div class="sider-right a0" data-animate="fadeInRight">

											<a href="#" class="a1 zoom" data-animate="fadeInRight"></a><a
												href="#" class="a2 undo" data-animate="fadeInRight"></a><a
												href="#" class="a3 check" data-animate="fadeInRight"> </a><a
												href="#" class="a4 close" data-animate="fadeInRight"></a>

										</div>

									</div>

								</div>
								<div class="caption caption-style">
								<p class="font-red">￥ ${g.goods_sale_price }</p>
									<a href="goods_detail.action?goods_id=${g.goods_id}">
									<p>${g.goods_name}</p>
									</a>
								</div>
							</div>
						</a>
					</div>
					</c:if>
				</c:forEach>
				</div>
			</div>
		</div>
	</div>
</div>


<!-- col-12 end -->
</div>


<!-- row end -->
</div>



<%@include file="footer.jsp"%>