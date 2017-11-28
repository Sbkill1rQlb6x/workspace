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
    <h2>学生列表</h2>
 
    <table border="1">
        <tr>
            <th>学号</th>
            <th>姓名</th>
            <th>年龄</th>
            <th>修改</th>
        </tr>
        <c:forEach items="${students}" var="student">
            <tr>
                <td>${student.id}</td>
                <td>${student.name}</td>
                <td>${student.age}</td>
                <td><a href="${pageContext.request.contextPath}/studentUpdateView.do?id=${student.id}">修改</a>
                <a href="${pageContext.request.contextPath}/studentDelete.do?id=${student.id}">删除</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>