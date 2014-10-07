public class Person{
	String name;
	int age;
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	public void setName(String name){
		this.name = name;
	}

	public String toString(){
		return this.name + " " + this.age;
	}
}
