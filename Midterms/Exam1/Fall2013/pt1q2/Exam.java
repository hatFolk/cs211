import java.util.ArrayList;
public class Exam extends Lion{
	public Exam2(String n){
		super();
	}

	public static void main(String[] args){
		Animal A = new Animal();
		Lion l1 = new Lion();
		Lion l2 = new Lion("roar");
		Exam2 e1 = new Exam2();
		Exam2 e2 = new Exam2("purr");

		System.out.println(Lion.weight);
		System.out.println(Lion.size);
		System.out.println(Lion.name);
		System.out.println(Lion.count);

		System.out.println(l1.weight);
		System.out.println(l1.size);
		System.out.println(l1.name);
		System.out.println(l1.count);

		System.out.println(Lion.eat());
		System.out.println(Lion.sleep());
		System.out.println(Lion.drink(new ArrayList()));
		System.out.println(Lion.run());
		System.out.println(Lion.stop());

		System.out.println(l1.eat());
		System.out.println(l1.sleep());
		System.out.println(l1.drink());
		System.out.println(l1.run());
		System.out.println(l1.stop());
		
		e2.compareTo(e1);
		e2.compareTo("lion");
	}
}
