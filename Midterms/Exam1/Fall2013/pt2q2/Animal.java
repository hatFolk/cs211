public class Animal{
	// Part a
	String species;
	int weight;

	// Part b
	public Animal(){
		this.species = "Arbitrary animal"; // Values in compliance to d
		this.weight = 1;
	}

	// Part c
	public void setSpecies(String newAlien){
		// In compliance to d
		if(newAlien.length >= 1 && newAlien.length < 20){
			this.species = newAlien;
		}
	}
	// Notice there isn't any error checking for weight
	// Since specs don't specify other ways to change weight--
	// You never -have- to worry about it
}
