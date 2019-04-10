package com.example.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.ssm.pojo.news;
import com.example.ssm.pojo.pic;
import com.example.ssm.service.start_pageService;

@Controller
public class start_pageController {
	@Autowired
	private start_pageService Service;

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
			System.out.println(news);
			List<pic> p = Service.getAllpic(news.getId());
			news.setSrc(p);
		}

		for (news news : list) {
			System.out.println(news.getSrc());
		}

		return list;
	}
	@RequestMapping(value = "exit", method = RequestMethod.POST)
	public String exit() {
		
		return "index";
	}
	
	@RequestMapping(value = "getNewsById", method = RequestMethod.POST)
	@ResponseBody
	public news getNewsById(Integer id) {
		return   Service.getNewsById(id);
	}
}
