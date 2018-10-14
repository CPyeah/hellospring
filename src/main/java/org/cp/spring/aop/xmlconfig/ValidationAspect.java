package org.cp.spring.aop.xmlconfig;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

public class ValidationAspect {
	
	public void validate(JoinPoint joinPoint) {
		System.out.println("ValidationAspect validate method "+joinPoint.getSignature().getName()
				+" args is "+Arrays.asList(joinPoint.getArgs()));
	}

}
