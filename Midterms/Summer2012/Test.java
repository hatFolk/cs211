public class Test{
	public static void main(String[] args){
		int x = 7;
		float y = 8;
		Person p1 = new Person("Sally", 23);
		Person p2 = new Person("Joe", 11);
		Person p3 = p1;

		System.out.println(y);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

		p1 = changeMe(p1, x, y);

		System.out.println(x);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

		p1 = p1;
		p3 = p1;
		System.out.println(p2);
		System.out.println(p3);
	}

	public static Person changeMe(Person p, int x, float q){
		x--;
		p.setName("Bob");
		p = new Person("Kim", x);
		return p;
	}
}
