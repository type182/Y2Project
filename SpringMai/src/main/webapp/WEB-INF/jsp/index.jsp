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
<ul>
	<li>${user.user_name}</li>
	<li>${user.user_pwd}</li>
	<li>${user.user_phone}</li>
	<li>${user.user_email}</li>
	<li>
		<img alt="" src="http://www.mai.com/resource${user.user_head}">
	
	</li>
	<li>${user.user_integral}</li>

</ul>




</body>
</html>