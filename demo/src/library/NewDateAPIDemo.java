package library;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class NewDateAPIDemo {

	public static void main(String[] args) {

		 LocalDate today = LocalDate.now();
		 System.out.println(today);
		 
		 LocalDate dob = LocalDate.of(1998, 10, 24);
		 System.out.println(dob.plusYears(22));

		 LocalTime now = LocalTime.now();
		 System.out.println(now);
		 LocalTime singtime = LocalTime.now(ZoneId.of("Asia/Dubai"));
		 System.out.println(singtime);
		 
	}

}
