package com.chinasofti.service;

import java.util.List;

import com.chinasofti.dao.UserDao;
import com.chinasofti.model.User;

public class UserServiceImpl implements UserService {
	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public int insertIntoUser(User user) {
		int i = userDao.insertIntoUser(user);
		return i;
	}

	@Override
	public int updateUserById(User user) {
		int i = userDao.updateUserById(user);
		return i;
	}

	@Override
	public int deleteFromUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User queryById(int id) {
		User user = userDao.queryById(id);
		return user;
	}

	@Override
	public List<User> queryAllUser() {
		List<User> list = userDao.queryAllUser();
		System.out.println(list.size());
		return list;
	}

}
