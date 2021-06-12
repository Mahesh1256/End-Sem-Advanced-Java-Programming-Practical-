package net.codejava.struts;

import com.opensymphony.xwork2.ActionSupport;

public class loginAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String x;
	public String getX() {
		return x;
	}


	public void setX(String x) {
		this.x = x;
	}


	public String getY() {
		return y;
	}


	public void setY(String y) {
		this.y = y;
	}


	private String y;
	
	
	public String login() {
		if(x=="ankur" && y=="123") {
		return SUCCESS;
		}
		else return "input";
		
	}
	
	
	
	
	
}
