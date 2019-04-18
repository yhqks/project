package com.example.ssm.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.ssm.pojo.reply;
import com.example.ssm.service.loginService;
import com.example.ssm.service.showpageService;
import com.example.ssm.util.Dateutil;

@Controller
public class showpageController {
     @Autowired
       showpageService service;
     
     @Autowired
     loginService userservice;
     
   
      
     
	@RequestMapping(value = "sub")
	@ResponseBody
	public Boolean insertReply(reply reply,@RequestParam(value="username") String name) {
		
		Integer uid=service.getIdByusername(name);
		reply.setUid(uid);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
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
	@RequestMapping(value = "getReplycontext")
	@ResponseBody
	public  List<reply> getReplycontext(int id) {
		  List<reply> list=service.getReply(id);
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		   for (reply reply : list) {
			   Date d;
			try {
				reply.setName(userservice.getPicnameById(reply.getUid())); 
				d = df.parse(reply.getTime());
				reply.setTime(Dateutil.CountDate(d));
				reply.setDiscuss(service.getDiscuss(reply.getId()));
				System.out.println(reply+""+reply.getDiscuss());
			} catch (ParseException e) {
			}
			   
		}
		   
		return list;
	}
}
