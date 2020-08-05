package streams;

import java.nio.file.Files;
import java.nio.file.Path;

public class SortLongNames {

	public static void main(String[] args) throws Exception {
    
		 Files.lines(Path.of("c:\\classroom\\players.txt"))
		      .distinct()
		      .filter(s -> s.length() >=4)
		      .sorted()
		      .forEach(System.out::println);

	}

}
