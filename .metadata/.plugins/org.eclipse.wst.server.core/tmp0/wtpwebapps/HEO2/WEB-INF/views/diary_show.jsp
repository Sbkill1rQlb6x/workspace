<%@include file="/WEB-INF/views/header.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div class="category2top">
	<div class="am-g am-container userinfo">
		<div class="am-u-sm-12 am-u-md-12 am-u-lg-5 userinfo_left">
			<div class="am-g">
				<div class="am-u-md-12 am-u-lg-6 userface">
					<img src="images/face2.jpg">
				</div>
				<div class="am-u-md-12 am-u-lg-6 userin">
					<h3>山边小溪</h3>
					<h4>AmazeUI</h4>
					<p>
						文章<span>9</span>
					</p>
					<button type="button" class="am-btn am-btn-warning am-hide-lg-only"
						style="margin: 0 auto; margin-top: 30px">
						<i class="am-icon-plus"></i> 订阅
					</button>
				</div>
			</div>

		</div>
		<div
			class="am-u-sm-0 am-u-md-12 am-u-lg-4 am-show-lg-only userinfo_center">
			削减是一个从源代码中删除不必要的字符的技术使它看起来简单而整洁。这种技术也被称为代码压缩和最小化。</div>
		<div
			class="am-u-sm-12 am-u-md-12 am-u-lg-3 am-show-lg-only userinfo_right">
			<button type="button" class="am-btn am-btn-warning">
				<i class="am-icon-plus"></i> 订阅
			</button>
		</div>

	</div>
</div>

<div class="am-g">
	<div class="am-u-sm-0 am-u-md-2 am-u-lg-3">&nbsp;</div>
	<div class="am-u-sm-12 am-u-md-8 am-u-lg-6">
		<div data-am-widget="list_news"
			class="am-list-news am-list-news-default ">
			<div class="am-list-news-bd">
				<ul class="am-list">
					<c:forEach begin="1" end="10">
						<li
							class="am-g am-list-item-desced am-list-item-thumbed am-list-item-thumb-left"
							style="border-top: 0px">
							<div class="am-u-sm-5 am-list-thumb">
								<a href="http://www.douban.com/online/11624755/"> <img
									src="images/bb2.jpg" alt="文章标题" />
								</a>
							</div>

							<div class=" am-u-sm-7 am-list-main">
								<h3 class="am-list-item-hd">
									<a href="">标题</a>
								</h3>

								<div class="am-list-item-text">文章内容</div>

							</div>
						</li>
						<div class="newsico am-fr">
							<i class="am-icon-clock-o">2017/10/21</i> <i
								class="am-icon-hand-pointer-o">12322</i>
						</div>
					</c:forEach>


				</ul>
				<ul data-am-widget="pagination"
					class="am-pagination am-pagination-default"
					style="text-align: center">

					<li class="am-pagination-first "><a href="#" class="">第一页</a>
					</li>

					<li class="am-pagination-prev "><a href="#" class="">上一页</a></li>


					<li class=""><a href="#" class="">1</a></li>
					<li><a href="#">2</a></li>
					<li class=""><a href="#" class="">3</a></li>
					<li class=""><a href="#" class="">4</a></li>
					<li class=""><a href="#" class="">5</a></li>
					<li class=""><a href="#" class="">6</a></li>
					<li class=""><a href="#" class="">7</a></li>
					<li class=""><a href="#" class="">8</a></li>
					<li class=""><a href="#">9</a></li>
					<li class=""><a href="#" class="">10</a></li>
					<li class=""><a href="#" class="">11</a></li>
					<li class=""><a href="#" class="">12</a></li>
					<li class=""><a href="#" class="">13</a></li>
					<li class=""><a href="#" class="">14</a></li>
					<li class=""><a href="#" class="">15</a></li>
					<li class=""><a href="#" class="">16</a></li>


					<li class="am-pagination-next "><a href="#" class="">下一页</a></li>

					<li class="am-pagination-last "><a href="#" class="">最末页</a></li>
				</ul>
			</div>
		</div>
	</div>
	<div class="am-u-sm-0 am-u-md-2 am-u-lg-3">&nbsp;</div>
</div>


<%@include file="/WEB-INF/views/footer.jsp"%>