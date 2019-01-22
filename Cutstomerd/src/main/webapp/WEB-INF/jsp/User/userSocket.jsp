<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="UTF-8">
<title></title>


<link rel="stylesheet" type="text/css" href="http://www.17sucai.com/preview/1/2017-10-11/talk/css/qq.css">
<style>
	.liLeft img{
		width: 76%;
		height: 69%;
		margin-top: 1px;
	}
	.conLeft ul li{
		border-bottom: 1px solid #e3e3e3;
	}
	.answerHead{
		background-color: blue;
	}
	.Expr{
		height: 100%;
		display: inline-block;
	}
	.news{
		display: inline-block;
		margin: 0px;
		padding: 0;
		min-width: 40px;
		text-align: center;
		margin-left: 10px;
	}
</style>
</head>
<body>

<div class="qqBox">
    <div class="BoxHead">
        <div class="headImg">
            <img src="${user.user_head}">
        </div>
        <div class="internetName">${user.user_name }</div>
    </div>
    <div class="context">
        <div class="conLeft">
            <ul>
                <!-- <li>
                    <div class="liLeft"><img src="img/20170926103645_04.jpg"></div>
                    <div class="liRight">
                        <span class="intername">前端交流群</span>
                        <span class="infor">厉害了</span>
                    </div>
                </li> -->
            </ul>
        </div>
        <div class="conRight">
            <div class="Righthead">
                <div class="headName">(无人)</div>

            </div>
            <div class="RightCont">
                <ul class="newsList">

                </ul>
            </div>
            <div class="RightFoot">
                <div class="emjon">
                    <ul>
                        <li><img src="http://www.17sucai.com/preview/1/2017-10-11/talk/img/em_02.jpg"></li>
                        <li><img src="http://www.17sucai.com/preview/1/2017-10-11/talk/img/em_05.jpg"></li>
                        <li><img src="http://www.17sucai.com/preview/1/2017-10-11/talk/img/em_07.jpg"></li>
                        <li><img src="http://www.17sucai.com/preview/1/2017-10-11/talk/img/em_12.jpg"></li>
                        <li><img src="http://www.17sucai.com/preview/1/2017-10-11/talk/img/em_14.jpg"></li>
                        <li><img src="http://www.17sucai.com/preview/1/2017-10-11/talk/img/em_16.jpg"></li>
                        <li><img src="http://www.17sucai.com/preview/1/2017-10-11/talk/img/em_20.jpg"></li>
                        <li><img src="http://www.17sucai.com/preview/1/2017-10-11/talk/img/em_23.jpg"></li>
                        <li><img src="http://www.17sucai.com/preview/1/2017-10-11/talk/img/em_25.jpg"></li>
                        <li><img src="http://www.17sucai.com/preview/1/2017-10-11/talk/img/em_30.jpg"></li>
                        <li><img src="http://www.17sucai.com/preview/1/2017-10-11/talk/img/em_31.jpg"></li>
                        <li><img src="http://www.17sucai.com/preview/1/2017-10-11/talk/img/em_33.jpg"></li>
                        <li><img src="http://www.17sucai.com/preview/1/2017-10-11/talk/img/em_37.jpg"></li>
                        <li><img src="http://www.17sucai.com/preview/1/2017-10-11/talk/img/em_38.jpg"></li>
                        <li><img src="http://www.17sucai.com/preview/1/2017-10-11/talk/img/em_40.jpg"></li>
                        <li><img src="http://www.17sucai.com/preview/1/2017-10-11/talk/img/em_45.jpg"></li>
                        <li><img src="http://www.17sucai.com/preview/1/2017-10-11/talk/img/em_47.jpg"></li>
                        <li><img src="http://www.17sucai.com/preview/1/2017-10-11/talk/img/em_48.jpg"></li>
                        <li><img src="http://www.17sucai.com/preview/1/2017-10-11/talk/img/em_52.jpg"></li>
                        <li><img src="http://www.17sucai.com/preview/1/2017-10-11/talk/img/em_54.jpg"></li>
                        <li><img src="http://www.17sucai.com/preview/1/2017-10-11/talk/img/em_55.jpg"></li>
                    </ul>
                </div>
                <div class="footTop">
                    <ul>
                        <li><img src="http://www.17sucai.com/preview/1/2017-10-11/talk/img/20170926103645_31.jpg"></li>
                        <li class="ExP"><img src="http://www.17sucai.com/preview/1/2017-10-11/talk/img/20170926103645_33.jpg"></li>
                    </ul>
                </div>
                <div class="inputBox">
                    <textarea id="dope" style="width: 99%;height: 75px; border: none;outline: none;" name="" rows="" cols=""></textarea>
                    <button class="sendBtn">发送(s)</button>
                </div>
            </div>
        </div>
    </div>
</div>

