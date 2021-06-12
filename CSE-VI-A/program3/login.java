package net.codejava.struts;

import com.opensymphony.xwork2.ActionSupport;

public class login extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	String pass;
	
	public String login() {
		return SUCCESS;
		
	}
	
	
	
	
	
}
