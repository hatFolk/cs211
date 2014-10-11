public class Driver extends Thing{
	private String driverName = "undefined";

	public Driver(){
		super(5, "none");
		System.out.println("in Driver ctor");
	}

	public Driver(Thing thing, String d){
		super(thing.size, thing.name);
		driverName = d;
		System.out.println("in Driver ctor2");
	}

	public static void main(String[] args){
		Thing t1 = new Thing(11, "thing1");
		Thing t2 = new Thing(2, "thing2");
		Driver d1 = new Driver();
		Driver d2 = new Driver(t1, "driver2");

		d1.setCount(14);
		d2.setSize(7);
		System.out.println("t2: " + t2.toString());
		System.out.println("d1: " + d1.toString() + " " + d1.driverName);
		System.out.println("d2: " + d2.toString() + " " + d2.driverName);
	}
}
