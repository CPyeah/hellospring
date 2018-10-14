package org.cp.spring.aop.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Spring-AOP.xml");
		
		ArithmeticCalculator ac = ctx.getBean(ArithmeticCalculator.class);
		System.out.println(ac);
		int result = ac.sub(99, 77);
		
		System.out.println("result is "+result);
		
		result = ac.div(88, 0);
		System.out.println("result is "+result);

	}

}
