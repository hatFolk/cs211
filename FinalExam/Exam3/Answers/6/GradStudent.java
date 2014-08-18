public class GradStudent extends Student{
	public GradStudent(String n){
		super(n);
	}
	public void print(boolean argument){
		System.out.print("grad student ");
		super.print();
	}
}
