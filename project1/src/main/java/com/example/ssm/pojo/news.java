package com.example.ssm.pojo;

public class news {
	private Integer id;//新闻id
	private String title;//新闻的标题
	private Integer author_id;//作者id
	private String types;//新闻类型
	private String context;//新闻的内容
	private Integer scan_num;//浏览数量

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getAuthor_id() {
		return author_id;
	}

	public void setAuthor_id(Integer author_id) {
		this.author_id = author_id;
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

	public Integer getScan_num() {
		return scan_num;
	}

	public void setScan_num(Integer scan_num) {
		this.scan_num = scan_num;
	}

	public news(Integer id, String title, Integer author_id, String types, String context, Integer scan_num) {
		super();
		this.id = id;
		this.title = title;
		this.author_id = author_id;
		this.types = types;
		this.context = context;
		this.scan_num = scan_num;
	}

	public news(String title, Integer author_id, String types, String context, Integer scan_num) {
		super();
		this.title = title;
		this.author_id = author_id;
		this.types = types;
		this.context = context;
		this.scan_num = scan_num;
	}

	public news() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "news [title=" + title + ", author_id=" + author_id + ", types=" + types + ", context=" + context
				+ ", scan_num=" + scan_num + "]";
	}

}
