package com.xhy.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xhy.pojo.User;
import com.xhy.service.UserService;

@RestController
public class UserController {

	//	@Autowired
	//	private UserService userService;

	//	@RequestMapping(value = "/findAll", method = RequestMethod.GET)
	//	public List<User> findAll() {
	//		return userService.findAll();
	//	}

	@Resource(name = "UserServiceImpl")
	//	@Resource(type=UserServiceImpl.class)
	private UserService userService1;

	@RequestMapping(value = "/findAll1", method = RequestMethod.GET)
	public List<User> findAll1() {
		return userService1.findAll();
	}
}
