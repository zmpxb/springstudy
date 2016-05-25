package com.xiaozl.spring.hellworld;

public class Car {

	private String company;
	private String brand;

	private int maxSpeed;
	private float price;

	public Car(){

	}

	public Car(String company, String brand, float price) {
		super();
		this.company = company;
		this.brand = brand;
		this.price = price;
		System.out.println("构造器1");
	}

	public Car(String company, String brand, int maxSpeed) {
		super();
		this.company = company;
		this.brand = brand;
		this.maxSpeed = maxSpeed;
		System.out.println("构造器2");
	}

	/**
	 * 到底使用哪一个构造器来注入是beans.xml中构造注入的时候有个type来区分的。
	 * @param company
	 * @param brand
	 * @param maxSpeed
     * @param price
     */
	public Car(String company, String brand, int maxSpeed, float price) {
		super();
		this.company = company;
		this.brand = brand;
		this.maxSpeed = maxSpeed;
		this.price = price;
		System.out.println("构造器3");
	}

	public void init1(){
		System.out.println("init-----");
	}

	public void destroy1(){
		System.out.println("destroy-----");
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [company=" + company + ", brand=" + brand + ", maxSpeed="
				+ maxSpeed + ", price=" + price + "]";
	}
}
