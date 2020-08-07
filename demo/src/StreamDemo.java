import java.util.Arrays;

public class StreamDemo {

	public static void main(String[] args) {
		var names = new String[] { "Python", "Java", "C#", "JavaScript", "C", "Ruby", "TypeScript" };

		Arrays.stream(names).filter(n -> n.length() >= 4)        // Predicate - boolean test(Object)
		                    .sorted()
		                    .forEach(System.out::println); // Consumer  - void accept(Object)
	}

}
