import java.io.*;
import java.util.ArrayList;
public abstract class MyClass{
	private static int age;
	public ArrayList salaries;
	
		public int compareTo(Object o){
			MyClass other = (MyClass) o;
			if (other.name == null){
				return 1;
			} else {
				return (Math.abs(name.compareTo(other.name)));
			}
		}

		private boolean find(Integer wage){
			for(int i = 0; i < salaries.size(); i++){
				if (salaries.contains(wage)){
					return true;
				}
			}
			return false;
		}

		private static void encode(int result){
			System.out.println(name);    // 1
			System.out.println(age);   	 // 2
			System.out.println(salaries);// 3
			System.out.println(result);	 // 4
		}

		protected void openFile(){
			BufferedReader buf = null;
			try{
				buf = new BufferedReader(new FileReader("input.txt"));
				System.out.println("great success!");
			}
			catch (Exception e){
				System.out.println("bad file!");
			}
			finally {
				System.out.println("close buffer!");
			}
		}
}
