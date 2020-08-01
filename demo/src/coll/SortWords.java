package coll;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.TreeSet;

public class SortWords {

	public static void main(String[] args) throws Exception  {
		FileReader fr = new FileReader("c:\\classroom\\old_man.txt");
		BufferedReader br = new BufferedReader(fr);
		TreeSet<String> sortedWords = new TreeSet<>();
		
		while(true) {
			String line = br.readLine();
			if(line == null)  // EOF
				break;
			
			String words [] = line.split(" ");
			for(String w : words)
				sortedWords.add(w);
		}
		
		fr.close();
		
		for(String w : sortedWords)
			System.out.println(w);

	}

}
