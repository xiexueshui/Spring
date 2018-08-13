package com.hfut.server.provider.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hfut.domain.User;
import com.hfut.mapper.UserMapper;

@RestController
public class UserController {
	@Autowired
	UserMapper userMapper;
	@PostMapping("/user/insert")
	public int insert(@RequestBody User user) {
		System.out.println(user);
		return userMapper.insert(user);
	}
	@PostMapping("/user/update")
	public int update(@RequestBody User user) {
		return userMapper.update(user);
	}
	@PostMapping("/user/delete")
	public int delete(@RequestBody User user) {
		return userMapper.delete(user);
	}
	@PostMapping("/user/select")
	public List<User> select(@RequestBody User user) {
		return userMapper.select(user);
	}
}
