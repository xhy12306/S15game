package com.xhy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xhy.dao.UserDao;
import com.xhy.pojo.User;

@Service(value = "UserServiceImpl")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public List<User> findAll() {
		System.out.println("UserServiceImpl");
		return userDao.findAll();
	}

}
