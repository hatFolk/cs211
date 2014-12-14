public class Driver{
	public static void main(String[] args){
		int x = 12;
		String string = "yellow";
		FinalExam f1 = new FinalExam(string, x);
		string = "pink";
		x = 3;
		ChildExam c1 = new ChildExam(string, x);
		x++;
		ChildExam c2 = c1;
		string = f1.calculate(5);
		c1 = new ChildExam("blue", 3);
		c1.calculate(2);
		c1.calculate(2, 2);
		System.out.println(f1.toString());
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
}
