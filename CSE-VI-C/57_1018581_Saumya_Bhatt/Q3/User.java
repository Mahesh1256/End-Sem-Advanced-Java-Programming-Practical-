package com.saumya.struts2;

import com.opensymphony.xwork2.ActionSupport;
@SuppressWarnings("serial")
public class User extends ActionSupport{
	private String name;
	private String password;
	public String execute() {
		return "success";// if the employee values are correct then success message is display
		}
	public void validate() {
		if(name==null || name.trim().equals("")) {
			addFieldError("name","The name is required");// if the value of name is empty
			}
		if(password==null ||password.trim().equals("") )
		{
			addFieldError("password","Enter a password");// password should be entered
			}
		}
	public String getName() {
		return name;// to return the name of the employee
	}
	public void setName(String name) {
		this.name = name; // to set the name for the employee
	}
	public String getPassword() {
		return password;// the return the age of employee
	}
	public void setPassword(String password) {
		this.password = password;// to set the age of employee
	}
}