import java.util.ArrayList;

public class Pen extends Writer{
	private int color = 7;

	public Pen(int c, int q, int r){
		super(q, r);
		color = c;
		count++;
	}

	public Pen(int c){
		Writer writer = new Writer(0,0);
		color = c;
		count++;
	}

	public String toString(){
		System.out.println(super.toString());
		return "pen \n" + color;
	}

	public static void main(String[] args){
		Writer w1 = new Writer(4, 5);
		Pen p1 = new Pen(6, 7, 8);
		Writer w3 = (Writer) p1;
		Pen p2 = new Pen(15);
		ArrayList list = new ArrayList();
		System.out.println(count);
		list.add(w1);
		list.add(p1);
		list.add(p2);
		list.add(w3);
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i).toString());
		}
	}
}
