<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>图书列表</title>
</head>
<body>
    <h2>图书列表</h2>
 
    <table border="1">
        <tr>
            <th>书号</th>
            <th>书名</th>
            <th>作者</th>
            <th>价格</th>
        </tr>
        <c:forEach items="${books}" var="book">
            <tr>
                <td>${book.isbn}</td>
                <td>${book.name}</td>
                <td>${book.author}</td>
                <td>${book.price}</td>
                <td><a href="${pageContext.request.contextPath}/bookUpdateView2.do?isbn=${book.isbn}">修改图书</a></td>
            </tr>
        </c:forEach>
    </table>
    <c:if test="${not empty info}">
		${info}
	</c:if>
</body>
</html>