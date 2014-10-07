//public MyClass{ <-- No Class keyword
public class MyClass{
	private String s;
	public static void main(String[] args){
//		Exam1 ex1 = new Exam1(); <-- This ctor doesn't exist
		Exam1 ex1 = new Exam1(3); // Random value
		Exam1 ex2 = new Exam1(3);
//		ex1 = "Hello"; <-- String cannot be assigned to ex1

		ex1.foo();
//		ex1.name = "David"; <-- name is a final var.
//		s = "Joe"; <-- s is not static.
//		ex3.format();

		System.out.println(ex1.name);
//		System.out.println(ex1.age); <-- age is private
	}
}
