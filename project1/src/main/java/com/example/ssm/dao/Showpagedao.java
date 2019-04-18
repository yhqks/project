package com.example.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.ssm.pojo.discuss;
import com.example.ssm.pojo.reply;

@Mapper
public interface Showpagedao {
  int getIdByusername(String name);
  Boolean  insertReply(reply r);
  Integer getReplyNumById(int id);
  List<reply> getReply(int id);
  List<discuss> getDiscuss(int id);
}
