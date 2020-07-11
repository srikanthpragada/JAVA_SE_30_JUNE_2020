package oop;

class Student {
	private String name, email;

	public Student(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public void print() {
		System.out.println(this.name);
		System.out.println(this.email);
	}
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

public class TestStudent {

	public static void main(String[] args) {
		Student s;

		s = new PythonStudent("Scott", "scott@yahoo.com", 89); // upcasting
		s = new JavaStudent("James", "james@gmail.com", 95);   // upcasting
		
		JavaStudent js;
		
		if (s instanceof JavaStudent)
		    js = (JavaStudent) s;   // Downcasting 

	}

}
