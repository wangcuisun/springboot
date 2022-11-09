package com.wang;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wang.dao.UserDao;
import com.wang.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Springboot05MybatisPlusApplicationTests {

	@Autowired
	private UserDao userDao;

	@Test
	void contextLoads() {
		User user = new User();
		user.setName("黏黏");
		user.setAge(2);
		int result = userDao.insert(user);
		System.out.println(result);
	}

	@Test
	void test() {
		List<User> users = userDao.selectList(null);
		System.out.println(users);
	}

	@Test
	void test2() {
		IPage<User> page = new Page<User>(1, 5);
		userDao.selectPage(page, null);
	}

}
