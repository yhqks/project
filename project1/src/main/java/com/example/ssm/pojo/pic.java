package com.example.ssm.pojo;

public class pic {
	private String src;
	private Integer nid;
	private Integer adr;

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

	public Integer getNid() {
		return nid;
	}

	public void setNid(Integer nid) {
		this.nid = nid;
	}

	public Integer getAdr() {
		return adr;
	}

	public void setAdr(Integer adr) {
		this.adr = adr;
	}

	public pic(String src, Integer nid, Integer adr) {
		this.src = src;
		this.nid = nid;
		this.adr = adr;
	}

	public pic() {
		super();
	}

	@Override
	public String toString() {
		return "pic [src=" + src + ", nid=" + nid + ", adr=" + adr + "]";
	}

}
