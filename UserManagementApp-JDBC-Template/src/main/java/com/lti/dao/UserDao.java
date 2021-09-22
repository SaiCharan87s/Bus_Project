package com.lti.dao;

import java.util.List;

import com.lti.model.User;

public interface UserDao {

	User addAUser(User user);

	User updateAUser(User user);

	User findUserById(int userId);

	List<User> viewAllusers();
}
