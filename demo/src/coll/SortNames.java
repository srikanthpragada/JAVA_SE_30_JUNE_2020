package coll;

import java.util.ArrayList;

public class SortNames {

	public static void main(String[] args) {
		 ArrayList<String> al = new ArrayList<>();
		 
		 al.add("Scott");
		 al.add("Tom");
		 al.add("Ben");
		 
		 al.sort(null);
		 
		 for(String n : al)
			 System.out.println(n);
		 
	}

}
