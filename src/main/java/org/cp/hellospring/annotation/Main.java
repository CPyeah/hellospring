package org.cp.hellospring.annotation;

import org.cp.hellospring.annotation.controller.UserController;
import org.cp.hellospring.annotation.service.PenService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-annotation.xml");
		
		TestObject to = (TestObject) ctx.getBean("testObject");
		to.test();
		
		UserController userController = (UserController) ctx.getBean("userController");
		userController.execute(); 
		
		PenService penService = (PenService) ctx.getBean("penService");
		penService.add();
	}

}
