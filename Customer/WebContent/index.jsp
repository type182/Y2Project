<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html xmlns="http://www.w3.org/1999/xhtml"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Wopop</title>
<link href="./Wopop_files/style_log.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css" href="./Wopop_files/style.css">
<link rel="stylesheet" type="text/css" href="./Wopop_files/userpanel.css">
<link rel="stylesheet" type="text/css" href="./Wopop_files/jquery.ui.all.css">

</head>

<body class="login" mycollectionplug="bind">
<form action="CustomerLoderService" method="get">
<div class="login_m">
<div class="login_logo"><img src="./Wopop_files/logo.png" width="196" height="46"></div>
<div class="login_boder">

<div class="login_padding" id="login_model">

  <h2>SKD</h2>
  <label>
    <input type="text" id="username" class="txt_input txt_input2"  name="SDK" value="Your name">
  </label>
  <h2>Name</h2>
  <label>
    <input type="password" name="name" id="userpwd" class="txt_input">
  </label>
 
 

 
  <p class="forgot"><a id="iforget" href="javascript:void(0);">Forgot your password?</a></p>
  <div class="rem_sub">
  <div class="rem_sub_l">
  <input type="checkbox" name="checkbox" id="save_me">
   <label for="checkbox">Remember me</label>
   </div>
    <label>
      <input type="submit" class="sub_button" name="button" id="button" value="登陆" style="opacity: 0.7;">
    </label>
  </div>
</div>
</form>
<div class="copyrights">Collect from <a href="http://www.cssmoban.com/" >企业网站模板</a></div>

<div id="forget_model" class="login_padding" style="display:none">
<br>

   <h1>Forgot password</h1>
   <br>
   <div class="forget_model_h2">(Please enter your registered email below and the system will automatically reset users’ password and send it to user’s registered email address.)</div>
    <label>
    <input type="text" id="usrmail" class="txt_input txt_input2">
   </label>

 
  <div class="rem_sub">
  <div class="rem_sub_l">
   </div>
    <label>
     <input type="submit" class="sub_buttons" name="button" id="Retrievenow" value="Retrieve now" style="opacity: 0.7;">
     　　　
     <input type="submit" class="sub_button" name="button" id="denglou" value="Return" style="opacity: 0.7;">　　
    
    </label>
  </div>
</div>






<!--login_padding  Sign up end-->
</div><!--login_boder end-->
</div><!--login_m end-->
 <br> <br>
<p align="center"> More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a></p>



</body></html>