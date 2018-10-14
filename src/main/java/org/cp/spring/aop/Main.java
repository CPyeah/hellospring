package org.cp.spring.aop;

import org.cp.spring.aop.loggingproxy.ArithmeticCalculatorLoggingProxy;

public class Main {

	public static void main(String[] args) {
		ArithmeticCalculator ac = new ArithmeticCalculatorImlp();
		ArithmeticCalculator proxy = new ArithmeticCalculatorLoggingProxy(ac).getProxy();
		
		int result;
		
		result = ac.add(4, 7);
		System.out.println("result: " + result);
		
		result = ac.mul(7, 8);
		System.out.println("result: " + result);
		
		System.out.println("------proxy------");
		
		result = proxy.add(4, 7);
		
		result = proxy.mul(7, 8);

	}

}
