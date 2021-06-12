package com.elf.struts2;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class Employee extends ActionSupport {
	private String name;
	private int pass;
	
	public String execute() {
		return SUCCESS;
		
	}
	public void validate() {
		if(name == null || name.trim().equals("")) {
			addFieldError("name","The name is required");
		}
		 {
			addFieldError("USER NAME");
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getPass() {
		return pass;
	}
	public void setPass(int pass) {
		this.pass=Pass;
	}
	
}
