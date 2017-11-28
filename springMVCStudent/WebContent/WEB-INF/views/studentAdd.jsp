<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>添加学生</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/studentAdd.do">
	学号：<input type="text" name="id"><br>
	姓名：<input type="text" name="name"><br>
	年龄：<input type="text" name="age"><br>
	<input type="submit" value="提交">
	<input type="reset" value="重写">
	<c:if test="${not empty info}">
		${info}
	</c:if>
</form>
</body>
</html>