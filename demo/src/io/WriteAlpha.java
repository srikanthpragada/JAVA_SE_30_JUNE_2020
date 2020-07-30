package io;

import java.io.File;
import java.io.FileWriter;

public class WriteAlpha {

	public static void main(String[] args) throws Exception {
		
		File f = new File("c:\\classroom\\june30\\alpha.txt");
		if(f.exists()) {
		   System.out.println("File is existing!");
           return;
		}
		
		try (FileWriter fw = new FileWriter(f)) {

			for (int ch = 65; ch <= 90; ch++)
				fw.write(ch);
		}

	}

}
