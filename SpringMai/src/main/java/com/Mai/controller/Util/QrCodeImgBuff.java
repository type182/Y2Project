package com.Mai.controller.Util;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Mai.Util.SpringOrCodeImge;
import com.Mai.Util.Type_YanZheng;

@RestController
@RequestMapping("/ImgeSource")
public class QrCodeImgBuff {
	@GetMapping("/QRcode.production")
	public void GetImgBuffShow(HttpServletResponse response,String url) {
		BufferedImage bufferedImage = SpringOrCodeImge.getBufferedImage(url, 300, "E:\\code\\title.jpg");
		try {
			ImageIO.write(bufferedImage, "JPEG", response.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@GetMapping("/VFcode.production")
	public void YanZhen(HttpServletResponse response) {
		String generateVerifyCode = Type_YanZheng.generateVerifyCode(4);
		BufferedImage image = Type_YanZheng.getImage(150, 50, generateVerifyCode);
		
		try {
			ImageIO.write(image, "JPEG", response.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
