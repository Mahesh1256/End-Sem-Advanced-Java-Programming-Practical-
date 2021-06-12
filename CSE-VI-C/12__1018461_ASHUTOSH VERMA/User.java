package com.aanchalSingh.struts2;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class User extends ActionSupport {
	private String name;
	private String pass;
	
	public String execute() {
		return SUCCESS;
		
	}
	public void validate() {
		if(name == null || name.trim().equals("")) {
			addFieldError("name","The name is required");
		}
		if(pass == null || pass.trim().equals("")) {
			addFieldError("pass","Password is required");
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass=pass;
	}
	
}
