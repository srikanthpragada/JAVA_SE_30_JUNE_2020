package oop;

public class TestProduct {

	public static void main(String[] args) {
		 Product p = new Product("Bose Speakers",25400,10);
		 p.sell(5);
		 System.out.println(p.getSellingPrice());
		 p.print();
		 
		 System.out.println(Product.getTax());
		 
	}

}
