package com.jsp.controller;

import com.jsp.dto.User;
import com.jsp.service.UserService;

public class TestSaveUser {
	public static void main(String[] args) {
		User user = new User();
		user.setId(3);
		user.setName("rozi");
		user.setAge(20);
		user.setEmail("rozi@gmail.com");
		user.setPassword("rozi27");
		
		UserService user1 = new UserService();
		User user2 = user1.saveUser(user);
		if(user2!=null) {
			System.out.println("data  saved");
		}
		else {
			System.out.println("plz check the id");
		}
		
	}

}
