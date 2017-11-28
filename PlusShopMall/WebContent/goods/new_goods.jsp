<%@include file="../header.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

			<div class="row">

			<c:forEach	items="${new_goods }" var="g" varStatus="gvs">
				<div class="col-md-3">
					<div class="thumbnail">
						<a href="goods_detail.action?goods_id=${g.goods_id}">
				        <img alt="商品名称" src="${pageContext.request.contextPath}${g.goods_pic}1.jpg" /></a>
						<div class="caption text-center">
							<label>
								商品名称：${g.goods_name}
							</label>
							<p>
								原价<span class="glyphicon glyphicon-yen" aria-hidden="true"></span>${g.goods_price}
								<span class="glyphicon glyphicon-hand-right" aria-hidden="true"></span>
							</p>
							<p>
								现售<span class="label label-pill label-info"><span class="glyphicon glyphicon-yen" aria-hidden="true"></span>${g.goods_sale_price}</span>
							</p>
							<p>
								共售出3000件
							</p>
						</div>
					</div>
				</div>
				</c:forEach>
	
			</div>
			
    
<%@include  file="../footer.jsp"%>		   