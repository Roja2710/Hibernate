package com.jsp.controller;

import com.jsp.dto.User;
import com.jsp.service.UserService;

public class TestLoginData {
	public static void main(String[] args) {
		UserService service = new UserService();
		User user = service.loginData("reddy@gmail.com", "reddy123");
		if(user != null) {
			System.out.println("home page");
			
		}
		else {
			System.out.println("pls check the email and password");
		}
		
	}

}
