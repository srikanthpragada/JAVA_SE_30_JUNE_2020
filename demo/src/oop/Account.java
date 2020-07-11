package oop;

public class Account {
	// instance variables
	private int acno;
	private String customer;
	private double balance;

	// Constructor
	public Account(int acno, String customer) {
		this.acno = acno;
		this.customer = customer;
	}

	public Account(int acno, String customer, double balance) {
		this(acno,customer);   // call another constructor 
		this.balance = balance;
	}

	public void print() {
		System.out.println(this.acno);
		System.out.println(this.customer);
		System.out.println(this.balance);
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void withdraw(double amount) {
		this.balance -= amount;
	}
}
