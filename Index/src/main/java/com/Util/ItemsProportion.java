package com.Util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Service.RedisService;
import com.pojo.User;
/**
 * 
 * @author 比例计算
 *
 */
@Component
public class ItemsProportion {
	
	
	@Autowired
	RedisService redis;
	
	
	/*
	public  List<ProportionPojo> Proportion( HttpServletRequest request,User isNotUser){
		if (isNotUser==null) {
			return null;
		}
		else{
			List<ProportionPojo> TypeList = redis.getList(isNotUser.getId().toString());
			Integer size = redis.getCount();
			//操作Sql
			for(ProportionPojo pro : TypeList) {
				double proportion = pro.getProportion()/size;
				pro.setProportion(proportion);
			}
			return TypeList;
		}
	}*/
}
