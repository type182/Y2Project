<html class="root61">
	<head>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta http-equiv="Content-Type" content="text/html; charset=gbk">
		<title>个人注册</title>
		<link type="text/css" rel="stylesheet" href="//misc.360buyimg.com/jdf/1.0.0/unit/??ui-base/1.0.0/ui-base.css">
		<link type="text/css" rel="stylesheet" href="//misc.360buyimg.com/user/reg/3.0.0/css/tinyscrollbar-170524.css">
		<link source="widget" type="text/css" rel="stylesheet" href="//misc.360buyimg.com/user/reg/3.0.0/widget/??/header/header.css,/common/common.css,/progress-bar/progress-bar.css,/reg-steps/reg-steps.css,/foreign-number-layer-170524/foreign-number-layer-170524.css,/footer/footer.css">
		<srcipt src="http://www.w3school.com.cn/jquery/jquery-1.11.1.min.js"></srcipt>
		<link charset="utf-8" rel="stylesheet" href="https://misc.360buyimg.com/jdf/1.0.0/ui/dialog/1.0.0/dialog.css">
		<link charset="utf-8" rel="stylesheet" href="http://127.0.0.1:8080/css/register.css"></link>
	</head>
	<body>
		<div class="header">
			<div class="logo-con w clearfix">
				<a href="https://www.jd.com" class="logo">
				</a>
				<div class="logo-title">欢迎注册</div>

				<div class="have-account">已有账号？ <a href="toloder">请登录&gt;</a></div>

			</div>
		</div>
		<div class="container w" style="    margin-top: -18px;">
			<div class="main ">
				<div class="reg-form">
					<form action="register" id="register-form" method="GET">
						<div id="step1-wrap">
							<div class="item-phone-wrap">
								<div class="form-item form-item-phone">
									
									<div class="item-input-wrap form-item-valid" style="border: 1px solid rgb(221, 221, 221);width: 382px;">
										<txt style="position: absolute; z-index: 2; line-height: 46px; margin-left: 20px; margin-top: 1px; font-size: 14px; font-family: Arial; color: rgb(204, 204, 204);">
											用户名
										</txt>
										<input type="text" id="username" name ="username" class="field ignore">
										<text>
											
										</text>
									</div>
									<div class="input-tip"><span></span></div>
								</div>
							</div>
							<div class="item-phone-wrap">
								<div class="form-item form-item-phone">
									
									<div class="item-input-wrap form-item-valid" style="border: 1px solid rgb(221, 221, 221);width: 382px;">
										<txt style="position: absolute; z-index: 2; line-height: 46px; margin-left: 20px; margin-top: 1px; font-size: 14px; font-family: Arial; color: rgb(204, 204, 204);">
											密码
										</txt>
										<input type="text" id="pawss" name="userPwd" class="field ignore">
										<text>
											
										</text>
									</div>
									<div class="input-tip"><span></span></div>
								</div>
							</div>
							<div class="item-phone-wrap">
								<div class="form-item form-item-phone">
									
									<div class="item-input-wrap form-item-valid" style="border: 1px solid rgb(221, 221, 221);width: 382px;">
										<txt style="position: absolute; z-index: 2; line-height: 46px; margin-left: 20px; margin-top: 1px; font-size: 14px; font-family: Arial; color: rgb(204, 204, 204);">
											确定密码
										</txt>
										<input type="text" id="pawss2" class="field ignore">
										<text>
											
										</text>
									</div>
									<div class="input-tip"><span></span></div>
								</div>
							</div>
							<div class="item-phone-wrap email">
								<div class="form-item form-item-phone">
									<label class="select-country" id="select-country" country_id="0086" style="border-top: 1px solid rgb(221, 221, 221); border-right: none rgb(221, 221, 221); border-bottom: 1px solid rgb(221, 221, 221); border-left: 1px solid rgb(221, 221, 221); border-image: initial;">邮箱注册<a href="javascript:void(0) " class="arrow"></a></label>
									<div class="item-input-wrap form-item-valid" style="border: 1px solid rgb(221, 221, 221);">
										<txt style="position: absolute; z-index: 2; line-height: 46px; margin-left: 20px; margin-top: 1px; font-size: 14px; font-family: Arial; color: rgb(204, 204, 204);">建议使用常用邮箱</txt>
										<input type="text" id="emails" name="userprotected" class="field ignore">
										 <text>
											
										</text>
										<i class="i-status"></i>
										<i class="i-cancel" style="display: none;"></i>
									</div>
									<div class="input-tip"><span></span></div>
								</div>
							</div>
							<div class="item-phone-wrap phon" style="display: none;">
								<div class="form-item form-item-phone">
									<label class="select-country" id="select-country" country_id="0086" style="border-top: 1px solid rgb(221, 221, 221); border-right: none rgb(221, 221, 221); border-bottom: 1px solid rgb(221, 221, 221); border-left: 1px solid rgb(221, 221, 221); border-image: initial;">手机注册<a href="javascript:void(0) " class="arrow"></a></label>
									<div class="item-input-wrap form-item-valid" style="border: 1px solid rgb(221, 221, 221);">
										<txt style="position: absolute; z-index: 2; line-height: 46px; margin-left: 20px; margin-top: 1px; font-size: 14px; font-family: Arial; color: rgb(204, 204, 204); display: none;">建议使用常用手机</txt>
										
										<input
										 type="text" id="phone"  name="userprotected" class="field ignore">
										 <text>
											
										</text>
										<i class="i-status"></i>
										<i class="i-cancel" style="display: none;"></i>
									</div>
									<div class="input-tip"><span></span></div>
								</div>
							</div>
							<div class="item-phonecode-wrap phon a" style="display: none;">
								<div class="form-item form-item-phonecode">
									<div class="phonecode-left asd" style="border-color: rgb(221, 221, 221); border-right-width: 1px; border-right-style: solid;">
										<label>手机验证码</label>
										<input type="text" id="Code" class="field phonecode"
										 placeholder="输入验证码" style="width: 63%;">
										 
										<i class="i-status"></i>
										<i class="i-cancel"></i>
									</div>
									<button id="getPhoneCode" class="btn-phonecode"  type="button" style="    height: 54px; width: 101px;border-top: 1px solid rgb(221, 221, 221); border-right: 1px solid rgb(221, 221, 221); border-bottom: 1px solid rgb(221, 221, 221); border-left: none; border-image: initial;" id="jiazai">重新获取</button>
									<div class="input-tip"><span></span></div>
								</div>
							</div>
							<text class="coders">
											
										</text>
							<div>
								<input type="radio" id="phon" name="type" value="1">　手机验证　　　　
								<input type="radio" id="email" name="type" value="2" checked="checked">　邮箱验证
							</div>
							<button type="submit" id="step1-next" class="btn-register">
								注册
							</button>
						</div>
					</form>
				</div>
			</div>
		</div>
		<script src="http://127.0.0.1:8080/js/register.js"></script>
		<link rel="stylesheet" type="text/css" href="//gias.jd.com//slide/css/style.2.2.min.css">
	</body>
</html>
