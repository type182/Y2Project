package com.Mai.Util;

import java.io.IOException;
import java.util.Date;
import java.util.Random;

import javax.xml.crypto.Data;

import com.Mai.Util.overall.Bs64;
import com.Mai.Util.overall.CtententPage;
import com.Mai.Util.overall.TimesOut;

public class FileName {
	
	/**
	 *   介绍：
	 *   	如果你在同一时间使用户超过70以上 不建议你使用
	 * @return  根据时间生成Name 1-100
	 */
	public String FileNameTime(){
		//根据时间拼接
		StringBuffer FileName=new StringBuffer();
		FileName.append(TimesOut.date.getTime());
		//随机15位
		for (int i = 0; i < CtententPage.FileNameTimeFilePage; i++) {
			int index = (int) (Math.random()*CtententPage.ASCLL.length);
			FileName.append(CtententPage.ASCLL[index]);
			FileName.append(TimesOut.date.getSeconds());
		}
		//根据随机数拼接
		double times= (Math.random()*100);
		FileName.append(times);
		return FileName.toString();
	}
	
	/**
	 *  简介:
	 *  	你必须先确保 文件名 确实所唯一的情况  
	 *  		才能进行对此文件名的 消息摘要
	 * @return 文件名 更方便的取源文件名的时候
	 * 	根据 时间逻辑随机生成FileName 将此FileName 消息摘要后返回格式字符串
	 */
	public String KeyFileName(String FileName){
		//处理FileName
		int size = (int) (TimesOut.date.getTime()/1000);
		
		 // 消息摘要准备
		//根据时间基质选择Size设置
		FileName = FileName+size;
		String value=null;
		try {
			value=Bs64.Bs64Encoder(FileName);
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return value;
	}
	
	/**
	 * 
	 * @param value 加密的字符串
	 * @return 反向取值
	 */
	public String KeyGet(String values){
		String value=null;
		value=Bs64.Bs64Decoder(values);
		value=value.substring(0, value.length()-10);
		return value;
	}
	
	
	/**
	 *    简介：
	 *    			这个算法有这安全隐患 推荐情况  一个时间储存较多，不需要闪chun基质
	 *    		我们吧 源文件进行Ascall 转换  后打乱  然后 随机 交换  
	 *    			文件Ascall不超出配置范围 来进行生成
	 *    
	 * @param 原来文件名
	 * @return 格式后文件名
	 */
	public String AscllFileName(String filename){
		
		byte[] ScAll=filename.getBytes();
		StringBuffer FileName = new StringBuffer();
		for (int i = 0; i < ScAll.length; i++) {
			float f = (float) (Math.random()*10);
			ScAll[i]=(byte) (f*ScAll[i]);
			String s = new String(ScAll, 0, i);
			FileName.append(ScAll[i]); 
		}
		
		
		return FileName.toString();
	}
	
	/**
	 * 如果你在同一时间  储存较多 
	 * 	然后你需要靠闪存的基质来处理较多的数据时我们推荐使用后
	 * 
	 * @param Filename 文件名
	 * @return
	 */
	public String FileHasFile(String Filename){
		
		FileNameHasString hasString = new FileNameHasString();
		hasString.setValue(Filename);
		int hashCode = hasString.hashCode();
		Random random = new Random();
		return Filename+hashCode+hasString+random.nextInt(100);
	}
	static class FileNameHasString{
		String value=null;

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = new String(value);
		}
		
		
		
	}
	
	
}
