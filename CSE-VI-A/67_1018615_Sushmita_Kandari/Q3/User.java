// Created By SUSHMITA KANDARI SEC-A UNIVERSITY ROLL NO-1018615
package Practical12;

import com.opensymphony.xwork2.ActionSupport;
@SuppressWarnings("serial")

public class User extends ActionSupport{
	 private String name;
	 private String password;
	 
	 public String execute() {
		 return "success";
	 }
	 public void validate() {
		 if(name==null || name.trim().equals("")) {
			 addFieldError("name","The name is required");
		 }
		 if(password==null || name.trim().equals("")) {
			 addFieldError("password","The password is necessary");
		 }
		 
	 }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getpassword() {
		return password;
	}
	public void setAge(String password) {
		this.password = password;
	}
	 
	 
}