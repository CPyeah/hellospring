package org.cp.spring.aop.xmlconfig;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


public class LoggingAspect {
	
	private void arithmeticCalculator() {}
	
	public void before(JoinPoint joinPoint) {
		String methodname = joinPoint.getSignature().getName();
		List<Object> args = Arrays.asList(joinPoint.getArgs());
		System.out.println("log-->"+methodname+" before: args: "+args);
	}
	
	public void after(JoinPoint joinPoint) {
		String methodname = joinPoint.getSignature().getName();
		List<Object> args = Arrays.asList(joinPoint.getArgs());
		System.out.println("log-->after: "+methodname);
	}
	
	public void afterRutern(JoinPoint joinPoint, Object result) {
		String methodname = joinPoint.getSignature().getName();
		System.out.println("log-->"+methodname+" result is : "+result);
	}
	
	public void afterThrowing(JoinPoint joinPoint, Exception ex) {
		String methodname = joinPoint.getSignature().getName();
		System.out.println("log-->"+methodname+" occurs exception : "+ex.getMessage());
	}
	
	public Object around(ProceedingJoinPoint proceedingJoinPoint) {
		Object result = null;
		String methodName = proceedingJoinPoint.getSignature().getName();
		try {
			System.out.println("log--> Around Begiin :"+methodName);
			result = proceedingJoinPoint.proceed();
			System.out.println("log--> Around End :"+methodName);
		} catch (Throwable e) {
			System.out.println("log--> Around Throwing :"+methodName);
			throw new RuntimeException();
		}
		System.out.println("log--> Around Return :"+methodName);
		return result;
	}

}
