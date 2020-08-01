package coll;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.TreeSet;

public class SortWords2 {

	public static void main(String[] args) throws Exception {
		Path path = Path.of("c:\\classroom\\old_man.txt");
		String contents = Files.readString(path);
		String words[] = contents.split("\\W");  // Use non-word to split 

		TreeSet<String> sortedWords = new TreeSet<>();
		for (String w : words)
			if (w.trim().length() > 0)
				sortedWords.add(w);

		for (String w : sortedWords)
		{
			System.out.println(w);
			
		}
	}

}
