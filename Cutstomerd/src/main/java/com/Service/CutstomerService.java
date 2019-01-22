package com.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.CustomerDao;
import com.pojo.cutstomer;

@Service("Custstomer")
public class CutstomerService {
	@Autowired
	CustomerDao dao;
	public cutstomer CuststomerLoder(String Sdk,String pawss){
		if (Sdk==null || Sdk.equals("") || pawss==null || pawss.equals("")) {
			return null;
		}
		return dao.CutstomerLoder(Sdk,pawss);
	}
	
	
	
	
	
}
