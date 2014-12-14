public class ChildExam extends FinalExam{
	private static int counter = 1;
	public ChildExam(String l, int c){
		super(l, c);
	}

	public void calculate(int times, int cutoff){
		System.out.println("timesChild: " + times);
		while(cutoff >= counter){
			super.calculate(times);
			cutoff--;
		}
	}

	public String toString(){
		return super.toString() + " " + counter;
	}
}
