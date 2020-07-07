package oop;

public class Account {
	// instance variables 
    private int acno;
    private String customer;
    private double balance;
    
    // Methods 
    public void open(int no, String name) {
    	acno = no;
    	customer = name;
    	balance = 0; 
    }
    
    public void print() {
    	System.out.println(acno);
    	System.out.println(customer);
    	System.out.println(balance);
    }
}
