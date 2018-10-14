package org.cp.spring.aop.annotation;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
@Aspect
@Component
public class ValidationAspect {
	
	@Before("execution(public int org.cp.spring.aop.annotation.ArithmeticCalculator.*(int, int))")
	public void validate(JoinPoint joinPoint) {
		System.out.println("ValidationAspect validate method "+joinPoint.getSignature().getName()
				+" args is "+Arrays.asList(joinPoint.getArgs()));
	}

}
