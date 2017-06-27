package com.mashen.ssh.service;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mashen.ssh.dao.IUserDao;
import com.mashen.ssh.model.User;
@Transactional(rollbackFor=java.lang.Exception.class)
@Service("userServiceImp")
public class UserServiceImp implements IUserService {
	@Resource(name="iuserDao")
	private IUserDao userDao;
	
	@Resource(name="sqlSessionFactory")
	private SqlSessionFactory sqlSessionFactory;

	public void add() {
 

		
	}

	public void addTwo(int i) {
		// TODO Auto-generated method stub
		
	}

	public List<User> query() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> queryId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
