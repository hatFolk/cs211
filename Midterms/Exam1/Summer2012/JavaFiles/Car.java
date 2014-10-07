// Part g
public class Car{
	// Part a
	String model;
	int mileage;

	// Part b
	public Car(){
		this.mileage = 0;
		this.model = "NONE";
	}

	// Part c
	public Car(String model, int mileage){
		// Part f -- error check
		if(mileage >= 0 && mileage < 100000){
			this.mileage = mileage;
		} else {
		// It doesn't say what to do in case the mileage doesn't fit.
		// I choose to make something up, since it doesn't matter.
		this.mileage = 0;
		}
		this.model = model
	}

	// Part d
	public String toString(){
		return this.model + "has mileage : " + this.mileage;
	}

	// Part e
	public void incMileage(){
		this.mileage++;
	}
}
