package com.example.ssm.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.ssm.pojo.reply;
import com.example.ssm.service.showpageService;

@Controller
public class showpageController {
     @Autowired
       showpageService service;
     
	@RequestMapping(value = "sub")
	@ResponseBody
	public Boolean insertReply(reply reply,@RequestParam(value="username") String name) {
		
		Integer uid=service.getIdByusername(name);
		reply.setUid(uid);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date now = new Date(); 
		reply.setTime(df.format(now));
		Boolean b=service.insertReply(reply);
        return b;
		
	}
	
	@RequestMapping(value = "getReply")
	@ResponseBody
	public int getReply(int id) {
		  int num= service.getReplyNumById(id);
		  return num;
		
	}

}
