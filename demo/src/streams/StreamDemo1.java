package streams;

import java.util.Arrays;

public class StreamDemo1 {

	public static void main(String[] args) {
		 int a[] = {19,20,88,44,55,66,87};
		 
		 // Arrays.stream(a).sorted().forEach( e -> System.out.println(e));
		 Arrays.stream(a)
		      .filter(e -> e % 2 == 0 )
		      .sorted()
		      .limit(3)
		      .forEach(System.out::println);

	}

}
