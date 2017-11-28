<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
	<jsp:include page="/header.jsp">
		<jsp:param value="结果页面" name="title"/>
	</jsp:include>
	<script type="text/JavaScript" language="javascript">
	alert("${requestScope.msg}");
	window.document.location.href="${pageContext.request.contextPath}/login/${requestScope.href}";
</script>
</head>
</html>