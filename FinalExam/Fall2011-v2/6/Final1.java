import java.util.ArrayList;
public class Final1{
	public static void main(String[] args){
		ArrayList<Person> people = new ArrayList<Person>();
		people.add(new Person("Kinga"));
		people.add(new Student("David"));
		people.add(new GradStudent("John"));

		for(int i = 0; i < 3; i++){
			people.get(i).print();
			System.out.println("");
		}
	}
}
