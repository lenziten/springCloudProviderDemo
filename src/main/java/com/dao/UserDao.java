package com.dao;

import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

import com.domain.User;

public interface UserDao {
	
	String getOne();
	
	Map<String,Object> queryById(String userId);
	
//	@Transactional
	Integer editById(User user);

}
