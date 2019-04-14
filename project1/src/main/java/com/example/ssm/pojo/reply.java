package com.example.ssm.pojo;

import java.sql.Date;

public class reply {
 private Integer id;
 private String context;
 private Integer uid;
 private Integer nid;
 private String time;
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
public String getTime() {
	return time;
}
public void setTime(String time) {
	this.time = time;
}
public reply(Integer id, String context, Integer uid, Integer nid, String time) {
	this.id = id;
	this.context = context;
	this.uid = uid;
	this.nid = nid;
	this.time = time;
}
public reply(String context, Integer uid, Integer nid, String time) {
	this.context = context;
	this.uid = uid;
	this.nid = nid;
	this.time = time;
}
public reply() {
	super();
}
@Override
public String toString() {
	return "reply [context=" + context + ", uid=" + uid + ", nid=" + nid + ", time=" + time + "]";
}
 
 
}
