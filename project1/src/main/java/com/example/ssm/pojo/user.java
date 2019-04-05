package com.example.ssm.pojo;

public class user {
	private int id;//用户id
	private String username;//用户名
	private String pwd;//密码
	private String sex;//性别
	private String college;//学院
	private String interest;//兴趣
	private int  Permissions;//用户等级
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getInterest() {
		return interest;
	}
	public void setInterest(String interest) {
		this.interest = interest;
	}
	public int getPermissions() {
		return Permissions;
	}
	public void setPermissions(int premission) {
		this.Permissions = premission;
	}
	
	public user(int id, String username, String pwd, String sex, String college, String interest, int premission) {

		this.id = id;
		this.username = username;
		this.pwd = pwd;
		this.sex = sex;
		this.college = college;
		this.interest = interest;
		this.Permissions = premission;
	}
	public user(String username, String pwd, String sex, String college, String interest, int premission) {
		this.username = username;
		this.pwd = pwd;
		this.sex = sex;
		this.college = college;
		this.interest = interest;
		this.Permissions = premission;
	}
	public user() {}
	@Override
	public String toString() {
		return "user [id=" + id + ", username=" + username + ", pwd=" + pwd + ", sex=" + sex + ", college=" + college
				+ ", interest=" + interest + ", Premission=" + Permissions + "]";
	}
	
}
