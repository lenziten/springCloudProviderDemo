package com.service;

import java.util.Map;

import com.domain.User;

public interface UserService {
	public Map<String,Object> queryById(String userId);
	
	public String getOne();
	
	public Integer updateById(User user);
}
