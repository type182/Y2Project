package com.controller;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.lucene.queryparser.classic.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Lucene.LucentPojo;
import com.Lucene.QueryLuceneCommBat;
import com.Service.ItemsService;
import com.pojo.Goods;

@RestController
@RequestMapping("/Ajax")
public class AjaxController {
	
	@Autowired
	ItemsService items;
	
	
	
	@RequestMapping("/GetAddres")
	public String Addres(HttpServletRequest request) {
		//定位当前用户的登陆的地址
		return "徐州";
	}
	
	
	@RequestMapping("/GetGoodsList")
	public Object GoodsList(HttpSession session) {
		//获取还没逛够的商品
		
		if (session.getAttribute("user")==null) {
			
		}else {
			
		}
		
		
		
		return null;
	}
	
	@RequestMapping("/Ranking")
	public Object  Ranking(Integer type) {
		//获取当前类型的热门商品
		List<Goods> listgodes = items.selectGoodsPopularity(type);
		return listgodes;
	}
	
	@Autowired
	QueryLuceneCommBat bat;
	@RequestMapping("/Scan")
	public Object Scan(String content) throws IOException, ParseException {
		//List<LucentPojo> queryName = bat.QueryName("name:"+content,5);
		List<LucentPojo> querycontent = bat.QueryName("content:"+content,10);
		Set<LucentPojo> set = new HashSet<LucentPojo>();
		if (!(querycontent.size()<=0)) {
			set.addAll(querycontent);
		}
//		if (!(queryName.size()<=0)) {
//			set.addAll(queryName);
//		}
		if(set.size()<=0) {
			return "{\"size\":0}";
			
		}
		return set;
	}
}
