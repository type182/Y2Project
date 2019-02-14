(function() {
	$(function() {

		var phonz = /^(13[0-9]|14[5|7]|15[0|1|2|3|5|6|7|8|9]|18[0|1|2|3|5|6|7|8|9])\d{8}$/;
		var emailz = /^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/;
		var usernamez = /^[a-zA-Z][a-zA-Z0-9_]{4,15}$/;
		var pawssz = /^[a-zA-Z]\w{5,17}$/;
		$("#register-form").submit(function() {
			$("text").text("");
			var bot = $("#phon").get(0).checked;
			var username = $("#username").val();
			var pawss = $("#pawss").val();
			var pawss2 = $("#pawss2").val();
			var bools = true;
			if (username == "" || !usernamez.test(username)) {
				$("#username").next().text("字母开头，允许5-16字节，允许字母数字下划线");
				bools = false;
			}
			if (pawss == "" || !pawssz.test(pawss)) {
				$("#pawss").next().text("以字母开头，长度在6~18之间，只能包含字母、数字和下划线");
				bools = false;
			}
			if (pawss != pawss2) {
				$("#pawss2").next().text("两次密码不一致");
				bools = false;
			}
			if (bot) {
				// 手机校验块
				var phon = $("#phone").val();
				if (phon == "" || !phonz.test(phon)) {
					$("#phone").next().text("手机号格式有误");
					bools = false;
				} else {
					var code = $("#Code").val();
					if (code != $("#Code").attr("code") || code == "") {
						$(".coders").text("验证码错误");
						bools = false;
					}
				}
			} else {
				// 邮箱校验快
				var email = $("#emails").val();
				if (email == "" || !emailz.test(email)) {
					$("#emails").next().text("邮箱格式有误");
					bools = false;
				}
			}
			alert(bools);
			return bools;
		})

		$("#phon").click(function() {
			$(".email").hide();
			$(".phon").show();
		})
		$("#email").click(function() {
			$(".email").show();
			$(".phon").hide();
		})

	})

})()