package com.jsp.controller;

import com.jsp.dto.User;
import com.jsp.service.UserService;

public class TestDeleteUser {
	public static void main(String[] args) {
		UserService service = new UserService();
		User user = service.deleteUser(2);
		if(user!=null) {
			System.out.println("data deleted");
		}
		else {
			System.out.println("plz check the id");
		}
	}

}
