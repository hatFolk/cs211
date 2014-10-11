// No import to ArrayList
import java.util.ArrayList;
public interface Animal extends Comparable{
	//	public eat(); No method type. Picked void for Lion.java
	public void eat();
	public void sleep();
	public int drink(ArrayList list);
}
