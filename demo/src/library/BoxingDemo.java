package library;

public class BoxingDemo {

	public static void main(String[] args) {
		 Object obj = 10;  // boxing, upcasting
         int v = (Integer) obj;		 // downcasting, unboxing 
		 
		 System.out.println(obj.getClass());

	}

}
