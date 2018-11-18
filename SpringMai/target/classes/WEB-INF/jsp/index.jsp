<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<style>
	li{
		display: inline-block;
	}
</style>
${s}
<c:forEach items="${s}" var="d">
	<ul>
		<li>${d.name }</li>
		<li>${d.id }</li>
		<li>${d.sex }</li>
	</ul>
</c:forEach>
</body>
</html>