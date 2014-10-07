public class Exam1{
	public int intVal;
	private Address address;

	public static void main(String[] args){
		Exam1 exam = new Exam1(5, "Cherry Lane");
		Exam1 exam2 = update(exam, exam.getIntVal(), exam.getAddress());
		System.out.println(exam);
		System.out.println(exam2);
		int x = 0;
		System.out.println(7 / x);
	}

	public Exam1(int intValIn, String addressIn){
		System.out.println("ctor 1");
		intVal = intValIn;
		address = new Address(addressIn);
	}

	public Exam1(int intValIn, Address addressIn){
		System.out.println("ctor 2");

		intVal = intValIn;
		address = addressIn;
	}

	public String toString(){
		System.out.println("intVal: " + intVal);
		//prints out the entire String that was
		//passed to the Address constructor
		System.out.println("Address: " + address);
		return "intVal: " + intVal + "\nAddress: " + address+"\n";
	}

	public static Exam1 update(Exam1 ex, int intValArg, Address addressArg){
		intValArg = 3;
		addressArg = new Address("Pine Tree Lane");
		ex = new Exam1(intValArg, addressArg);
		return ex;
	}
	// Assume standard getters and setters as seen in class
	public Address getAddress(){
		return this.address;
	}

	public int getIntVal(){
		return this.intVal;
	}
}
