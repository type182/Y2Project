<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>
		<%-- <a href="${searuser.user }">
			点击跳转你的邮箱
		</a> --%>
		<br/>
		<p>用户名:${searuser.username}</p>
		<p>密　码:${searuser.userPwd }</p>
		<p>注册类型${searuser.type }</p>
	</h3>
</body>
</html>