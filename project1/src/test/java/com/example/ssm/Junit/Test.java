package com.example.ssm.Junit;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.After;

import com.example.ssm.util.Dateutil;

public class Test {

	@After
	public void tearDown() throws Exception {
	}

	@org.junit.Test
	public void test() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		

	      Date date;
		try {
			date = df.parse("2019-4-18 16:24:16");
		 System.out.println(Dateutil.CountDate(date));	 
		} catch (ParseException e) {
		
		} 
		
		
		
	}

}
