package org.cp.spring.jdbc;


public class Area {

	
	int id;
	String name;
	int priority;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	@Override
	public String toString() {
		return "Area [id=" + id + ", name=" + name + ", priority=" + priority + "]";
	}
}
