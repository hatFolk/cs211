public class Exam1{
	public final String name = "Kinga";
	private int age;

	public Exam1(int a){
		age = a;
	}

	public String foo(){
		format();
		return name;
	}

	private void format(){
		age = 12;
	}
}
