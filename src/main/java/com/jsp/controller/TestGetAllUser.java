package com.jsp.controller;

import java.util.List;

import com.jsp.dto.User;
import com.jsp.service.UserService;

public class TestGetAllUser {
	public static void main(String[] args) {
		UserService service = new UserService();
		List<User> user = service.getAllUser();
		if (user.size() > 0) {
			for (User user1 : user) {
				System.out.println("User Id: " + user1.getId());
				System.out.println("User Name: " + user1.getName());
				System.out.println("User Age: " + user1.getAge());
				System.out.println("User Email: " + user1.getEmail());
				System.out.println("User Password: " + user1.getPassword());
				System.out.println("___________  ******_____________");

			}
		} 
		else {
			System.out.println("plz check the id");
		}
	}

}
