package com.example.ssm.controller;

import static org.junit.Assert.*;

import com.example.ssm.pojo.news;

public class Test {

	@org.junit.Test
	public void test() {
	  start_pageController cont=new start_pageController();
	  news ne= cont.getNewsById(7);
	  System.out.println(ne);
	}

}
