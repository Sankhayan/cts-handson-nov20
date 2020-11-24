package com.org.service;

import java.util.Arrays;
import java.util.List;

import com.org.model.User;

public class Service {

	public static void main(String[] args) {
		List<User> list = Arrays.asList(new User(1, "User1", "User1"), new User(2, "user2", "user2"),
				new User(3, "user3", "user3"), new User(4, "user4", "user4"), new User(5, "user500", "user500"));
		for (User i : list) {
			if (i.getName().length() > 5)
				System.out.println("ID: " + i.getId() + " Name: " + i.getName());
		}
	}

}
