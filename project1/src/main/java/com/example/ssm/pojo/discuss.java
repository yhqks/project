package com.example.ssm.pojo;

import java.sql.Date;

public class discuss {
	private Integer id; //讨论记录的id
	private String context;//内容
	private Integer uid;//用户的id
	private Integer rid;//回复的id
	private String time;//发表的时间

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public Integer getRid() {
		return rid;
	}

	public void setRid(Integer rid) {
		this.rid = rid;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public discuss(Integer id, String context, Integer uid, Integer rid, String time) {
		this.id = id;
		this.context = context;
		this.uid = uid;
		this.rid = rid;
		this.time = time;
	}

	public discuss(String context, Integer uid, Integer rid, String time) {
		this.context = context;
		this.uid = uid;
		this.rid = rid;
		this.time = time;
	}

	public discuss() {
		super();
	}

	@Override
	public String toString() {
		return "discuss [context=" + context + ", uid=" + uid + ", rid=" + rid + ", time=" + time + "]";
	}

}
