package com.example.ssm.dao;

import org.apache.ibatis.annotations.Mapper;

import com.example.ssm.pojo.reply;

@Mapper
public interface Showpagedao {
  int getIdByusername(String name);
  Boolean  insertReply(reply r);
  int getReplyNumById(int id);

}
