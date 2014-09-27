import java.util.*;
public class Final{
	public static void main(String[] args){
		ArrayList listBasic = new ArrayList();
		ArrayList<Animal> listAnimal = new ArrayList<Animal>();
		ArrayList<Dog> listDog = new ArrayList<Dog>();

		Object o1 = new Object();
		Animal a1 = new Animal();
		Dog d1 = new Dog();

		listBasic.add(o1);
		listBasic.add(a1);
		listBasic.add(d1);
//		listAnimal.add(o1);
		listAnimal.add(a1);
		listAnimal.add(d1);
//		listDog.add(o1);
//		listDog.add(a1);
		listDog.add(d1);

		for(int i = 0; i < listBasic.size(); i++){
			System.out.println(listBasic.get(i));
		}
		for(int i = 0; i < listAnimal.size(); i++){
			listAnimal.get(i).print();
		}
	}
}
