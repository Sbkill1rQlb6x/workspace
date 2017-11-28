<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="jumbotron" id="ad">
		<div class="container">
			<img src="${pageContext.request.contextPath}/images/adver/ad6.jpg"
				class="img-responsive" alt="Responsive image" id="adimg">
		</div>
	</div>

	<script type="text/javascript">
	 	setTimeout(function() {
			document.getElementById("ad").style.display = "none";
		}, 2000);
	</script>
</body>
</html>