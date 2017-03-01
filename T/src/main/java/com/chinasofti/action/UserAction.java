package com.chinasofti.action;

import com.chinasofti.model.User;
import com.chinasofti.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	private User user;
	private UserService userService;
	
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String addUser(){
		int i = userService.insertIntoUser(user);
		return SUCCESS;
	}
}
