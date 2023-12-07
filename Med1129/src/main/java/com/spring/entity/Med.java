package com.spring.entity;

public class Med {
	private int id;
	private String mname;
	private String mtype;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMtype() {
		return mtype;
	}
	public void setMtype(String mtype) {
		this.mtype = mtype;
	}
	@Override
	public String toString() {
		return "Med [id=" + id + ", mname=" + mname + ", mtype=" + mtype + "]";
	}


}
