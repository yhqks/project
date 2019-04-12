package com.example.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.ssm.pojo.news;
import com.example.ssm.pojo.pic;

@Mapper
public interface Startpagedao {

  List<news> getAllNews();
  List<pic> getAllpic(int id);
  List<String>  getTitle();
  news getNewsById(int id);
  void  addScan(int id);
}
