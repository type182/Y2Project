<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html xmlns="http://www.w3.org/1999/xhtml"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Wopop</title>
<link href="${pageContext.request.contextPath}/Wopop_files/style_log.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/Wopop_files/style.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/Wopop_files/userpanel.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/Wopop_files/jquery.ui.all.css">

</head>

<body class="login" mycollectionplug="bind">
<form action="/Customer/Loder" method="POST">
<div class="login_m">
<div class="login_logo"><img src="${pageContext.request.contextPath}/Wopop_files/logo.png" width="196" height="46"></div>
<div class="login_boder">
<c:if test="${message!=''}">
	<p style="color:red;text-align: center;" >${message}</p>

</c:if>
<div class="login_padding" id="login_model">

  <h2>SKD</h2>
  <label>
    <input type="text" id="username" class="txt_input txt_input2" value="${sdk }"  name="sdk">
  </label>
  <h2>Pass</h2>
  <label>
    <input type="password" name="pawss" id="userpwd" value="${pawss }" class="txt_input">
  </label>
 
 

 
  <p class="forgot"><a id="iforget" href="javascript:void(0);">忘记密码?</a></p>
  <div class="rem_sub">
    <label>
      <input type="submit" class="sub_button" name="button" id="button" value="登陆" style="opacity: 0.7;">
    </label>
  </div>
</div>
</form>
</div><!--login_boder end-->
</div><!--login_m end-->
 <br> <br>



</body></html>