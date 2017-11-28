<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Open+Sans+Condensed:300" />
        <%-- <link rel="stylesheet" href="${pageContext.request.contextPath}/clock/assets/css/styles.css" /> --%>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/clock/assets/countdown/jquery.countdown.css" />
</head>
<body>
	<div id="countdown"></div>

		<p id="note"></p>

		<script src="http://www.jq22.com/jquery/jquery-1.7.1.js"></script>
		<script src="${pageContext.request.contextPath}/clock/assets/countdown/jquery.countdown.js"></script>
		<script src="${pageContext.request.contextPath}/clock/assets/js/script.js"></script>
		
</body>
</html>