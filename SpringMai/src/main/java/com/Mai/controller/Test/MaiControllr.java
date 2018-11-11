package com.Mai.controller.Test;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.stream.ImageInputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import com.Mai.Util.QrCodeImge;
import com.Mai.dao.redis.RedisUtil;

import redis.clients.jedis.Jedis;

@Controller
public class MaiControllr {
	
	@RequestMapping("/index.action")
	public String Index(Model model) {
		RedisUtil getJedis = new RedisUtil();
		List<String> a = new ArrayList<>();
		a.add("a");
		a.add("b");
		a.add("c");
		a.add("d");
		a.add("e");
		String setObject = getJedis.setObject("aaa", a);
		System.out.println("setObject: "+setObject);
		Object object = getJedis.getObject("a", List.class);
		System.out.println("Object: "+object);
		model.addAttribute("redis",object);
		return "index";
	}
	
	
	
}
