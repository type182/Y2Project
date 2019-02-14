(function() {
	$("#formlogin").submit(function() {
		var name = $("#loginname").val();
		var pawss = $("#nloginpwd").val();
		if ((name == "" || name == null) || (pawss == "" || pawss == null)) {
			$(".cont-wrapper p").text("请输入有效数据")
			return false;
		} else {
			return true;
		}

	})
	$(".clear-btn").click(function() {
		$(this).prev().val("");
	})
	$(".login-tab-l").click(function() {
		$(".login-tab-l a").css("border-bottom", "solid 3px red");
		$(".login-tab-r a").css("border-bottom", "0px");
		$(".login-box").hide();
		$(".qrcode-login").show();
	})
	$(".login-tab-r").click(function() {
		$(".login-tab-r a").css("border-bottom", "solid 3px red");
		$(".login-tab-l a").css("border-bottom", "0px");
		$(".login-box").show();
		$(".qrcode-login").hide();
	})

})()