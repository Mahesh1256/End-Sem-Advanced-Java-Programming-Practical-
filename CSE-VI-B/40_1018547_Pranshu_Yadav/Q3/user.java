package Q3;

import com.opensymphony.xwork2.ActionSupport;
@SuppressWarnings("serial")

public class user extends ActionSupport{
	 private String user;
	 private int password;
	 
	 public String execute() {
		 return "success";
	 }
	 public void validate() {
		 if(name==null || name.trim().equals("")) {
			 addFieldError("name","The name is required");
		 }
	 }
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = assword;
	}
	 
	 
}