import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Pattern;

public class StreamDemo3 {

	public static void main(String[] args) throws Exception {
		 
		 double avg = 
  	    	 Files.lines(Path.of("c:\\classroom\\marks.txt"))
  	    	 .filter(line -> Pattern.matches("\\d+", line))
		     .mapToInt(Integer::parseInt)     // ToIntFunction - int applyAsInt(object)
		     .average()      // OptionalDouble 
		     .getAsDouble(); // double 
		 
		 System.out.println(avg);
		 
		 Files.lines(Path.of("c:\\classroom\\marks.txt"))
		      .filter(line -> Pattern.matches("\\d+", line))
	          .mapToInt(Integer::parseInt)
	          .filter(n ->  n > avg)
	          .sorted() 
	          .forEach(System.out::println);
	}

}
