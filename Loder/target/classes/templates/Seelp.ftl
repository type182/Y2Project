<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<style>
		div{
			margin:auto;
			color:#303030;
			width:500px;
			height:320px;
		}
		a{color:#303030;text-decoration: none;}
		
		p{
			position: relative;
		}
		
	</style>
	<div>
		<p>　　　　　　欢迎${UserName}使用MaiMai网，恭喜你邮箱注册成功  距离购物你只差一步了。。</p>
		<p>　　　点击下面的超链接既可完成认证</p>
		<p>我们在来重复一下条款</p>
		<p>　　　1.合法买卖</p>
		<p>　　　1.合法买卖</p>
		<p>　　　1.合法买卖</p>
		<p style="text-align: center;">
			<a href="${url}" emli = "${UserEmli}">
				这就去${UserEmli}邮箱认证
			</a>
		</p>
	</div>
</body>
</html>