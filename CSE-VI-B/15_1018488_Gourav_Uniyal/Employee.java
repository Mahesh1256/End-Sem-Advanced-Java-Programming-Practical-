package com.endsem.Tweleve;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class Employee extends ActionSupport {
	private String name;
	private String password;

	public String execute() {
		return "success";
	}

	public void validate() {
		if (name == null || name.trim().equals("")) {
			addFieldError("name", "The name is required");
		}
		if (password == null || password.length() < 4 ) {
			addFieldError("password", "Password must be more than 4 length");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

} 