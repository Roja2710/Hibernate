package com.jsp.service;

import java.util.List;

import com.jsp.dao.UserDao;
import com.jsp.dto.User;

public class UserService {
	UserDao dao = new UserDao();

	public User saveUser(User user) {
		return dao.saveUser(user);
	}

	public User updateUser(User user) {
		return dao.updateUser(user);
		
	}
	public User deleteUser(int id) {
		return dao.deleteUser(id);
	}
	public User getUserById(int id) {
		return dao.getUserById(id);
	}
    public List<User> getAllUser(){
    	return dao.getAllUser();
    }
    public User loginData(String email,String password) {
    	return dao.loginData(email, password);
    }
}
