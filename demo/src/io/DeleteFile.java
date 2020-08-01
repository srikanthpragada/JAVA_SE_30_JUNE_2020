package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteFile {

	public static void main(String[] args) throws IOException {
		
		Path path = Paths.get("c:\\classroom\\june30\\test.txt");
		System.out.println(path.getClass());
		Files.delete(path);

	}

}
