package org.cp.hellospring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if("herry".equalsIgnoreCase(beanName)) {
			System.out.println("before init");
			((Dog)bean).setDogName("xiaobai");
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if("Dog".equalsIgnoreCase(bean.getClass().getName())) {
			System.out.println("after init");
		}
		return bean;
	}

}
