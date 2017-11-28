<%@include file="../header.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script type="text/javascript">
 $(document).ready(function(){
	/* var wd = $(".nav-pills").width();
	jQuery(window).scroll(function() {
		$("#left_cate").css("width", wd);
	}); */

	$("#left_cate").affix({
	    offset: {
	        top: 125,
	        bottom: function () {
	            return (this.bottom = $('.bottom').outerHeight(true));
	        }
	
	 	}
	});
});
</script>


<div class="row"  style="border:0px solid red">
  <div class="col-md-2"> 
      <div class="row">
      
	   	<ul  class="list-group"  id="left_cate">
				      <a href="goods_list.action?listType=3" class="list-group-item">靴鞋</a>
				      <a href="goods_list.action?listType=1" class="list-group-item">男装</a>
				      <a href="goods_list.action?listType=2" class="list-group-item">女装</a>
				      <a href="goods_list.action?listType=4" class="list-group-item">食品</a>
	   	</ul>  
	  </div> 	
  </div>
  <div class="col-md-10"> 
    <div class="row">
	<c:forEach items="${sortShoes }" var="g" varStatus="gvs">
		<div class="col-md-4">
			<div class="thumbnail">
				
				<a href="goods_detail.action?goods_id=${g.goods_id}">
				<img alt="商品名称" src="${pageContext.request.contextPath}${g.goods_pic}1.jpg" /></a>
				<div class="caption text-center">
					<label>
						商品名称:${g.goods_name }
					</label>
					<p>
						原价<span class="glyphicon glyphicon-yen" aria-hidden="true"></span>${g.goods_price }
						<span class="glyphicon glyphicon-hand-right" aria-hidden="true"></span>
					</p>
					<p>
						现售<span class="label label-pill label-info"><span class="glyphicon glyphicon-yen" aria-hidden="true"></span>${g.goods_sale_price }</span>
					</p>
					<p>
						共售出3000件
					</p>
					<p>
						<a class="btn btn-primary" href="goods_detail.action?goods_id=${g.goods_id}" >查看详情</a>

					</p>
				</div>
			</div>
		</div>
	</c:forEach>
		
	
	    

    </div>
  
  </div>
</div>


<%@include  file="../footer.jsp"%>	