package com.example.ssm.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dateutil {

	public   static String CountDate(Date before) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date now = new Date();
		df.format(now);
		long nd = 1000 * 24 * 60 * 60;
	    long nh = 1000 * 60 * 60;
	    long nm = 1000 * 60;
	    // long ns = 1000;
	    // 获得两个时间的毫秒时间差异
	    long diff = now.getTime() - before.getTime();
	    // 计算差多少天
	    long day = diff / nd;
	    // 计算差多少小时
	    long hour = diff % nd / nh;
	    // 计算差多少分钟
	    long min = diff % nd % nh / nm;
	    // 计算差多少秒//输出结果
	    // long sec = diff % nd % nh % nm / ns;
	   
	    if(day==0&&hour==0)
	    return  min + "分钟";
	    if(day==0)
		    return  hour + "小时" ;
	    return  day + "天";
	    
	}

}
