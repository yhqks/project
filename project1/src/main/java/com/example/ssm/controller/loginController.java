/**
 * 
 */
/**
 * @author yks
 *
 * @date 创建时间：2019年3月28日 下午2:46:21
 */
package com.example.ssm.controller;

import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

//import com.alibaba.fastjson.JSON;
import com.example.ssm.pojo.user;
import com.example.ssm.service.loginService;

@Controller
public class loginController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7561700276961931120L;
	@Autowired
	private loginService userService;

	@RequestMapping(value = "/log", method = RequestMethod.POST)
	public String getDepts(HttpServletRequest request, HttpServletResponse response) {
		user user = userService.getuser(request.getParameter("username"));;
		System.out.println(user);
		if (user == null) {
			Cookie c2 = new Cookie("code", "null");
			c2.setMaxAge(30);
			response.addCookie(c2);
			return "index";
		}
		if (user.getPwd().equals(request.getParameter("pwd"))) {
			System.out.println("success");
			request.setAttribute("user", user);
			return "login";

		}
		Cookie c2 = new Cookie("code", "waring");
		c2.setMaxAge(30);
		response.addCookie(c2);
		return "index";
	}
//	@RequestMapping(value = "/register", method = RequestMethod.POST)
//	public String register (HttpServletRequest request, HttpServletResponse response) {
//		
//		
//		
//		
//		return null;
//	}
//	
//	@RequestMapping(value = "/college", method = RequestMethod.POST)
//	public String getAllCollege() {
//		List<String> list= userService.getALLCollege();
//		
//		String str= JSON.toJSON(list).toString();
//		for (String string : list) {
//			System.out.println(string);
//		}
//		return 	str;
//	}
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	