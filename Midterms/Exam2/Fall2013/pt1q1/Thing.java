import java.util.ArrayList;
public class Thing{
	private static int count = -1;
	public int size;
	public String name;

	public Thing(int count, String n){
		System.out.println("start Thing ctor");
		//tricky!
		size = count;
		name = n;
		System.out.println("in Thing ctor, size= " + size);
		System.out.println("in Thing ctor, name= " + name);
		System.out.println("in Thing ctor, count= " + this.count);
	}

	public void run(int times, ArrayList list){
		for(int i = 0; i < times; i++)
			if(i < count)
				System.out.println("list["+i+"]= " +  list.get(i).toString());
			else
				System.out.println("too large");
	}

	public void setSize(int s){
		size = s;
	}

	public static void setCount(int c){
		count = c;
	}

	public String toString(){
		return name + " " + size + " " + count;
	}
}
