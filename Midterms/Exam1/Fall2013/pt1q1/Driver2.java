import java.util.ArrayList;
public class Driver2 extends Thing{
	private String driverName = "undefined";
	public Driver2(){
		super(5, "none");
		System.out.println("in Driver ctor");
	}

	public Driver2(Thing thing, String d){
		super(thing.size, thing.name);
		driverName = d;
		System.out.println("in Driver ctor2");
	}

	public void run(ArrayList list){
		for(int i = 0; i < list.size(); i++)
			System.out.println("list["+i+"]= " + list.get(i).toString());
	}

	public static void main(String[] args){
		Thing t1 = new Thing(11, "thing1");
		Driver2 d2 = new Driver2();
		t1.setCount(2);
		ArrayList li = new ArrayList();
		li.add(t1);
		li.add(d2);
		li.add("hello");
		t1.run(5, li);
		d2.run(5, li);
	}
}
