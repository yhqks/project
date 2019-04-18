package com.example.ssm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ssm.dao.Userdao;
import com.example.ssm.pojo.user;

@Service
public class loginService  {
	@Autowired
	 private	Userdao map;

		public user getuser(String name) {
			// TODO Auto-generated method stub
			user  user = map.selectByName(name);
			return user;
		}
		public List<String >getALLCollege() {
			
			List<String> c=map.getAllCollege();
			return c;
			
		}
		
		
		public Boolean insertuser(user user) {
			
			return map.insertuser(user);
			
		} 
		
		public String getPicnameById(int id) {
			return map.getPicnameById(id);
			
		}
		

		
}
