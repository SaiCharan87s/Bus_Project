package com.lti;

import java.time.LocalDate;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.dao.UserDao;
import com.lti.model.User;

public class TestDao {

	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		UserDao dao = (UserDao) context.getBean("userDao");
		List<User> users = dao.viewAllusers();
		for (User u : users) {
			System.out.println(u.getUserId() + " " + u.getUserName());
		}
	}

	@Test
	public void testAddUser() {
		User user = new User(1001, "kevin", LocalDate.of(1999, 10, 11), "Kevin@lit.com", "1234567890", "kevi@1234");
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		UserDao dao = (UserDao) context.getBean("userDao");
		dao.addAUser(user);
	}
}
