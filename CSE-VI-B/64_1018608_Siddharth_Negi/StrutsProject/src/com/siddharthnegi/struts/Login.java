package com.siddharthnegi.struts;

import org.apache.commons.lang3.StringUtils;
import com.opensymphony.xwork2.ActionSupport;

public class Login extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private User user = new User();

	public void validate() {
		if (StringUtils.isEmpty(user.getUserId())) {
			addFieldError(user.getUserId(), "User Id cannot be blank");
		}
		if (StringUtils.isEmpty(user.getPassword())) {
			addFieldError(user.getPassword(), "Password cannot be blank");
		}
	}

	public String execute() {
		if (user.getUserId().equals("siddharthnegi") && user.getPassword().equals("1018608")) {
			return SUCCESS;
		}
		return LOGIN;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
