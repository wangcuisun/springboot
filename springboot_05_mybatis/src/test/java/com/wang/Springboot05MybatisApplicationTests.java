package com.wang;

import com.wang.dao.UserDao;
import com.wang.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Springboot05MybatisApplicationTests {

	@Autowired
	private UserDao userDao;

	@Test
	void contextLoads() {
		List<User> users = userDao.selectAll();
		System.out.println(users);
	}

}
