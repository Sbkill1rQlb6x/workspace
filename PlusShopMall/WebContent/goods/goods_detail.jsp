
<%@include file="/header.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import="java.util.Map"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/goods_buy/css/shouye.css">
	<script
	src="${pageContext.request.contextPath}/goods_buy/js/modernizr-custom-v2.7.1.min.js"
	type="text/javascript"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath}/plugs/zoom/css/ShopShow.css" type="text/css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/plugs/zoom/css/MagicZoom.css" type="text/css" />
<script src="${pageContext.request.contextPath}/plugs/zoom/js/MagicZoom.js" type="text/javascript"></script>
</head>
<body>

	<%
		Map<String,String> goods=(Map<String,String>)request.getAttribute("gd");
		if(goods!=null){
	%>
	<ul class="breadcrumb">
		<li>
			 <a href="index.action">首页</a>
		</li>
		<li>
			 <a href="#"><%=goods.get("goods_type_dis") %></a>
		</li>
		<li class="active">
		<%=goods.get("goods_name") %>
		</li>
	</ul>

	<div class="row">
		<div class="col-md-4">
				
				<!-- 代码开始 -->
				<div id="tsShopContainer">
					<div id="tsImgS"><a href="${pageContext.request.contextPath}<%=goods.get("goods_pic") %>1.jpg" title="Images" class="MagicZoom" id="MagicZoom"><img src="${pageContext.request.contextPath}<%=goods.get("goods_pic") %>1.jpg" /></a></div> 
					<div id="tsPicContainer">
						<div id="tsImgSArrL" onclick="tsScrollArrLeft()"></div>
						<div id="tsImgSCon">
							<ul>								   
								    <li onclick="showPic(0)" rel="MagicZoom"><img height="42" width="42" src="${pageContext.request.contextPath}<%=goods.get("goods_pic") %>1.jpg" tsImgS="${pageContext.request.contextPath}<%=goods.get("goods_pic") %>1.jpg" /></li>
									<li onclick="showPic(0)" rel="MagicZoom"><img height="42" width="42" src="${pageContext.request.contextPath}<%=goods.get("goods_pic") %>2.jpg" tsImgS="${pageContext.request.contextPath}<%=goods.get("goods_pic") %>2.jpg" /></li>
									<li onclick="showPic(0)" rel="MagicZoom"><img height="42" width="42" src="${pageContext.request.contextPath}<%=goods.get("goods_pic") %>3.jpg" tsImgS="${pageContext.request.contextPath}<%=goods.get("goods_pic") %>3.jpg" /></li>
									

							</ul>
						</div>
						<div id="tsImgSArrR" onclick="tsScrollArrRight()"></div>
					</div>
					<img class="MagicZoomLoading" width="16" height="16" src="${pageContext.request.contextPath}/plugs/zoom/images/loading.gif" alt="Loading..." />
				</div>
				<!-- 引入放大镜效果脚本 -->
				<script src="${pageContext.request.contextPath}/plugs/zoom/js/ShopShow.js"></script>
				<!-- 代码结束 -->				
				
		</div>
		<div class="col-md-6">
	<script>
		$(document).ready(function(){
	var $miaobian=$('.Xcontent08>div');
	var $huantu=$('.Xcontent06>img');
	var $miaobian1=$('.Xcontent26>div');
	$miaobian.mousemove(function(){miaobian(this);});
	$miaobian1.click(function(){miaobian1(this);});
	function miaobian(thisMb){
		for(var i=0; i<$miaobian.length; i++){
			$miaobian[i].style.borderColor = '#dedede';
		}
		thisMb.style.borderColor = '#cd2426';

		$huantu[0].src = thisMb.children[0].src;
	}
	function miaobian1(thisMb1){
		for(var i=0; i<$miaobian1.length; i++){
			$miaobian1[i].style.borderColor = '#dedede';
		}
//		thisMb.style.borderColor = '#cd2426';
		$miaobian.css('border-color','#dedede');
		thisMb1.style.borderColor = '#cd2426';
	}
			$(".Xcontent33").click(function(){
			var value=parseInt($('.input').val())+1;
       		$('.input').val(value);
		})

		$(".Xcontent32").click(function(){	
			var num = $(".input").val()
			if(num>0){
				$(".input").val(num-1);
			}			
			
		})

		})
	
	</script>
	
	
	<div class="Xcontent">
		<ul class="Xcontent01">
				<ol class="Xcontent13">
					<div class="Xcontent14"><a href="#"><p style="line-height:normal"><%=goods.get("goods_name") %></p></a></div>
					<div class="Xcontent16">
					<p>
						<%
							String dis=goods.get("goods_dis");
							if(dis==null)
							{
								out.print("");
							}
							else{
								out.print(dis);
							}
						%>
					</p>
					
					</div>
					
					<div class="Xcontent17">
					<p class="Xcontent24">原价</p>
					<p class="Xcontent25">￥<span style="text-decoration:line-through;"><%=goods.get("goods_price") %></span></p>
						<p class="Xcontent18">现价</p>
						<p class="Xcontent19">￥<span><%=goods.get("goods_sale_price") %></span></p>
						
						<div class="Xcontent20">
							<p class="Xcontent21">促销</p>
							<img src="${pageContext.request.contextPath}/goods_buy/images/shangpinxiangqing/X12.png">
							<p class="Xcontent22">领610元新年礼券，满再赠好礼</p>
						</div>
						<div class="Xcontent23">
							<p class="Xcontent24">服务</p>
							<p class="Xcontent25">30天无忧退货&nbsp;&nbsp;&nbsp;&nbsp;       48小时快速退款 &nbsp;&nbsp;&nbsp;&nbsp;        满88元免邮</p>
						</div>
						
					</div>
					<div class="Xcontent26">
						<p class="Xcontent27">
						<%
						String type=goods.get("goods_type");
							if(type.equals("4"))
							{
								out.print("规格");
							}
							else{
								out.print("尺码");
							}
						%>
						</p>
						<div class="Xcontent28"><img  src="${pageContext.request.contextPath}<%=goods.get("goods_pic")%>1.jpg"></div>
							<div class="Xcontent29"><img  src="${pageContext.request.contextPath}<%=goods.get("goods_pic")%>2.jpg"></div>
					</div>
					<div class="Xcontent30">
						<p class="Xcontent31">数量</p>
						<div class="Xcontent32"><img src="${pageContext.request.contextPath}/goods_buy/images/shangpinxiangqing/X15.png"></div>
						<form>	
            <input class="input" value="1"></form>
						<div class="Xcontent33"><img src="${pageContext.request.contextPath}/goods_buy/images/shangpinxiangqing/16.png"></div>

					</div>
					<div class="Xcontent34"><a href="#"><img src="${pageContext.request.contextPath}/goods_buy/images/shangpinxiangqing/X17.png"></a></div>
					<div class="Xcontent35"><a href="joinShopCar.action?goodsId=<%=goods.get("goods_id")%>"><img src="${pageContext.request.contextPath}/goods_buy/images/shangpinxiangqing/X18.png"></a></div>
				
			</ol>
		
			
			
		</ul>
		
	</div>
		     
		</div>	
				
				<div class="col-md-2" id="ss">
				<ul class="list-unstyled">
				<li>
					<a href="#">商品参数</a>
				</li>
				<li>
					<a href="#">商品展示</a>
				</li>
				<li>
					<a href="#">品质保证</a>
				</li>
				<li>
					<a href="#">服务质量</a>
				</li>
				
			</ul>
				</div>
 
			</div>
			
			<div class="row clearfix">
		<div class="col-md-12 column">

			<div class="panel panel-success">
				<div class="panel-heading">
					<h3 class="panel-title">商品详情</h3>
				</div>
				<div class="panel-body">
			<dl class="dl-horizontal">
				<dt>产地</dt>
				<dd><%=goods.get("goods_origin") %></dd>
				<dt>
					<%
					if(type.equals("4"))
							{
								out.print("保质期");
							}
					else{
						out.print("上市日期");
					}
					%>
				</dt>
				<dd><%=goods.get("goods_date") %></dd>
				<dt>品牌</dt>
				<dd><%=goods.get("goods_brand") %></dd>
				<dt>产品制作材料</dt>
				<dd><%=goods.get("goods_material") %></dd>
				<dt>
					<%
					if(type.equals("4"))
							{
						
							}
					else{
						out.print("薄厚");
					}
					%>
				</dt>
				<dd>
					<%
					String thickness=goods.get("goods_thickness");
					if(thickness==null)
					{
						out.print("");
					}
					else{
						out.print(thickness);
					}
					%>
				</dd>
			</dl>		
			<br>		
			<br>	
			<br>	
            <hr>
			<div style="margin-top:20px" class="text-center">

			      <c:forEach begin="1" end="3" var="c" varStatus="vs">
			      <div>
				  <img alt="<%=goods.get("goods_name") %>" src="${pageContext.request.contextPath}<%=goods.get("goods_pic")%>${c}.jpg" />
			      </div>
			      </c:forEach>
			      
			</div>
					
				</div>
			</div>
		</div>
	</div>		
	
	
	
	
	
	
	
	
	
	
	
	
	
	<%} %>					
</body>
</html>
<%@include file="/footer.jsp" %>