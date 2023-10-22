package com.ssm.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.web.bind.annotation.ResponseBody;


public class AdminInfo {

    private int id;
    private String name;
    private String pwd;
    
    
	//无参数的构造方法
	public AdminInfo() {
		
	}
	
	//带参数的构造方法
    public AdminInfo(String name,String pwd) {
    	this.name=name;
    	this.pwd=pwd;
    
    	
    	
    }
    public void print() {
    	System.out.print(id + "--" + name + "--" + pwd);
    	
    }
	@Override
	public String toString() {
		return "AdminInfo [id=" + id + ", name=" + name + ", pwd=" + pwd + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}  
}
