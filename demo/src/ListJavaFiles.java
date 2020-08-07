import java.nio.file.Files;
import java.nio.file.Path;

public class ListJavaFiles {
	public static void main(String[] args) throws Exception {
		Files.walk(Path.of("c:\\classroom\\june30"))
		     .filter(p -> p.toString().endsWith(".java"))
			 .forEach(System.out::println);
	}
}
