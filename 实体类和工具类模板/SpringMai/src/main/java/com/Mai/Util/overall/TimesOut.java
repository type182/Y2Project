package com.Mai.Util.overall;

import java.util.Date;


class TherendTimeOutput extends Thread{
	@Override
	public void run() {
		while (true) {
			TimesOut.date=new Date();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}







public class TimesOut {
	public static Date date=null;
	
	
	static{
		date = new Date();
		TherendTimeOutput output = new TherendTimeOutput();
		output.start();
	}
}
