public class MyException extends NullPointerException{
	/* NullPointerException will override toString()
	 * from Object class. It's toString looks like this:
	 * java.lang.ArithmeticException: / by zero
	 */
	private String message;
	public String severity;

	public MyException(String m){
		System.out.println("in MyEx ctor");
		message = m;
		severity = "medium";
	}

	public String toString(int i){
		System.out.println("in MyEx print");
		return severity + " " + message;
	}
}
