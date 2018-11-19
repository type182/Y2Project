package com.Mai.Util.overall;

import java.io.File;

import org.springframework.beans.factory.annotation.Value;

public class ImagePage {
	public static File fileContent = new File("E:\\code\\pc.jpg");
	//默认打开路径的配置
	@Value("spring.Type.VersionImage")
	public static int v;
	public static int width=67+12*(v-1);
	public static int hight=67+12*(v-1);
	
	static{
		
		
		
		
		
		
	}
	
	
	
}
