package com.hfut.dao;

import java.util.List;

import com.hfut.domain.User;

public interface IUserService {
	int insert(User u);
	int delete(User u);
	int update(User u);
	List<User> select(User u);
}
