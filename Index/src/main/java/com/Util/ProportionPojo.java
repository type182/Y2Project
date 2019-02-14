package com.Util;

public class ProportionPojo {
	double proportion;
	int type;
	public double getProportion() {
		return proportion;
	}
	public void setProportion(double proportion) {
		this.proportion = proportion;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public ProportionPojo(int proportion, int type) {
		this.proportion = proportion;
		this.type = type;
	}
	public ProportionPojo() {
	}
	
	
	
	@Override
	public boolean equals(Object propor) {
//		ProportionPojo pojo = ((ProportionPojo)propor);
//		if (pojo==null) {
//			return false;
//		}else if(pojo.getProportion()<this.proportion+1 && pojo.getProportion()>this.proportion-1){
//			return false;
//		}else{
//			return true;
//		}
		return true;
	}
}
