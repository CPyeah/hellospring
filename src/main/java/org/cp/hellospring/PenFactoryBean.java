package org.cp.hellospring;

import org.springframework.beans.factory.FactoryBean;

public class PenFactoryBean implements FactoryBean<Pen> {
	
	double price;

	@Override
	public Pen getObject() throws Exception {
		// TODO Auto-generated method stub
		return new Pen("CK", price);
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return Pen.class;
	}

	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return true;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
