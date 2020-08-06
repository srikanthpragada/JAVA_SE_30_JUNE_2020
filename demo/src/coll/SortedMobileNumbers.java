package coll;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.TreeSet;
import java.util.regex.Pattern;

public class SortedMobileNumbers {

	public static void main(String[] args) throws IOException {
		var contents = Files.readString(Path.of("c:\\classroom\\mobiles.txt"));
		var pattern = Pattern.compile("\\d+");
		var mobiles = new TreeSet<String>();

		var matcher = pattern.matcher(contents);

		while (matcher.find()) {
			if (matcher.group().length() == 10)
				mobiles.add(matcher.group());
		}

		for (String mobile : mobiles)
			System.out.println(mobile);

	}

}
