import java.util.ArrayList;
// There's no implementation of the Comparable class
public class Lion implements Animal{
	public static int weight = 8;
	public int size = 0;
	private String name = "none";
	private static int count;

	// private void eat(){ <-- Change visibility
	public void eat(){
		System.out.println("sleeping");
	}

	public void sleep(){
		double hours = 12/size;
		// int f = hours; <-- Improper casting
		int f = (int) hours;
	}

	public int drink(ArrayList list){
		return weight;
	}

	// private static void run(){ <-- Change static to non-static
	public void run(){
		count += size;
	}

	public static int stop(){
		int v = 5;
		count = count - v;
		// Forgot a return statement
		return count;
	}

	// As required by Comparable
	public int compareTo(Object o){
		return 1; // <-- DO NOT DO THIS IN REAL LIFE
		// DO THIS PROPERLY IN REAL LIFE.
		// http://docs.oracle.com/javase/7/docs/api/java/lang/Comparable.html
	}
}
