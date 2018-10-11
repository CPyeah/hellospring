package org.cp.hellospring;

import java.util.Map;

public class CTO {
	private String name;
	private Map<String, Car> cars;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Map<String, Car> getCars() {
		return cars;
	}
	public void setCars(Map<String, Car> cars) {
		this.cars = cars;
	}
	@Override
	public String toString() {
		return "CTO [name=" + name + ", cars=" + cars + "]";
	}
}
