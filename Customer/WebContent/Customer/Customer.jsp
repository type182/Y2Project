<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<style>
		html,body{
			width: 100%;
			height: 100%;
		}
		*{
			margin: 0;
			padding: 0;
		}
		li{
			list-style: none;
		}
		#ssslis>li{
		 	list-style: none;
		 	margin-bottom:1.5px;
		 	height: 50px;
		 	position: relative;
		 	background-color: #f5eded;
		 	cursor: pointer;
		}
		#ssslis>li *{
			position: relative;
		}
		#ssslis li div{
			display: inline-block;
			
		}
		#ssslis li img{
			width: 50px;
			height: 50px;
			border-radius: 90px;
		}
		.content{
			font-size: 15px;
			color: #a7a4a4;
			top:-2px;
		}
		.uname{
			top:-7px;
			font-size:20px;
			 
		}
		.title{
			right: 10px;
			border-radius: 90px;
			background-color: red;
			width: 20px;
			height: 20px;
			text-align: center;
			color: #FFF;
			top: 12px;
		}
		#centonst{
			position:absolute;
			width: 100%;
			height: 100%;
			top:0;
			z-index: 9999;
			background: #FFF;
		}
		#Count ul{
			top: -18px;
		}
	</style>
	<div style="width: 100%;height: 50px; color:#FFF; background-color: #303030;">
		<div style="float: left;">
			<img  src="${Items.title}" style="height: 50px;width: 50px;border: 1px solid #FFF;">
		</div>
		<div style="float: left;margin-top: 17px;">
			　　　　　${Items.name }/<%=request.getAttribute("name") %>
		</div>
	</div>
	
	<div style="width: 100%;height: auto;">
		<ul id="ssslis" style="margin-top:3px;border: 1px solid #303030;">
			
		</ul>
		<div id="centonst" style="display: none;">
			<div  style="height:7%;background: #00f9;color: #FFF; font-size: 22px; text-align: center;">
				<span onclick="document.getElementById('centonst').style.display='none'" style="cursor:pointer; float: left;"><</span><sp id="uname">哈哈哈</sp>
			</div>
			<style>
				.coutn{
					margin-top: 20px;
				}
				.hu{
					text-align: left;
					
				}
				.you{
					text-align: right;
				}
				.hu span{
					padding: 10px 20px;
					color: #303030;
					background-color: #e3e3e3;
					
				}
				.you span{
					padding: 10px 20px;
					color: #FFF;
					background-color: #00f9;
				}
			</style>
			<div style="height:80%;">
				<ul class="coutn" style="margin-top: 20px;">
				</ul>
			</div>
			<div style="height:7%; background: #e3e3e3">
				<input type="text" style=" border-radius: 5px; border: 1px solid #303030;  width: 70%;margin-left: 5%; height: 80%;margin-top: 2%;" id="value"><button id="fasong" style="background-color:#00f9;color: #FFF; border: none; width: 20%;height: 80%">发送</button>
			</div>
		</div>
	</div>
	<script type="text/javascript" src="http://www.17sucai.com/static/js/jquery.min.js"></script>
	<script type="text/javascript">
		var data={"0001":"<li class='hu'> <span>你好</span></li><li class='you'><span>你好</span></li>"};
	
	
		$("#ssslis li").click(function(){
			var c = $(this).children("div");
			console.log(c);
			$("#centonst").show();
			$("#uname").text(c.text());
			$(".coutn").html("");
			$(".coutn").append(data[c.children("ul").children("li").attr("usdkid")]);
			
			$(this).children(".title").hide();
		})
		var socket = new Socket("ws://127.0.0.1:8080/Customer/Customer")
		socker.onopen = function(){
			socket.send('${Items.sdk}');
			
		}
		
		function clic(data){
			var s='<li><div><img src="'+data.image+'"></div><div id="Count"><ul><li class="nameddd" usdkid="'+data.uid+'">'+data.name+'</li></ul></div><span class="title" style="position: absolute;"></span></li>'
			$("#ssslis").append(s);
		}
	</script>
	
</body>
</html>