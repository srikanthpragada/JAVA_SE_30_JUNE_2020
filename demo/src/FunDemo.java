
public class FunDemo {
	
	public static int add(int n1, int n2) {
		return n1 + n2 ;
	}
	
	public static int total(int ... values) {
		int sum = 0;
		  for(int n : values)
			  sum += n;
		  
		  return sum;
	}

	public static void main(String[] args) {
		 
        System.out.println( add(10,20));
        System.out.println( total(1,2,3));
        System.out.println( total(13939,39393,192193,9494,39393));
        
	}

}
