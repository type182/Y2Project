package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.lucene.queryparser.classic.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Redis.pojo.NewsList;
import com.Redis.pojo.TopItems;
import com.Redis.pojo.Wrapperlist;
import com.Service.ItemsService;
import com.Service.RedisService;
import com.Util.TypeRedis;
import com.pojo.Coupons;
import com.pojo.Goods;
import com.pojo.Totatype;

@Controller
@RequestMapping("/Index")
public class IndexShowFa {
	@Autowired
	ItemsService Items;
	
	
	@RequestMapping("/Index.action")
	public String Index(HttpServletRequest request,HttpSession session,Model model){
		
		//获取推荐
		List<TopItems>  topitemImg= service.GetPojoList("topitem", null, 0, 3);
		model.addAttribute("topitem", topitemImg); //轮播图旁边三个图片
		/**
		 * 获取推荐获取3个
		 */
		
		//获取新闻列表
		List<NewsList> newList = service.GetPojoList("newsList",null, 0, 7);
		model.addAttribute("newsList", newList); //新闻
		/**
		 * 获取默认七个新闻列表 
		 */

		Integer type = Items.getUserListType(request);
		//获取轮播图信息
		List<Wrapperlist> wrapperlist = service.GetPojoList("wrapperlist",null, 0, 7);
		model.addAttribute("wrapperlist", wrapperlist); //轮播图
		
		/**
		 * 获取轮播图信息
		 */
		
		
		//获取一级菜单
		List<Totatype> totosOneType = Items.getTotosOneType();
		model.addAttribute("menulist", totosOneType); //一级菜单
		/**
		 * 获取全部的一级的菜单
		 */
		List<Totatype> ranking = new ArrayList<Totatype>();
		
		for (int i = 0; i < 5; i++) {
			ranking.add(totosOneType.get(i));
		}
		model.addAttribute("ranking", ranking);
		
		/**
		 * 商品排行
		 */
		
		
		
		List<Goods> LikeListGoods = Items.selectLikeGoods(type);
		/**
		 * 用户最近浏览类型
		 */
		model.addAttribute("clearfix", LikeListGoods);
		
		
		
		List<Coupons> listLikeCouPons = Items.selectGoodsCoupon("1,2,3");
		/**
		 * 最新的优惠劵
		 */
		
		model.addAttribute("couponlist", listLikeCouPons);
		
		
		
		return ToFtl.toIndex(model);
		
	}
	@Autowired
	RedisService service;
	
	




	@RequestMapping("/Jedis")
	public void Jedis() throws IOException, ParseException{
//		List<TopItems> list = new ArrayList<TopItems>();
//		list.add(new TopItems("topitem/goods?godid=1", "topitem/8a5d6d806632a4b2.jpg"));
//		list.add(new TopItems("topitem/goods?godid=2", "topitem/5bf2717dNdf955f51.jpg"));
//		list.add(new TopItems("topitem/goods?godid=3", "topitem/915510f60c57ffe1.jpg"));
//		service.SetPojoList("topitem", list,TypeRedis.JSON);
		
		
		
		List<NewsList> list = new ArrayList<NewsList>();
		list.add(new NewsList("1", "2019年春节物流服务公告"));
		list.add(new NewsList("2", "iPhone XR3000元"));
		list.add(new NewsList("3", "iPhone XR再见了！iPhone SE2：你好！"));
		service.SetPojoList("newsList", list, TypeRedis.JSON);
		
		
		
		
		
		
		
	}
}
