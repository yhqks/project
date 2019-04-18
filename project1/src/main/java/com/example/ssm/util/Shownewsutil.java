package com.example.ssm.util;

import com.example.ssm.pojo.news;

public class Shownewsutil {

	public static  news Shownewsutils(news news) {
	 
	 String str= news.getContext();
	  String[] list=str.split("\r\n");
	for (int i = 0; i < list.length; i++) {
		  if(list[i].length()>0)
		 list[i]="<p>&nbsp&nbsp&nbsp&nbsp&nbsp"+list[i]+"</p>";
		  else if(!list[i-1].equals("<br>")){
			  list[i]=list[i]+"<br>";
		}
		
	}
	  news.setContexts(list);

	  return news;
	 
	}

}
