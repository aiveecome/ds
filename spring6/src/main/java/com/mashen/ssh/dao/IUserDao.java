package com.mashen.ssh.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mashen.ssh.model.User;

@Repository(value="iuserDao")
public interface IUserDao {
	public void add(User user);
	
	public List<User> queryList();
	
	public List<User> queryId(int id);

}
