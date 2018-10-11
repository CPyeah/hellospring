package org.cp.hellospring.annotation.controller;

import org.cp.hellospring.annotation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
	@Autowired
	UserService userService;

	public void execute() {
		System.out.println("UserController Execute...");
		userService.add();
	}
}
