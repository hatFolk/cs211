public class Driver2{
	public static void main(String[] args){
		Exception excep = null;
		int[] denom = {0, -1, 1, 3};
		for(int i = 0; i < denom.length; i++){
			try{
				doDivide(5, denom[i]);
				System.out.println("great success");
			}catch(Kinga e){
				System.out.println("Kinga :-(");
				excep = e;
			}catch(MyException e){
				excep = e;
				System.out.println("MyEx :-(");
			}catch(Exception e){
				excep = e;
				System.out.println("other :-(");
			}
			System.out.println(excep.toString());
		}
	}

	public static void doDivide(int x, int y){
		if(y==1)
			throw new MyException("pointless" + "division!");
		else if(y==-1)
			throw new Kinga("also a waste");
		else
			System.out.println("Div: " + (x/y));
	}
}
