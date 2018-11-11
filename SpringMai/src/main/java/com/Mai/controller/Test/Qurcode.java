package com.Mai.controller.Test;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.PrintWriter;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Mai.Util.SpringOrCodeImge;

public class Qurcode {
	public void Code(HttpServletResponse response,String Content) throws IOException {
		BufferedImage bufferedImage = SpringOrCodeImge.getBufferedImage(Content, 200, "E:\\code\\f.jpg");
		ImageIO.write(bufferedImage, "JPEG", response.getOutputStream());
	}
}
