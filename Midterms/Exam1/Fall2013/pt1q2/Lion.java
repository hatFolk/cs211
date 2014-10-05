import java.util.ArrayList;
public class Lion implements Animal{
	public static int weight = 8;
	public int size = 0;
	private String name = "none";
	private static int count;

	private void eat(){
		System.out.println("sleeping");
	}

	public void sleep(){
		double hours = 12/size;
		int f = hours;
	}

	public int drink(ArrayList list){
		return weight;
	}

	private static void run(){
		count += size;
	}

	public static int stop(){
		int v = 5;
		count = count - v;
	}
}
