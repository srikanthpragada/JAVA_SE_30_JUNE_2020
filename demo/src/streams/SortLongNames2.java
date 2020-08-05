package streams;

import java.nio.file.Files;
import java.nio.file.Path;

public class SortLongNames2 {

	public static void main(String[] args) throws Exception {
    
		 var avglength = 
			   Files.lines(Path.of("c:\\classroom\\players.txt"))
		      .mapToInt( v -> v.length())
		      .average()
		      .getAsDouble();
		   
		  Files.lines(Path.of("c:\\classroom\\players.txt"))
		       .filter(v -> v.length() > avglength)
		       .forEach(System.out::println);
	}

}
