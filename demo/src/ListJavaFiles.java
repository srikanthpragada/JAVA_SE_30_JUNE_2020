import java.nio.file.Files;
import java.nio.file.Path;

public class ListJavaFiles {

	public static void printFile(Path path) {
		try {
			System.out.println(path.toString());
			System.out.println("=".repeat(50));
			Files.lines(path)
			     .forEach(System.out::println);
			System.out.println("\n");
		} catch (Exception ex) {

		}
	}

	public static void main(String[] args) throws Exception {
		Files.walk(Path.of("c:\\classroom\\june30"))
		     .filter(p -> p.toString().endsWith(".java"))
			 .forEach(ListJavaFiles::printFile);
	}
}
