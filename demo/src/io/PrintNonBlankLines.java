package io;

import java.io.BufferedReader;
import java.io.FileReader;

public class PrintNonBlankLines {

	public static void main(String[] args) throws Exception {
		 
		FileReader fr = new FileReader("c:\\classroom\\old_man.txt");
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
			String line = br.readLine();
			if(line == null)  // EOF
				break;
			if (line.length() > 0)
			   System.out.println(line.toUpperCase());
		}
		
		fr.close(); 
	}

}
