import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Pattern;

public class StreamDemo2 {

	public static void main(String[] args) throws Exception {
		 
		Files.lines(Path.of("c:\\classroom\\names.txt"))
		     .filter(n ->  Pattern.matches("[a-zA-Z ]+",n))
		     .sorted()
		     .forEach(System.out::println);
	}

}
