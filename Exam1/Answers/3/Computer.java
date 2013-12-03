public abstract class Computer implements Item{
	private String brand = "none";
	private float price;

	public Computer (String b, float p){
		if(b.length() >= 3 && b.length() <= 20){
			brand = b;
		}
		if (p >= 1 && p <= 1000){
			price = p;
		}
		else {
			price = 1;
		}
	}
	
	public void print(){
		System.out.println(brand + " " + price);
	}

	public String toString(){
		return (brand + " " + price);
	}
}