<script type="text/javascript" src="http://www.17sucai.com/preview/1/2017-10-11/talk/js/jquery.min.js"></script>
<script type="text/javascript">
var source = new Object();
$('.conLeft ul').on('click','li',function(){
	if($('.newsList').attr("sdk")!=$(this).attr("sdk")){
	    $(this).addClass('bg').siblings().removeClass('bg');
	    var intername=$(this).children('.liRight').children('.intername').text();
	    var image = $(this).children(".liLeft").children('img').attr("src");
	    $('.headName').text(intername);
	    $('.newsList').html('');
	    $('.newsList').attr('sdk',$(this).attr("sdk"));
	    $(".newsList").attr("clickimg",image);
	    appendText();
	}
})
//填充方法
function appendText(){
	for(var i in source){
    	for(var j = 0;j<source[i].length;j++){
    		if(source[i][j]['type']==1){
        		
        		answers(source[i][j]);
    		}else{
    			left(source[i][j]);
    		}
    	}
    	
    }
	
}
//当发送按钮点击的时候
$('.sendBtn').on('click',function(){
    var news=$('#dope').val();
    if(news=='' || $('.newsList').attr("sdk")==undefined){
        alert('不能为空  也可能是你当前没有选择要发送的客服');
    }else{
        $('#dope').val('');
    var str='';
    str+='<li class="regin">'+
            '<div class="answerHead"><img src="${user.user_head }"/></div>'+
            '<div class="answers"><img class="jiao" src="http://www.17sucai.com/preview/1/2017-10-11/talk/img/20170926103645_03_02.jpg">'+news+'</div>'+
        '</li>';
    $('.newsList').append(str);
    $('.conLeft').find('li.bg').children('.liRight').children('.infor').text(news);
    $('.RightCont').scrollTop($('.RightCont')[0].scrollHeight );
    JSONSend($('.newsList').attr("sdk"),'${user.id}',news);
    }

})




//当客户端来到消息时触发事件
function answers(datas){
    var answer='';
    answer+='<li>'+
                '<div class="nesHead"><img src="'+$(".newsList").attr("clickimg")+'"/></div>'+
                '<div class="news"><img class="jiao" src="http://www.17sucai.com/preview/1/2017-10-11/talk/img/jiao.jpg">'+
                ((datas.message.indexOf(".jpg")!=-1)?'<img class="news" src="'+datas.message+'">':datas.message)
                +'</div>'+
            '</li>';
    $('.newsList').append(answer);
    $('.RightCont').scrollTop($('.RightCont')[0].scrollHeight );
	
}

function left(datas){
    var answer='';
    answer+='<li>'+
                '<div class="answerHead"><img src="${user.user_head}"/></div>'+
                '<div class="answers"><img class="jiao" src="http://www.17sucai.com/preview/1/2017-10-11/talk/img/jiao.jpg">'+
                ((datas.message.indexOf(".jpg")!=-1)?'<img class="Expr" src="'+datas.message+'">':datas.message)
                +'</div>'+
            '</li>';
    $('.newsList').append(answer);
    $('.RightCont').scrollTop($('.RightCont')[0].scrollHeight,0);
	
}

$('.ExP').on('mouseenter',function(){
    $('.emjon').show();
})
$('.emjon').on('mouseleave',function(){
    $('.emjon').hide();
})





//当图片点击的时候
$('.emjon li').on('click',function(){
    var imgSrc=$(this).children('img').attr('src');
    var str="";
    str+='<li class="regin">'+
            '<div class="answerHead"><img src="${user.user_head }"/></div>'+
            '<div class="answers"><img class="jiao" src="http://www.17sucai.com/preview/1/2017-10-11/talk/img/20170926103645_03_02.jpg"><img class="Expr" src="'+imgSrc+'"></div>'+
        '</li>';
    $('.newsList').append(str);
    $('.emjon').hide();
    $('.RightCont').scrollTop($('.RightCont')[0].scrollHeight );
    JSONSend($('.newsList').attr("sdk"),'${user.id}',imgSrc,0);
})


function JSONSend(sdk,usdk,message,type){
	var soc = {"sdk":sdk,"usdk":usdk,"message":message,"type":type};
	socket.send('{"sdk":"'+sdk+'","usdk":"'+usdk+'","message":"'+message+'"}');
	if(message!="" && message!=null){
		if(source[""+soc.usdk]==null){
			var s = [soc];
			source[""+soc.usdk]=s;
			
		}else{
			source[""+soc.usdk].push(soc);
		}
		
	}
}
var socket = new WebSocket("ws://192.168.151.121:8080/Cli")



socket.onopen=function(){
	
	JSONSend("",'${user.id}',"");
}




//当添加客服到选择卡
function AppendList(datas){
	//Data = 用户的id
	$.get("/JSON/CustomerGetid",{"sdk":datas.sdk},function(data){
		var li =  '<li id="'+datas.sdk.substring(0,3)+'" sdk="'+datas.sdk+'">'+
	        '<div class="liLeft" ><img src="'+data.title+'"></div>'+
	        '<div class="liRight">'+
	            '<span class="intername">'+data.itname+'</span>'+
	            '<span class="infor">'+datas.message+'</span>'+
	        '</div>'+
	    '</li>';	
		$(".conLeft ul").append($(li));	
	},"json")
}
socket.onmessage=function(data){
	var datas = JSON.parse(data.data);
	datas["type"]=1;
	if($("#"+datas.sdk.substring(0,3)).length==0){
		AppendList(datas);
	}else{
		$("#"+datas.sdk.substring(0,3)+" .liRight .infor").text(((datas.message.indexOf(".jpg")!=-1)?"[图片]":datas.message));
	}
	//当前消息历史保存在文本中
	if(datas.message!="" && datas.message!=null){
		if(source[""+datas.usdk]==null){
			var s = [datas];
			source[""+datas.usdk]=s;
			
		}else{
			source[""+datas.usdk].push(datas);
		}
	}
	
	
	
	//如果当前引用对象就是当前发送消息的对象就可以直接展示
	if($(".newsList").attr("sdk")==datas.sdk){
		answers(datas);
	}else{
		//来到数据以后填充的消息
		if($("#"+datas.usdk +" .slipnum").length==0){
			$("#"+datas.usdk).append($('<span class="slipnum">1</span>')).text
			
		}else{
			var num=$("#"+datas.usdk +" .slipnum").text()
			num= (+num+1);
			$("#"+datas.usdk +" .slipnum").text(num);
		}
	}
	
}

</script>

</body>
</html>