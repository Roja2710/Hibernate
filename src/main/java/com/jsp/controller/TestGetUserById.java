package com.jsp.controller;

import com.jsp.dto.User;
import com.jsp.service.UserService;

public class TestGetUserById {
	public static void main(String[] args) {
		UserService service = new UserService();
		User user = service.getUserById(1);
		if(user != null) {
			System.out.println("User Id : "+user.getId());
			System.out.println("User Name : "+user.getName());
			System.out.println("User Age : "+user.getAge());
			System.out.println("User Email : "+user.getEmail());
			System.out.println("User Password : "+user.getPassword());
		}
		else {
			System.out.println("pls check the id");
		}
	}

}
