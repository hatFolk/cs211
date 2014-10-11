import java.util.ArrayList;
// public class Exam extends Lion{
public class Exam2 extends Lion{
	public Exam2(String n){
		super();
	}

	public static void main(String[] args){
//		Animal A = new Animal(); <-- Cannot make object using Animal
		Lion l1 = new Lion();
//		Lion l2 = new Lion("roar"); <-- Lion does not have this ctor
//		Exam2 e1 = new Exam2(); <-- Exam2 has no default ctor
		Exam2 e1 = new Exam2("bark"); // <-- Replaced e1
		Exam2 e2 = new Exam2("purr");

		System.out.println(Lion.weight);
//		System.out.println(Lion.size); <-- size not static 
//		System.out.println(Lion.name); <-- name is private
//		System.out.println(Lion.count); <-- count is private

		System.out.println(l1.weight);
		System.out.println(l1.size);
//		System.out.println(l1.name); <-- name is private
//		System.out.println(l1.count); <-- count is private

//		System.out.println(Lion.eat()); <-- not static method. can't print void
//		System.out.println(Lion.sleep()); <-- not static method. can't print void
//		System.out.println(Lion.drink(new ArrayList())); <-- not static method. 
//		System.out.println(Lion.run()); <-- not static method. can't print void 
		System.out.println(Lion.stop());

//		System.out.println(l1.eat()); <-- can't print void 
//		System.out.println(l1.sleep()); <-- can't print void 
//		System.out.println(l1.drink()); <-- Method does not exist
//		System.out.println(l1.run()); <-- can't print void 
		System.out.println(l1.stop());
		
		e2.compareTo(e1);
		e2.compareTo("lion"); // <-- Depends on compareTo implementation
	}
}
