package coll;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.TreeMap;

public class ListCustomers {

	public static void main(String[] args) throws Exception {
		var lines = Files.readAllLines(Path.of("c:\\classroom\\customers.txt"));
		var customers = new TreeMap<String, String>();

		for (String line : lines) {
			String parts[] = line.split(",");
			customers.put(parts[0], parts[1]);
		}

		for (String name : customers.keySet())
			System.out.printf("%-10s - %s\n", name, customers.get(name));
	}

}
