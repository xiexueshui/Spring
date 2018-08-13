package com.hfut.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.hfut.domain.User;
@Mapper
@Repository
public interface UserMapper {
public int insert(User u);
public int delete(User u);
public int update(User u);
public List<User> select(User u);
}
