package com.chinasofti.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.chinasofti.model.User;
import com.sun.crypto.provider.RSACipher;
import com.sun.org.apache.bcel.internal.generic.RETURN;

public class UserDaoImpl implements UserDao {
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int insertIntoUser(User user) {
		String sql ="insert into user (username,password,birthday,salary) values (?,?,?,?)";
		int i = jdbcTemplate.update(sql, new Object[]{
				user.getUsername(),
				user.getPassword(),
				user.getBirthday(),
				user.getSalary()
		});
		// TODO Auto-generated method stub
		return i;
	}

	@Override
	public int updateUserById(User user) {
		System.out.println(user.getId());
		String sql = "update user set username = ?,password = ?,birthday=?,salary=? where id =?";
		int i = jdbcTemplate.update(sql, new Object[]{
				user.getUsername(),
				user.getPassword(),
				user.getBirthday(),
				user.getSalary(),
				user.getId()
		});
		return i;
	}

	@Override
	public int deleteFromUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User queryById(int id) {
		String sqlString = "select * from user where id= ?";
		return jdbcTemplate.query(sqlString, new Object[]{id}, new ResultSetExtractor<User>(){

			@Override
			public User extractData(ResultSet arg0) throws SQLException,
					DataAccessException {
				while(arg0.next()){
					User user = new User();
					user.setUsername(arg0.getString("username"));
					user.setId(arg0.getInt("id"));
					user.setPassword(arg0.getString("password"));
					user.setBirthday(arg0.getDate("birthday"));
					user.setSalary(arg0.getDouble("salary"));
					return user;
				}
				return null;
			}
			
		});
		
	}

	@Override
	public List<User> queryAllUser() {
		String sql = "select * from user";
		return jdbcTemplate.query(sql, new RowMapper<User>(){
			@Override
			public User mapRow(ResultSet arg0, int arg1) throws SQLException {
					User user = new User();
					user.setUsername(arg0.getString("username"));
					user.setId(arg0.getInt("id"));
					user.setPassword(arg0.getString("password"));
					user.setBirthday(arg0.getDate("birthday"));
					user.setSalary(arg0.getDouble("salary"));
					return user;
			}
//			return null;
		});
//		return null;
	}

}
