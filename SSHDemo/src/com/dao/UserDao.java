package com.dao;


import com.bean.User;

public interface UserDao {
	public User queryByName(String name);
}
