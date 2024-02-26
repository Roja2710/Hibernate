package com.jsp.controller;

import com.jsp.dto.User;
import com.jsp.service.UserService;

public class TestUpdateUser {
	public static void main(String[] args) {
		User user = new User();
		user.setId(1);
		user.setName("reddy");
		user.setAge(24);
		user.setEmail("reddy27@gmail.com");
		user.setPassword("reddy123");
		UserService service = new UserService();
		User user1 = service.updateUser(user);
		
		if(user != null) {
			System.out.println("data updated");
		}
		else {
			System.out.println("pls check the id");
		}
	}

}
