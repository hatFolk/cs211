public class Writer{
	public static int count = -1;
	private int size;

	public Writer(){
			size = 33;
	}

	public Writer(int size, int c){
		size = size;
		count = count + c;
	}

	public String toString(){
		return "writer\n" + size;
	}
}
