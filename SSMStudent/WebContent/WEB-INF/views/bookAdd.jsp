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
<form method="post" action="${pageContext.request.contextPath}/bookAdd.do"
enctype="multipart/form-data">
	isbn：<input type="text" name="isbn"><br>
	书名：<input type="text" name="name"><br>
	作者：<input type="text" name="author"><br>
	价格：<input type="text" name="price" /><br>
	<input type="submit" value="提交">
	<input type="reset" value="重写">
	<c:if test="${not empty info}">
		${info}
	</c:if>
</form>
	<a href="${pageContext.request.contextPath}/bookList.do">图书列表</a>
</body>
</html>