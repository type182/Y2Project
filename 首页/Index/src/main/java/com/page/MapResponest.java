package com.page;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
@Component
public class MapResponest {
	public Map<String, HttpServletResponse> map = new HashMap<String, HttpServletResponse>();
	
}
