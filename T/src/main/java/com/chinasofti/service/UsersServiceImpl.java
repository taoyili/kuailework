package com.chinasofti.service;

import com.chinasofti.dao.UsersMapper;
import com.chinasofti.model.Users;

public class UsersServiceImpl implements UsersService {
	private UsersMapper usersMapper;

	public UsersMapper getUsersMapper() {
		return usersMapper;
	}

	public void setUsersMapper(UsersMapper usersMapper) {
		this.usersMapper = usersMapper;
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		int i = usersMapper.deleteByPrimaryKey(id);
		return i;
	}

	@Override
	public int insert(Users record) {
		int i = usersMapper.insert(record);
		return 0;
	}

	@Override
	public int insertSelective(Users record) {
		int i = usersMapper.insertSelective(record);
		return i;
	}

	@Override
	public Users selectByPrimaryKey(Integer id) {
		Users users = usersMapper.selectByPrimaryKey(id);
		return users;
	}

	@Override
	public int updateByPrimaryKeySelective(Users record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Users record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
