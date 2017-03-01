package com.chinasofti.dao;

import java.util.List;

import com.chinasofti.model.User;

public interface UserDao {
	int insertIntoUser(User user);
	
	int updateUserById(User user);
	
	int deleteFromUser(User user);
	
	User queryById(int id);
	
	List<User> queryAllUser();
}
