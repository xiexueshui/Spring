package com.hfut.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hfut.dao.IUserService;
import com.hfut.domain.User;
import com.hfut.mapper.UserMapper;

public class UserServiceImpl implements IUserService {
	@Autowired
	private UserMapper userMapper;

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	@Override
	public int insert(User u) {
		return userMapper.insert(u);
	}

	@Override
	public int delete(User u) {
		return userMapper.delete(u);
	}

	@Override
	public int update(User u) {
		return userMapper.update(u);
	}

	@Override
	public List<User> select(User u) {
		return userMapper.select(u);
	}
}
