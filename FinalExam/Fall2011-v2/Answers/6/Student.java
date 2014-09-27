public class Student extends Person{
	public Student (String n){
		super(n);
	}
	public void print(){
		System.out.print("student ");
		super.print();
	}
}
