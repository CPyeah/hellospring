package org.cp.hellospring;

public class Dog {

	String dogName;

	public Dog() {
		super();
		System.out.println("dog  constructor...");
	}
	
	public void birth() {
		System.out.println("dog birth...");
	}
	
	public void die() {
		System.out.println("dog die...");
	}
	

	public String getDogName() {
		return dogName;
	}

	public void setDogName(String dogName) {
		System.out.println("set dogName is "+ dogName);
		this.dogName = dogName;
	}

	@Override
	public String toString() {
		return "Dog [dogName=" + dogName + "]";
	}
	
	
}
