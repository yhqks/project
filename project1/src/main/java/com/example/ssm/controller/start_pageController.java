package com.example.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.ssm.pojo.news;
import com.example.ssm.service.start_pageService;

@Controller
public class start_pageController {
  @Autowired
	private start_pageService Service;
  
  @RequestMapping(value = "getAllnews", method = RequestMethod.POST)
  @ResponseBody
public List<news> getAllnews() {
	  List<news> list= Service.getAllNews();
	  for (news news : list) {
		System.out.println(news);
	}
	return list;
}


}
