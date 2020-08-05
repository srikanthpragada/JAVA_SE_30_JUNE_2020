package streams;

import java.nio.file.Files;
import java.nio.file.Path;

public class ListJavaFileContents {

	public static void printFile(Path file) {
		try {
			System.out.println("\n\n*****" + file + "*******\n");
			Files.lines(file).forEach(System.out::println);
		} catch (Exception ex) {

		}
	}

	public static void main(String[] args) throws Exception {

		Files.walk(Path.of("c:\\classroom\\may14"))
		   .filter(p -> p.toString().endsWith(".java"))
		   .forEach(ListJavaFileContents::printFile);
	}

}
