package library;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatDemo {

	public static void main(String[] args) {
		 
		Date d = new Date();
		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println(df.format(d));
		
		SimpleDateFormat sdf = new SimpleDateFormat("d-M-Y H:m:s");
		System.out.println(sdf.format(d));

	}

}
