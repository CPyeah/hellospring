package org.cp.hellospring;

public class Person {
	String name;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("setName...");
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		System.out.println("setAge...");
		this.age = age;
	}
	public Person() {
		System.out.println("constructor...");
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
