package oop;

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		return this.age;
	}
	
	@Override
	public String toString() {
	     return  this.name + "," + this.age;
	}
	
	@Override
	public boolean equals(Object obj) {
		   if (!(obj instanceof Person))
			   return false;
		   
		   Person other = (Person) obj;  // Downcasting
	       return this.name.equals(other.name) && 
	    		  this.age == other.age;
	}
}

public class TestPerson {
    public static void main(String args[]) {
    	Person p1 = new Person("James",55);
    	Person p2 = new Person("James",55);
    	Person p3 = new Person("James",45);
    	
    	System.out.println(p1 == p2);
    	System.out.println(p1.equals(p2));
    	System.out.println(p1.equals(p3));
    	
    	System.out.println(p1.hashCode());
    	System.out.println(p2.hashCode());
    	
    	System.out.println(p1.toString());
    	System.out.println(p1.equals("Abc"));
    	
    	
    }
}
