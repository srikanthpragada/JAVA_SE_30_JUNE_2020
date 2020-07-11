package oop;

public class TestAccount {

	public static void main(String[] args) {
		 Account a1;  // object reference
		 
		 a1 = new Account(101,"Scott");    // create object
		 a1.print();
		 
		 Account a2 = new Account(102,"Tom", 10000);
		 a2.print();
		 
 
	}

}
