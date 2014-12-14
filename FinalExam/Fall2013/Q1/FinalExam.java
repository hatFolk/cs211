// Added "Final" classifier. Fulfills B.
// In general, fulfills D.
public final class FinalExam{
	int age;
	String name;

	public FinalExam(int age){
		// if age is negative, assign its inverse.
		// Fulfills A.
		this.age = (age<0) ? -1*age : age;
		name = "gosling"; // gosling is 7 characters. Fulfills C.
	}

	// Fulfills E.
	public boolean equals(Object other){
		try{
			FinalExam o = (FinalExam) other;
			return (o.name.equals(this.name) && o.age == this.age);
		} catch (Exception e){
			return false;
		}
	}
}
