package streams;

import java.nio.file.Files;
import java.nio.file.Path;

public class SortNamesReverse {

	public static void main(String[] args) throws Exception {
    
		 // Sort in reverse order 
		 Files.lines(Path.of("c:\\classroom\\players.txt"))
              .sorted( (s1,s2) -> s2.compareTo(s1))
		      .forEach(System.out::println);
		 
		 // Sort by length of names
		 Files.lines(Path.of("c:\\classroom\\players.txt"))
          .sorted( (s1,s2) -> s1.length() - s2.length())
	      .forEach(System.out::println);

	}

}
