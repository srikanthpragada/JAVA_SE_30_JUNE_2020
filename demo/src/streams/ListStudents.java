package streams;

import java.nio.file.Files;
import java.nio.file.Path;

public class ListStudents {

	public static boolean hasPassed(String data) {
		String parts [] = data.split(",");
		if (Integer.parseInt(parts[1]) < 50)
			return false;
		
		if (Integer.parseInt(parts[2]) < 50)
			return false;
		
		return true; 
	}
	public static void main(String[] args) throws Exception {

		 Files.lines(Path.of("c:\\classroom\\students.txt"))
		      .filter(ListStudents::hasPassed)
		      .forEach(System.out::println);

	}

}
