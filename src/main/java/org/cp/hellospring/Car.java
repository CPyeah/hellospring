package org.cp.hellospring;

public class Car {
	
	private String brand;
	private String corp;
	private int price;
	private double maxSpeed;
	private double luntai;
	
	public Car() {
		super();
		System.out.println("car constructor...");
	}

	public Car(String brand, String corp, int price, double maxSpeed) {
		super();
		this.brand = brand;
		this.corp = corp;
		this.price = price;
		this.maxSpeed = maxSpeed;
	}

	public Car(String brand, String corp, int price) {
		super();
		this.brand = brand;
		this.corp = corp;
		this.price = price;
	}
	
	public Car(String brand, String corp, double maxSpeed) {
		super();
		this.brand = brand;
		this.corp = corp;
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", corp=" + corp + ", price=" + price + ", maxSpeed=" + maxSpeed + ", luntai="
				+ luntai + "]";
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCorp() {
		return corp;
	}

	public void setCorp(String corp) {
		this.corp = corp;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getLuntai() {
		return luntai;
	}

	public void setLuntai(double luntai) {
		this.luntai = luntai;
	}

}
