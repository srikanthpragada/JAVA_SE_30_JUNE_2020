package streams;

import java.nio.file.Files;
import java.nio.file.Path;

public class ListJavaPrograms {

	public static void main(String[] args) throws Exception {

		Files.walk(Path.of("c:\\classroom\\may14"))
		      .filter(p -> p.toString().endsWith(".java"))
		      .forEach(System.out::println);
	}

}
