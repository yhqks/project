package com.example.ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ssm.dao.Showpagedao;
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
	public int getReplyNumById(int id) {
		
		return dao.getReplyNumById(id);
	}	

}
