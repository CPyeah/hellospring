package org.cp.hellospring;

public class Pen {
	
	private String color;
	
	private double price;

	public String getColor() {
		return color;
	}

	public Pen(String color, double price) {
		super();
		this.color = color;
		this.price = price;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pen [color=" + color + ", price=" + price + "]";
	}

}
