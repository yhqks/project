package com.example.ssm.pojo;

import java.sql.Date;

public class discuss {
	private Integer id; //讨论记录的id
	private String context;//内容
	private Integer uid;//用户的id
	private Integer nid;//新闻的id
	private Date time;//发表的时间

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

	public Integer getNid() {
		return nid;
	}

	public void setNid(Integer nid) {
		this.nid = nid;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public discuss(Integer id, String context, Integer uid, Integer nid, Date time) {
		this.id = id;
		this.context = context;
		this.uid = uid;
		this.nid = nid;
		this.time = time;
	}

	public discuss(String context, Integer uid, Integer nid, Date time) {
		this.context = context;
		this.uid = uid;
		this.nid = nid;
		this.time = time;
	}

	public discuss() {
		super();
	}

	@Override
	public String toString() {
		return "discuss [context=" + context + ", uid=" + uid + ", nid=" + nid + ", time=" + time + "]";
	}

}
