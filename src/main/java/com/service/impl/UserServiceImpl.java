package com.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDao;
import com.domain.User;
import com.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;
	

	@Override
	public Map<String, Object> queryById(String userId) {
		Map<String, Object> map = new HashMap<String,Object>();
//		map.put("result", "success");
		map = userDao.queryById(userId);
		return map;
	}


	@Override
	public String getOne() {
		// TODO Auto-generated method stub
		return userDao.getOne();
	}


	@Override
	public Integer updateById(User user) {
		if(null == user || StringUtils.isBlank(user.getUserId())){
			return 0;
		}
		return userDao.editById(user);
	}

}
