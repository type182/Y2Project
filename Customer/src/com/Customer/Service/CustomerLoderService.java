package com.Customer.Service;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CustomerLoderService
 */
@WebServlet("/CustomerLoderService")
public class CustomerLoderService extends HttpServlet {
	public static Map<String,Items> map  = new HashMap<String, Items>();
	
	@Override
	public void init() throws ServletException {
		map.put("01874266741SKDMIHNC", new Items("张三书店", "http://5b0988e595225.cdn.sohucs.com/images/20180111/3822d06dc170400583a798a93ce259c0.jpeg","01874266741SKDMIHNC"));
		map.put("78942142451DKNCBVS", new Items("草帽书城", "http://img1.imgtn.bdimg.com/it/u=2697783222,3717756653&fm=26&gp=0.jpg","78942142451DKNCBVS"));
	}
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		
		doPost(req, resp);
		
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String SKD = req.getParameter("SDK");
		Items items = map.get(SKD);
		System.out.println(items);
		req.setAttribute("Items", items);
		req.setAttribute("name", req.getParameter("name"));
		req.getRequestDispatcher("Customer/Customer.jsp").forward(req, resp);
	}
}
