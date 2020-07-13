package oop;

abstract class Student {
	private String name, email;

	public Student(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public void print() {
		System.out.println(this.name);
		System.out.println(this.email);
	}
	
	public abstract int getMarks(); 
}

class JavaStudent extends Student {
	private int theoryMarks;

	public JavaStudent(String name, String email, int theoryMarks) {
		super(name, email);
		this.theoryMarks = theoryMarks;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(this.theoryMarks);
	}

	public int getMarks() {
		return this.theoryMarks;
	}
}

class PythonStudent extends Student {
	private int projectMarks;

	public PythonStudent(String name, String email, int projectMarks) {
		super(name, email);
		this.projectMarks = projectMarks;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(this.projectMarks);
	}

	public int getMarks() {
		return this.projectMarks;
	}
}


class JavaEEStudent extends JavaStudent {
	private int labMarks;

	public JavaEEStudent(String name, String email, int theoryMarks, int labMarks) {
		super(name, email,theoryMarks);
		this.labMarks = labMarks;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(this.labMarks);
	}

	public int getMarks() {
		return super.getMarks()  + this.labMarks;
	}
}


public class TestStudent {

	public static void main(String[] args) {
		Student s;

		s = new PythonStudent("Scott", "scott@yahoo.com", 89); // upcasting
		s.print(); // Runtime polymorphism 
		
		
		s = new JavaStudent("James", "james@gmail.com", 95);   // upcasting
		s.print();  // Runtime polymorphism
        if(	s.getMarks() >= 50)
        	System.out.println("Passed");
        else
        	System.out.println("Failed");
	}

}
