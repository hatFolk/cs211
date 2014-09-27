import java.util.ArrayList;

public class MacBook extends Computer {
	private ArrayList<String> apps;

	public MacBook(String b, float p, ArrayList a){
		super(b, p);
		apps = a;
	}

	public String toString(){
		return super.toString() + apps.toString();
	}
}
