package com.example.ssm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ssm.dao.Startpagedao;
import com.example.ssm.pojo.news;
import com.example.ssm.pojo.pic;

@Service
public class start_pageService {
	@Autowired
	private Startpagedao  map;
	
	public List<news> getAllNews() {
		// TODO Auto-generated method stub
		List<news>  user = map.getAllNews();
		return user;
	}
	
	public List<pic> getAllpic(int id){
		
		List<pic>  list= map.getAllpic(id);
		return list;
	}
	
	public List<String>  getTitle(){
		
		List<String> list=map.getTitle();
		return list;
	}
   public news getNewsById(int id) {
	   news news=map.getNewsById(id);
	   return news;
   }


}
