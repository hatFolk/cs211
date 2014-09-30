// This is for Question 3
public class Driver{
	public static class Person{
		String name;
		int age;
		public Person(){
		}
		
		public Person(String name, int age){
			this.name = name;
			this.age = age;
		}

		public String toString(){
			return this.name + " " + this.age;
		}
	}

	private static Person person = new Person("n", 0);

	public static void main(String[] args){
		int x = 2;
		String name = "John";
		Person p1 = new Person(name, 11);
		Person p2 = p1;
		Person p3 = new Person(name, 11);

		System.out.println(x);
		System.out.println(name.toString());
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(person);
		System.out.println(p1 == p3);
		System.out.println(p1 == p2);

		p3 = change(name, x, p1);

		System.out.println(x);
		System.out.println(name.toString());
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(person);
	}

	public static Person change(String name, int y, Person p){
		person.name = name;
		name = "Bob";
		p.name = name;
		y++;
		p.age = y;
		p = new Person("Liz", 10);
		return p;
	}
}
