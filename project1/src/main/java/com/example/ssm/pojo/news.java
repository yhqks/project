package com.example.ssm.pojo;

import java.sql.Date;
import java.util.List;

public class news {
	private int id;// 新闻id
	private String title;// 新闻的标题
	private int authorId;// 作者id
	private String types;// 新闻类型
	private String context;// 新闻的内容
	private int scanNum;// 浏览数量
	private List<pic> src;
	 private Date time;
	 
	 public String[] getContexts() {
		return contexts;
	}

	public void setContexts(String[] contexts) {
		this.contexts = contexts;
	}

	private String[] contexts;

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public List<pic> getSrc() {
		return src;
	}

	public void setSrc(List<pic> src) {
		this.src = src;
	}

	public Integer getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}





	public String getTypes() {
		return types;
	}

	public void setTypes(String types) {
		this.types = types;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}






	public news() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public int getScanNum() {
		return scanNum;
	}

	public void setScanNum(int scanNum) {
		this.scanNum = scanNum;
	}

	@Override
	public String toString() {
		return "news [id=" + id + ", title=" + title + ", authorId=" + authorId + ", types=" + types + ", context="
				+ context + ", scanNum=" + scanNum + ", src=" + src + ", time=" + time + "]";
	}

	public news(int id, String title, int authorId, String types, String context, int scanNum, List<pic> src,
			Date time) {
		super();
		this.id = id;
		this.title = title;
		this.authorId = authorId;
		this.types = types;
		this.context = context;
		this.scanNum = scanNum;
		this.src = src;
		this.time = time;
	}


	

}
