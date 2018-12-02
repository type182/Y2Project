package com.Mai.Util;
/**
 * 
 * @author 滑块验证码生产
 *
 */

import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;

import com.Mai.Util.Image.PageImageSlider;

public class slider {
	
	
	final static String[] imgSourceList= new String[] {
			"1.png",
			"2.png",
			"3.png",
			"4.png"
	};
	
	/**
	 * 	生产滑块机制
	 * @return 滑块的配置类
	 */
	static int  begin = 0;
	public static PageImageSlider GetLoderImage() {
		PageImageSlider imageSlider= new PageImageSlider();
		
		try {
			// 生产滑块
			String img = imgSourceList[begin];
			imageSlider.setBegBuff(ImageIO.read(new URL("http://www.mai.com/default/slider/"+img)));
			BufferedImage begBuff = imageSlider.getBegBuff();
			int width = begBuff.getWidth();
			int height = begBuff.getHeight();
			/*
			 * 生产小图片
			 * */
			double widthdu =((int)Math.random()*100)/100;
			double heightdu =((int)Math.random()*100)/100;
			int widthsmdu =(int)(width/widthdu);
			int heightsmdu = (int)(height/heightdu);
			BufferedImage smlBuff = begBuff.getSubimage(widthsmdu, heightsmdu, 0, 0);
			
			imageSlider.setWidth(widthsmdu);
			imageSlider.setHeight(heightsmdu);
			imageSlider.setSmliBuff(smlBuff);
			begin = (begin%imgSourceList.length)+1;
			
			
		} catch (Exception e) {
			e.printStackTrace();
			imageSlider=null;
		}
		
		return imageSlider;
	}
}
