package oop;

public class ExDemo {

	public static void main(String[] args) {

		int n = Integer.parseInt("abc");
		System.out.println(n);
		try {
			fun();
		} catch (Exception ex) {

		}
	}

	public static void fun() throws InterruptedException {
		Thread.sleep(1000);
	}
}
