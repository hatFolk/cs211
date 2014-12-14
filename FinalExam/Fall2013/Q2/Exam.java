public abstract class Exam implements Comparable{
	private int age;
	public ArrayList list;
	public static String type;
	private static boolean flag;

	public Exam(int ageIn){
		age = ageIn;
	}

	private void func1(){
	}

	private static int func2(){
		return 0;
	}

	public static void func3(){
	}

	public int func4(){
		return 1;
	}

	public boolean something (Exam o){
		return false;
	}
}
