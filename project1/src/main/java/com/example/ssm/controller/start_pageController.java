package com.example.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.ssm.pojo.news;
import com.example.ssm.pojo.pic;
import com.example.ssm.service.loginService;
import com.example.ssm.service.start_pageService;
import com.example.ssm.util.Shownewsutil;

@Controller
public class start_pageController {
	@Autowired
	private start_pageService Service;
	  @Autowired
      loginService userservice;
	  
	@RequestMapping(value = "getTitle", method = RequestMethod.POST)
	@ResponseBody
	public List<String> getTitle() {
		List<String> list = Service.getTitle();

		return list;
	}
	
	@RequestMapping(value = "getAllnews", method = RequestMethod.POST)
	@ResponseBody
	public List<news> getAllnews() {
		List<news> list = Service.getAllNews();
		for (news news : list) {
			List<pic> p = Service.getAllpic(news.getId());
			news.setSrc(p);
		}


		return list;
	}
	@RequestMapping(value = "exit")
	public String exit() {
		
		return "index";
	}
	
	@RequestMapping(value = "getNewsById", method = RequestMethod.POST)
	@ResponseBody
	public news getNewsById(Integer id) {
		
		 userservice.getPicnameById(id);
		 news n=Service.getNewsById(id);
		 n.setAuthorname(userservice.getPicnameById(n.getAuthorId()));
		 System.out.println(n.getAuthorname());
		return	Shownewsutil.Shownewsutils(n);
	}
	@RequestMapping(value = "addScan", method = RequestMethod.POST)
	@ResponseBody
	public void  addScan(Integer id) {
		Service.addScan(id);
	}
	
	
	
	
	
	
	
	
}
