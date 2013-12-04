/*
 * 1. Complete the Person class below so that every Person object will ALWAYS
 * have a name that is more than five characters long, and an age that is
 * between 1 and 100 inclusive.
 */
public class Person{
	private String name;
	private int age = 1;
	public Person(String nameIn){
		if(nameIn.length() > 5){
			name = nameIn;
		} else {
			name = "yellow";
		}
	}
}
