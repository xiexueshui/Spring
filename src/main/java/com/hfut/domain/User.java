package com.hfut.domain;

import lombok.Data;

@Data
public class User {
	private Integer id;

	private String username;
	private String password;
	private String address;
	private Integer age;


}
