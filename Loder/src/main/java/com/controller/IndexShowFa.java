package com.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Index")
public class IndexShowFa {
	@RequestMapping("/Index.action")
	public String Index(Model model){
		List<Map<String, String>> menulist = new ArrayList();
		menulist.add(new HashMap<String, String>(){{put("url", "#");put("name", "电脑 / 电视 / 家电");}});
		model.addAttribute("topitem", null); //轮播图旁边三个图片
		model.addAttribute("newsList", null); //新闻
		model.addAttribute("wrapperlist", null); //轮播图
		model.addAttribute("menulist", menulist); //一级菜单
		model.addAttribute("user", null); //一级菜单
		return ToFtl.toIndex(model);
	}

}
