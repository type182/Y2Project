<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>首页</title>
</head>
<body>
<style>
	li{
		display: inline-block;
	}
</style>
<ul>
	<li>用户名: ${user.user_name}</li>
	<li>用户密码: ${user.user_pwd}</li>
	<li>用户手机号: ${user.user_phone}</li>
	<li>用户邮箱: ${user.user_email}</li>
	<li>
		用户头像: <img width="50" height="50" alt="" src="http://www.mai.com/resource${user.user_head}">
	
	</li>
	<li>用户剩余金币: ${user.user_integral}</li>
	
</ul>




</body>
</html>