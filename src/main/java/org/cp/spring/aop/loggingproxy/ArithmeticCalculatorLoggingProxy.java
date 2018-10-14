package org.cp.spring.aop.loggingproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

import org.cp.spring.aop.ArithmeticCalculator;

public class ArithmeticCalculatorLoggingProxy {
	
	public ArithmeticCalculatorLoggingProxy(ArithmeticCalculator ac) {
		this.ac = ac;
	}

	ArithmeticCalculator ac;
	
	public ArithmeticCalculator getProxy() {
		ArithmeticCalculator loggingProxy = null;
		
		ClassLoader classLoader = ac.getClass().getClassLoader();
		
		Class[] interfaces = new Class[] {ArithmeticCalculator.class};
		
		InvocationHandler h = new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				System.out.println("ArithmeticCalculatorLoggingProxy."+method.getName()+".args: "+Arrays.asList(args));
				Object result = method.invoke(ac, args);
				System.out.println("ArithmeticCalculatorLoggingProxy."+method.getName()+".reuslt: "+result);
				return result;
			}
		};
		
		loggingProxy = (ArithmeticCalculator) Proxy.newProxyInstance(classLoader, interfaces, h);
		
		return loggingProxy;
	}

	public void setAc(ArithmeticCalculator ac) {
		this.ac = ac;
	}

}
