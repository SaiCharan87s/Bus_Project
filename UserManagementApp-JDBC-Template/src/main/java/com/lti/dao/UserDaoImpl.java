package com.lti.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.lti.model.User;

public class UserDaoImpl implements UserDao {

	DataSource dataSource;
	JdbcTemplate jdbcTemplate;

	

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public User addAUser(User user) {
		String sql = "insert into tbl_users values(userId,email,password,phone,userName)"
				+ "value(hibernate_sequence.nextval,?,?,?,?)";
		jdbcTemplate = new JdbcTemplate(dataSource);
		int res=jdbcTemplate.update(sql, new Object[] { user.getUserId(),user.getEmail(),
				user.getPassword(), user.getPhone(),user.getUserName()});
		if(res>0) {
			System.out.println("User Successfully added");
			return user;
		}
		else {
			return null;
		}
		
	}

	public User updateAUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public User findUserById(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> viewAllusers() {
		// TODO Auto-generated method stub
		return null;
	}

}
