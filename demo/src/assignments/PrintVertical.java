package assignments;

import java.util.Scanner;

public class PrintVertical {

	public static void main(String[] args) {
		 
		 Scanner s = new Scanner(System.in);
		 String st = s.nextLine();
		 
		 for(int i = 0; i < st.length(); i ++)
			 System.out.println(st.charAt(i));
	}

}
