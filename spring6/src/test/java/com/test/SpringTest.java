package com.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mashen.ssh.dao.IUserDao;
import com.mashen.ssh.model.User;
import com.mashen.ssh.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations=("classpath:applicationContext.xml"))
public class SpringTest {
	
	@Resource(name="userServiceImp")
	private IUserService userService;

	@Test
	public void test4(){
		userService.add();
	}
}
