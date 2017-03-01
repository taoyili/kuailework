package com.chinasofti.action;

import org.junit.Test;

import com.chinasofti.model.User;
import com.chinasofti.model.Users;
import com.chinasofti.service.UsersService;
import com.opensymphony.xwork2.ActionSupport;

public class UsersAction extends ActionSupport {
	private Users user;
	private UsersService usersService;

	public UsersService getUsersService() {
		return usersService;
	}

	public void setUsersService(UsersService usersService) {
		this.usersService = usersService;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public String addUser() {
		int i = usersService.insert(user);
		return SUCCESS;
	}

	public String selectByPrimaryKey() {
		Users user = usersService.selectByPrimaryKey(1);
		System.out.println("aaaa:" + user.getName());
		return SUCCESS;
	}
}
