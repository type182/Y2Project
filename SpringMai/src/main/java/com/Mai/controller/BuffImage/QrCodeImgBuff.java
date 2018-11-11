package com.Mai.controller.BuffImage;

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
@RequestMapping("/QrCodee")
public class QrCodeImgBuff {
	@GetMapping("/Qrimge.Sc")
	public void GetImgBuffShow(HttpServletResponse response,String url) {
		BufferedImage bufferedImage = SpringOrCodeImge.getBufferedImage(url, 300, "E:\\code\\Img\\title.jpg");
		try {
			ImageIO.write(bufferedImage, "JPEG", response.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@GetMapping("/YanZhen.Sc")
	public void YanZhen(HttpServletResponse response) {
		BufferedImage image = Type_YanZheng.getImage(150, 50, "abck");
		
		try {
			ImageIO.write(image, "JPEG", response.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
