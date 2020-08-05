package streams;

import java.nio.file.Files;
import java.nio.file.Path;

public class ListLongestNames {

	public static void main(String[] args) throws Exception {
		 var maxLength = 
			   Files.lines(Path.of("c:\\classroom\\players.txt"))
		      .mapToInt(v -> v.length())
		      .max()
		      .getAsInt();
		   
		  Files.lines(Path.of("c:\\classroom\\players.txt"))
		       .filter(v -> v.length() == maxLength)
		       .forEach(System.out::println);
	}

}
