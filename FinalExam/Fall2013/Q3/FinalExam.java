public class FinalExam{
	private String location;
	private static int count;

	public FinalExam(String l, int c){
		location = l;
		count = c;
	}

	public String calculate(int times){
		System.out.println(location + " timesParent: " + times + ", count: " + count);
		count = count + 1;
		if (count < times)
			calculate(times - 1);
		return "" + times;
	}

	public String toString(){ return location + " " + count;}
}
