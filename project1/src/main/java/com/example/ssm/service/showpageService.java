package com.example.ssm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ssm.dao.Showpagedao;
import com.example.ssm.pojo.discuss;
import com.example.ssm.pojo.reply;

@Service
public class showpageService implements Showpagedao{

	@Autowired
  Showpagedao  dao;

	@Override
	public int getIdByusername(String name) {
		  
		return dao.getIdByusername(name);
	}

	@Override
	public Boolean insertReply(reply r) {
		
		return dao.insertReply(r);
	}

	@Override
	public Integer getReplyNumById(int id) {
		
		return dao.getReplyNumById(id);
	}

	@Override
	public List<reply> getReply(int id) {
		return  dao.getReply(id);
	
	}

	@Override
	public List<discuss> getDiscuss(int id) {
		
		return dao.getDiscuss(id);
	}
	

}
