public class Kinga extends MyException{
	public String name;

	public Kinga(String n){
		super("kinga");
		System.out.println("in Kinga ctor");
		severity = "hard";
		name = n;
	}

	public String toString(){
		System.out.println("in Kinga print");
		return "Kinga " + super.toString(3) + " " + name;
	}
}
