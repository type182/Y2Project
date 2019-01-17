<html>
	<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=Edge">
		<title>欢迎登录</title>
		<link rel="icon" href="//www.jd.com/favicon.ico">
		<link type="text/css" rel="stylesheet" href="//misc.360buyimg.com/user/passport/1.0.0/??/widget/base/base.css,widget/common-2016-1124/common-2016-1124.css,/widget/login-form-2018-0827/login-form-2018-0827.css,/widget/login-banner/login-banner.css,/widget/safe-step/safe-step.css,/widget/foreign-number-layer-170524/foreign-number-layer-170524.css"
		 source="widget">
		<link type="text/css" rel="stylesheet" href="//misc.360buyimg.com/user/passport/1.0.0/css/tinyscrollbar-170524.css">
		<script src="http://www.w3school.com.cn/jquery/jquery-1.11.1.min.js"></script>
		<script src="http://127.0.0.1:8080/js/loder.js"></script>
	</head>
	<body>
		<style>
			.form .itxt{
				height: 37px;
			}
		</style>
		<div class="w">
			<div id="logo">
				<a href="//www.jd.com/" clstag="pageclick|keycount|20150112ABD|45">
					<img src="../img/4.png" alt="Mai" width="60" height="60">
				</a>
				<b></b>
			</div>
		</div>
		
		<div id="content">
			<div class="login-wrap">
				<div class="w">
					<div class="login-form">
						<div class="tips-wrapper">
							<div class="tips-inner">
								<div class="cont-wrapper"><i class="icon-tips"></i>
								</div>
							</div>
						</div>
						<style>
							.login-tab a{
								padding-bottom: 10px;
							}
						</style>
						<div class="login-tab login-tab-l">
							<a href="javascript:void(0)" style="border-bottom: solid 3px red;"> 扫码登录</a>
						</div>
						<div class="login-tab login-tab-r">
							<a href="javascript:void(0)" >账户登录</a>
						</div>
						<div class="login-box" style="display: none; visibility: visible;">
							<div class="mc" >
								<div class="form" style="margin-top: 51px;">
									<form id="formlogin" action="loder" method="post">
										<div class="item item-fore1">
											<label for="loginname" class="login-label name-label"></label>
											<input id="loginname" type="text" class="itxt" name="username" placeholder="邮箱/用户名/已验证手机">
											<span class="clear-btn" style="display: inline;"></span>
										</div>

										<div id="entry" class="item item-fore2" style="visibility: visible;">
											<label class="login-label pwd-label" for="nloginpwd"></label>
											<input type="password" id="nloginpwd" name="pawss" class="itxt itxt-error" placeholder="密码">
											<span class="clear-btn" style="display: inline;"></span>
										</div>


										<!-- QQ  和 微信登陆 -->
										<div class="item item-fore4">
											<div class="safe">
												<span></span>
												<span class="forget-pw-safe">
													<a href="//passport.jd.com/uc/links?tag=safe" class="" target="_blank" style="outline: rgb(109, 109, 109) none 0px;">忘记密码</a>
												</span>
											</div>
										</div>

										<div class="item item-fore5">
											<div class="login-btn">
												<button type="submit" class="btn-img btn-entry"  style="outline: rgb(109, 109, 109) none 0px; border: none;" id="loginsubmit">登&nbsp;&nbsp;&nbsp;&nbsp;录</button>
											</div>
										</div>
									</form>
								</div>
							</div>
						</div>

						<div class="qrcode-login" style="display: block; visibility: visible;">
							<div class="mc">
								<div class="qrcode-error-2016" style="left: 0px; display: none;">
									<div class="qrcode-error-mask">
									</div>
									<p class="err-cont">服务器出错</p>
									<a href="javascript:void(0)" class="refresh-btn" clstag="pageclick|keycount|login_pc_201804112|11">刷新</a>
								</div>
								<div class="qrcode-main">
									<div class="qrcode-img" style="left: 64px;">
										<img src="http://www.maimai.com/ImgeSource/QRcode.production?url=http://127.0.0.1:8080/User/LoderQurcode" alt="">
										<div class="qrcode-error02 hide" id="J-qrcoderror"> <a href="#none"> <span class="error-icon"></span>
												<div class="txt">网络开小差咯<span class="ml10">刷新二维码</span></div>
											</a> </div>
									</div>
									<div class="qrcode-help" style="display: none;"></div>
								</div>
								<div class="qrcode-panel">
									<ul>
										<li class="fore1">
											<span>打开</span>
											<a href="/uc/links?tag=apps" target="_blank" clstag="pageclick|keycount|201607144|9">
												<span class="red">Phon</span></a>
										</li>
										<li>扫描二维码</li>
									</ul>
								</div>
								<div class="coagent qr-coagent" id="qrCoagent">
									<ul>
										<li><b></b><em>免输入</em></li>
										<li><b class="faster"></b><em>更快&nbsp;</em></li>
										<li><b class="more-safe"></b><em>更安全</em></li>
									</ul>
								</div>
							</div>
						</div>
						<div class="coagent" id="kbCoagent">
							<ul>
								<li>
									<b></b>
									<a href="javascript:void(0)" onclick="window.location='//qq.jd.com/new/qq/login.aspx'+window.location.search;return false;"
									 clstag="pageclick|keycount|login_pc_201804112|3" class="pdl"><b class="QQ-icon"></b><span>QQ</span></a>
									<span class="line">|</span>
								</li>
								<li>
									<a href="javascript:void(0)" onclick="window.location='//qq.jd.com/new/wx/login.action'+window.location.search;return false;"
									 clstag="pageclick|keycount|login_pc_201804112|4" class="pdl"><b class="weixin-icon"></b><span>微信</span></a>
								</li>
								<li class="extra-r">
									<div>
										<div class="regist-link"><a href="toregister"
											 target="_blank"><b></b>立即注册</a></div>
									</div>
								</li>
							</ul>
						</div>
					</div>
				</div>
				<div class="login-banner" style="background-color: #b60560">
					<div class="w">
						<div id="banner-bg" clstag="pageclick|keycount|20150112ABD|46" class="i-inner" style="background: url(//img11.360buyimg.com/da/jfs/t29959/90/149041636/95721/3982d1de/5be9390cNae30f030.jpg) 0px 0px no-repeat;background-color: #b60560"></div>
					</div>
				</div>
			</div>
		</div>
		<link rel="stylesheet" type="text/css" href="//ivs.jd.com//slide/css/style.3.2.1.min.css">
	</body>
</html>
