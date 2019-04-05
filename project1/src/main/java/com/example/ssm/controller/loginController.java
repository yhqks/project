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
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
  //登陆方法
	@RequestMapping(value = "/log", method = RequestMethod.POST)
	public String getDepts(HttpServletRequest request, HttpServletResponse response) {
		//通过传入的用户名查询用户信息 （用户名不可重复）
		user user = userService.getuser(request.getParameter("username"));
		System.out.println(user);
		//
		if (user == null) {
			//若果user为空说明不存在该用户
			Cookie c2 = new Cookie("code", "null");
			c2.setMaxAge(30);
			//添加cookie
			response.addCookie(c2);
			return "index";
		}
		//密码和user中一致登陆成功
		if (user.getPwd().equals(request.getParameter("pwd"))) {
			System.out.println("success");
			//在session保存用户信息
			request.setAttribute("user", user);
			return "login";

		}
		//说明用户名和密码不匹配
		Cookie c2 = new Cookie("code", "waring");
		c2.setMaxAge(30);
		//添加cooki
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
	@RequestMapping(value = "/college", method = RequestMethod.POST)
	@ResponseBody 
	public List<String> getAllCollege() {
		List<String> list= userService.getALLCollege();
		return 	list;
	}
	
	
	@RequestMapping(value = "/checkname", method = RequestMethod.POST)
	@ResponseBody 
	public Boolean  checkname(@RequestParam(value = "name")String name) {
		user user = userService.getuser(name);
		if(user!=null) return false;
		return true;
	}
	
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(HttpServletRequest request) {
		user user=new user();
		
		user.setUsername(request.getParameter("username"));
		user.setPwd(request.getParameter("pwd"));
		user.setSex(request.getParameter("sex"));
		user.setCollege(request.getParameter("college"));
		user.setPremission(1);
		userService.insertuser(user);
		return "index";
	}
//	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	