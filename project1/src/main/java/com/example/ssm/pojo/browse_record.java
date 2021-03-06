package com.example.ssm.pojo;

import java.sql.Date;

public class browse_record {
	private Integer uid;//浏览用户的id
	private Integer nid;//被浏览的新闻的id
	private Date time;//浏览的日期

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

	public browse_record(Integer uid, Integer nid, Date time) {
		super();
		this.uid = uid;
		this.nid = nid;
		this.time = time;
	}

	@Override
	public String toString() {
		return "browse_record [uid=" + uid + ", nid=" + nid + ", time=" + time + "]";
	}

}
