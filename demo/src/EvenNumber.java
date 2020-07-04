import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number :");
		int num = s.nextInt(); // Take an int from keyboard

		if (num % 2 == 0)
			System.out.println("Even Number");
		else
			System.out.println("Odd Number");

	}

}
