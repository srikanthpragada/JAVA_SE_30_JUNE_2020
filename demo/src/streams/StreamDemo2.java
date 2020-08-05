package streams;

import java.util.Arrays;

public class StreamDemo2 {

	public static void main(String[] args) {
		int a[] = { 19, 20, 88, 44, 55, 66, 87 };

		var avg = Arrays.stream(a).average().getAsDouble();
		Arrays.stream(a).filter(e -> e >= avg)
		                .sorted()
		                .forEach(System.out::println);

	}

}
