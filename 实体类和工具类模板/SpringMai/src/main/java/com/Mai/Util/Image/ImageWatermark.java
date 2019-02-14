package com.Mai.Util.Image;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class ImageWatermark {
	/**
	 *  这里的绝对路径 当然不可能是C:\**的  而是HTTP:*.png的
	 * @param url 水印图片的绝对路径
	 * @return
	 */
	public BufferedImage Watermark(String url) {
		try {
			BufferedImage bufferedImage = ImageIO.read(new URL(url));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	
}
