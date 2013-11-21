import java.util.*;
public class Test{
	public static void main(String[] args){
		ArrayList list = new ArrayList();
		list.add(new Object());
		list.add(new String("Kinga"));
		list.add(new Integer(3));
		for(Object o: list){
			System.out.println(o.toString());
		}
	}
}
