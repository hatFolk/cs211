public class Dog extends Animal implements Comparable{
	private String breed = "some dog";
	public int print(int num){
		System.out.println("Dog: "+breed);
		return num;
	}
	public String toString(){
		return breed;
	}
}
