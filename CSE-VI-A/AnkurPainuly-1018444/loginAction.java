package net.codejava.struts;

import com.opensymphony.xwork2.ActionSupport;

public class loginAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String x,y;
	
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

	public String login() {
		return SUCCESS;
		
	}
	
	public void validate() {
		if(x==null||x.trim().equals("")) addFieldError("x","enter name");
		if(y==null||y.length()==0) addFieldError("y","enter password");
	}
	
	
	
	
}
