package com.xhy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.xhy.pojo.User;

@Mapper
public interface UserDao {

	@Select("select id,name,age from t_user")
	public List<User> findAll();
}
