
package com.example.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.ssm.pojo.user;


@Mapper
public interface Userdao {
	user selectByName(String name);
	List<String> getAllCollege();
	Boolean insertuser(user user);
	String getPicnameById(int id);
	
}