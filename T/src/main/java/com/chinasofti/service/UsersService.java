package com.chinasofti.service;

import java.util.List;

import com.chinasofti.model.Users;

public interface UsersService {
	    int deleteByPrimaryKey(Integer id);

	    int insert(Users record);

	    int insertSelective(Users record);

	    Users selectByPrimaryKey(Integer id);

	    int updateByPrimaryKeySelective(Users record);

	    int updateByPrimaryKey(Users record);
}
