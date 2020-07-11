package oop;

public class Product {
	// Instance variables
	private String name;
	private int price, qoh;
	
	// Class variable or static variable 
	private static int tax = 18;

	public Product(String name, int price, int qoh) {
		super();
		this.name = name;
		this.price = price;
		this.qoh = qoh;
	}
	
	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public void print() {
		System.out.println(this.name);
		System.out.println(this.price);
		System.out.println(this.qoh);
	}
	
	public void sell(int qty) {
		this.qoh -= qty;
	}
	
	public void purchase(int qty) {
		this.qoh += qty;
	}
	
	public int getSellingPrice() {
		return  this.price + this.price * Product.tax / 100; 
	}
	
	// static method 
	public static int getTax() {
		return  Product.tax; 
	}

}
