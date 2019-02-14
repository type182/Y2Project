package com.Service;

import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ItemsMapper;
import com.pojo.Coupons;
import com.pojo.Goods;
import com.pojo.Totatype;

@Service
public class ItemsService{
	@Autowired
	ItemsMapper mapper;
	public List<Totatype> getTotosOneType(){
		return mapper.selectTotlsOn();
	}
	public List<Goods> selectGoodsPopularity(Integer type) {
		// TODO Auto-generated method stub
		return mapper.selectGoodsPopularity(type);
	}
	public List<Coupons> selectGoodsCoupon(String type) {
		// TODO Auto-generated method stub
		return mapper.selectGoodsCoupon(type);
	}
	public List<Goods> selectLikeGoods(Integer type) {
		// TODO Auto-generated method stub
		return mapper.selectLikeGoods(type);
	}
	public List<Goods> select() {
		// TODO Auto-generated method stub
		return mapper.select();
	}
	
	
	
	
	public Integer getUserListType(HttpServletRequest request){
		Cookie[] cookies = request.getCookies();
		int type = 0;
		for (int i = 0; i < 3; i++) {
			try {
				String value = cookies[i].getValue();
				//调用搜索引擎查询当前搜索的类型
				int sourceType = 1;
				if (type<sourceType) {
					type=sourceType;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		return new Integer(type);
	}
	
	
}
