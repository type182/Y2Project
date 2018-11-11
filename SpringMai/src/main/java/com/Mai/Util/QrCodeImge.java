package com.Mai.Util;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;

import com.Mai.Util.overall.ImagePage;
import com.swetake.util.Qrcode;

public class QrCodeImge {
	private static Qrcode qrcode = new Qrcode();
	private static BufferedImage bufimg = null;
	private static Graphics2D gs = null;
	static{
		inint();
	}
	
	private static void inint() {
		bufimg=new BufferedImage(ImagePage.width, ImagePage.hight, BufferedImage.TYPE_INT_BGR);
		gs=bufimg.createGraphics();
		qrcode.setQrcodeErrorCorrect('F');
		qrcode.setQrcodeEncodeMode('B');
		qrcode.setQrcodeVersion(11);
		gs.setBackground(Color.WHITE);
	       gs.setColor(Color.BLACK);
	       gs.clearRect(0, 0, ImagePage.width, ImagePage.hight);
	}
	
	/**
	 * 
	 * @param qurl  生成二维码的内容
	 * @param filename 保存文件位置
	 * 		默认生成写到文件 方便保存数据库的生成模式  
	 * @throws IOException 
	 */
	public void GetImageSource(String qurl,File filename) throws IOException{
		inint(); 
		byte[] Content = qurl.getBytes();
        int pixoff = 3;
        if (Content.length > 0 && Content.length < 120) {
            boolean[][] s = qrcode.calQrcode(Content);

            for (int i = 0; i < s.length; i++) {
                for (int j = 0; j < s.length; j++) {
                    if (s[j][i]) {
                        gs.fillRect(j * 3 + pixoff, i * 3 + pixoff, 3, 3);
                        	
                    }
                }
            }
        }
        BufferedImage image = ImageIO.read(ImagePage.fileContent);
        gs.drawImage(image,ImagePage.hight/2-25, ImagePage.width/2-25, 60, 60, null);
        gs.dispose();
        bufimg.flush();
        ImageIO.write(bufimg, "png", filename);
        System.out.println("二维码生成完毕......");
	}
	/**
	 * 
	 * @param qurl  内容
	 * @return  直接返回Java图片对象
	 * @throws IOException
	 */
	public BufferedImage GetImage(String qurl) throws IOException{
		inint();
		byte[] Content = qurl.getBytes();
        int pixoff = 3;
        if (Content.length > 0 && Content.length < 120) {
            boolean[][] s = qrcode.calQrcode(Content);

            for (int i = 0; i < s.length; i++) {
                for (int j = 0; j < s.length; j++) {
                    if (s[j][i]) {
                        gs.fillRect(j * 3 + pixoff, i * 3 + pixoff, 3, 3);
                        	
                    }
                }
            }
        }
        BufferedImage image = ImageIO.read(ImagePage.fileContent);
        gs.drawImage(image,ImagePage.hight/2-25, ImagePage.width/2-25, 60, 60, null);
        gs.dispose();
        bufimg.flush();
        return bufimg;
	}
	
	
	
	/**
	 * 
	 * @param qurl  内容
	 * @param backgroundColor  背景颜色
	 * @param FontColor  字体颜色
	 * @return   Java图片数据对象
	 * @throws IOException
	 */
	public ImageInputStream GetImage(String qurl,Color backgroundColor,Color FontColor) throws IOException{
		inint();
		gs.setBackground(backgroundColor);
		gs.setColor(FontColor);
		byte[] Content = qurl.getBytes();
        int pixoff = 3;
        if (Content.length > 0 && Content.length < 120) {
            boolean[][] s = qrcode.calQrcode(Content);

            for (int i = 0; i < s.length; i++) {
                for (int j = 0; j < s.length; j++) {
                    if (s[j][i]) {
                        gs.fillRect(j * 3 + pixoff, i * 3 + pixoff, 3, 3);
                        	
                    }
                }
            }
        }
        ImageInputStream createImageInputStream = ImageIO.createImageInputStream(bufimg);
        return createImageInputStream;
	}
	
	/**
	 * 
	 * @param qurl  内容
	 * @param filename  保存文件位置
	 * @param backgroundColor 背景颜色
	 * @param FontColor 字体颜色
	 * @throws IOException
	 */
	public void GetImage(String qurl,File filename,Color backgroundColor,Color FontColor) throws IOException{
		inint();
		gs.setBackground(backgroundColor);
		gs.setColor(FontColor);
		byte[] Content = qurl.getBytes();
       int pixoff = 3;
       if (Content.length > 0 && Content.length < 120) {
           boolean[][] s = qrcode.calQrcode(Content);

           for (int i = 0; i < s.length; i++) {
               for (int j = 0; j < s.length; j++) {
                   if (s[j][i]) {
                       gs.fillRect(j * 3 + pixoff, i * 3 + pixoff, 3, 3);
                       	
                   }
               }
           }
       }
       BufferedImage image = ImageIO.read(ImagePage.fileContent);
       gs.drawImage(image,ImagePage.hight/2-25, ImagePage.width/2-25, 60, 60, null);
       gs.dispose();
       bufimg.flush();
       ImageIO.write(bufimg, "png", filename);
       System.out.println("二维码生成完毕......");
	}
}
